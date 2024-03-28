google.charts.load('current', {'packages':['corechart']});
loadPlayers();
function loadPlayers(){
    fetch('data/players.json').then(response => {
        response.json().then(data => {
            let players = data;            
            // Get all the team name
            let teamNames = getTeamNames(players);
            showTeamNames(teamNames);
            showIplStats(players);
            showTeamStats(players);
        });
        
    });
}

function showTeamStats(players){
    let teamAmountMap = new Map();
    let roleAmountMap = new Map();
    let roleCountMap = new Map();
    players.forEach(player => {
        if(teamAmountMap.has(player.teamName)){
            let amount = teamAmountMap.get(player.teamName);
            teamAmountMap.set(player.teamName, amount + player.amount);
        }else{
            teamAmountMap.set(player.teamName, player.amount);
        }
        if(roleAmountMap.has(player.role)){
            let amount = roleAmountMap.get(player.role);
            roleAmountMap.set(player.role, amount + player.amount);
        }else{
            roleAmountMap.set(player.role, player.amount);
        }
        if(roleCountMap.has(player.role)){
            let count = roleCountMap.get(player.role);
            roleCountMap.set(player.role, count + 1);
        }else{
            roleCountMap.set(player.role, 1);
        }
    });
    showTeamAmountStatsDetails(teamAmountMap);
    showRoleAmountStatsDetails(roleAmountMap);
    showRoleCountStatsDetails(roleCountMap);

}

function showRoleCountStatsDetails(roleCountMap){
    let inputData = [['Role', 'Count']];
    
    roleCountMap.forEach((value, key) => {
        inputData.push([key, value]);
    }); 
    console.log(inputData);
    var data = google.visualization.arrayToDataTable(inputData);
    var options = {
    title: 'Role Count Stats',
    width: 400,
    height: 300,
    };
    var chart = new google.visualization.ColumnChart(document.getElementById('idRoleCountStats'));
    chart.draw(data, options);
}

function showRoleAmountStatsDetails(roleAmountMap){
         let inputData = [['Role', 'Amount']];
    
          roleAmountMap.forEach((value, key) => {
                inputData.push([key, value]);
          }); 
          console.log(inputData);
          var data = google.visualization.arrayToDataTable(inputData);
          var options = {
          title: 'Role Stats',
          width: 400,
          height: 300,
          };
          var chart = new google.visualization.PieChart(document.getElementById('idRoleAmountStats'));
          chart.draw(data, options);
}

function showTeamAmountStatsDetails(teamAmountMap){
       let inputData = [['Team', 'Amount']];

        teamAmountMap.forEach((value, key) => {
            inputData.push([key, value]);
        }); 
        console.log(inputData);
        var data = google.visualization.arrayToDataTable(inputData);
        var options = {
        title: 'Team Stats',
        width: 400,
        height: 300,
        };
        var chart = new google.visualization.ColumnChart(document.getElementById('idTeamAmountStats'));
        chart.draw(data, options);
       
}

function showIplStats(players){
   showTeamAmountStats(players);
   showRoleAmountStats(players);
}
function showRoleAmountStats(players){
}
function showTeamAmountStats(players){
}

function showTeamNames(teamNames){
    let idTeamSelect = document.getElementById('idTeamSelect');
    let str = '<select class="form-control" onchange="showPlayers()" id="idTeamName">';
    teamNames.forEach(teamName => {
        str += `<option value=${teamName}>${teamName}</option>`;
    });
    str += '</select>';
    idTeamSelect.innerHTML = str;
}

function getTeamNames(playerList){
    let teamNames = [];
    playerList.forEach(player => {
        if(!teamNames.includes(player.teamName)){
            teamNames.push(player.teamName);
        }
    });
    return teamNames;
}

function showPlayers(){
    let teamName = document.getElementById('idTeamName').value;
    fetch('data/players.json').then(response => {
        response.json().then(data => {
            console.log(data);
            let players = data;            
            let playersList = getPlayersByTeam(players, teamName);
            displayTeamInfo(playersList);
        });
        
    });
}   
function displayTeamInfo(players){
    displayPlayers(players);
    displayTeamRoleAmount(players);
    displayTeamRoleCount(players);
}

function displayTeamRoleCount(players){
    let roleCountMap = new Map();
    players.forEach(player => {
        if(roleCountMap.has(player.role)){
            let count = roleCountMap.get(player.role);
            roleCountMap.set(player.role, count + 1);
        }else{
            roleCountMap.set(player.role, 1);
        }
    });
    let data = [["Role", "Count"]];
    roleCountMap.forEach((value, key) => {
        data.push([key, value]);
    });
    google.charts.setOnLoadCallback(drawRoleCountChart(data));
}
function displayTeamRoleAmount(players){
    let roleAmountMap = new Map();
    players.forEach(player => {
        if(roleAmountMap.has(player.role)){
            let amount = roleAmountMap.get(player.role);
            roleAmountMap.set(player.role, amount + player.amount);
        }else{
            roleAmountMap.set(player.role, player.amount);
        }
    });
    let data = [["Role", "Amount"]];
    roleAmountMap.forEach((value, key) => {
        data.push([key, value]);
    });
    google.charts.setOnLoadCallback(drawRoleAmountChart(data));

     
}
function displayPlayers(players){

        let idShowPlayers = document.getElementById('idShowPlayers');
        let str = '<table class="table table-striped">';
        str += '<tr><th>Player Name</th><th>Role</th><th>Amount</th></tr>';
        players.forEach(player => {
            str += `<tr>
                        <td>${player.name}</td>
                        <td>${player.role}</td>
                        <td>${player.amount}</td>
                    </tr>`;
        });
        str += '</table>';
        idShowPlayers.innerHTML = str;
    
}

function getPlayersByTeam(players, teamName){
    let playersList = [];
    console.log(players);
    players.forEach(player => {
        if(player.teamName === teamName){
            playersList.push(player);
        }
    });
    console.log(playersList);
    return playersList;
}

function drawRoleCountChart(inputData) {
    var data = google.visualization.arrayToDataTable(inputData);
    var options = {
      title: 'Player Count Of Each Role',
      width: 400,
      height: 300,
    };
    var chart = new google.visualization.ColumnChart(document.getElementById('idBarChartRoleCount'));
    chart.draw(data, options);
}
function drawRoleAmountChart(inputData) {
    var data = google.visualization.arrayToDataTable(inputData);
    var options = {
      title: 'Player Amount Of Each Role',
      width: 400,
      height: 300,
    };
    var chart = new google.visualization.PieChart(document.getElementById('idPieChartRoleAmount'));
    chart.draw(data, options);
}

      