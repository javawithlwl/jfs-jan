
function getCountryInformation(){
    fetch('https://restcountries.com/v3.1/all').then(response => {
        response.json().then(data => {
           let countryInfo = data;
           showRegionDetails(countryInfo); 
           top5CountriesByPopulation(countryInfo);
           showCountryInfo(countryInfo);
        });
    });
}

function showCountryInfo(countryInfo){

        let idCountryDetails = document.getElementById('idCountryDetails');
        let str = "<table class='table table-striped'>";
        str += `<tr>
                    <th>Country</th>
                    <th>CCN3</th>
                    <th>Region</th>
                    <th>UN Member</th>
                    <th>Independence</th>
                    <th>Population</th>
                    <th>Flag</th>
                </tr>`;
        countryInfo.forEach(country => {
            str += `<tr>
                        <td>${country.name.common}</td>
                        <td>${country.ccn3}</td>
                        <td>${country.region}</td>
                        <td>${country.unMember ? 'Yes' : 'No'}</td>
                        <td>${country.independent ? 'Yes' : 'No'}</td>
                        <td>${country.population}</td>
                        <td><img src='${country.flags.svg}' width='80' height='50'/></td>
                    </tr>`;
        }
        );
        str += '</table>';
        idCountryDetails.innerHTML = str;

}
function searchCountryDetails(){
    let searchCountry = document.getElementById('idCountry').value;
    console.log(searchCountry);
    fetch(`https://restcountries.com/v3.1/name/${searchCountry}`).then(response => {
        response.json().then(data => {
            let countryInfo = data;
            showCountryInfo(countryInfo);
        });
    });

}
function top5CountriesByPopulation(countryInfo){
    let top5Countries = countryInfo.sort((a, b) => b.population - a.population).slice(0,5);
    showTop5CountriesInTable(top5Countries);

}
function showTop5CountriesInTable(top5Countries){
    let idTop5PopulatedCountries = document.getElementById('idTop5PopulatedCountries');
    let str = "<table class='table table-striped'>";
    str += `<tr>
                <th>Country</th>
                <th>Region</th>
                <th>Independence</th>
                <th>Population</th>
            </tr>`;
    top5Countries.forEach(country => {
        str += `<tr>
                    <td>${country.name.common}</td>
                    <td>${country.region}</td>
                    <td>${country.independent ? 'Yes' : 'No'}</td>
                    <td>${country.population}</td>
                </tr>`;
    });
    str += '</table>';
    idTop5PopulatedCountries.innerHTML = str;

}

function showRegionDetails(countryInfo){
    let regionMap = new Map();
    countryInfo.forEach(country => {
        if(regionMap.has(country.region)){
            let region = regionMap.get(country.region);
            regionMap.set(country.region, {"region": country.region,"count":region.count + 1,"population":region.population + country.population});
        }else{
            regionMap.set(country.region, {"region": country.region,"count":1,"population":country.population});
        }
    });
    showRegionDetailsInTable(regionMap.values());
 
}
function showRegionDetailsInTable(regionDetails){
    let idRegionDetails = document.getElementById('idRegionDetails');
    // sort by population
    regionDetails =  Array.from(regionDetails).sort((a, b) => b.population - a.population);
    let str = "<table class='table table-striped'>";
    str += `<tr>
                <th>Region</th>
                <th>Count</th>
                <th>Population</th>
            </tr>`;
    regionDetails.forEach(regionDetail => {
        str += `<tr>
                    <td>${regionDetail.region}</td>
                    <td>${regionDetail.count}</td>
                    <td>${regionDetail.population}</td>
                </tr>`;
    });
    str += '</table>';
    idRegionDetails.innerHTML = str;
}
getCountryInformation();