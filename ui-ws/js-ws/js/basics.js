function displayTable(){

    let idNum = document.getElementById('idNum');
    if(idNum.value === ''){
        alert('Please enter a number');
        return;
    }else{
        let num = parseInt(idNum.value);
        let str = "<ul class='list-group'>";
        for(let i = 1; i <= 10; i++){
            str += `<li class="list-group-item">${num} * ${i} = ${num * i}</li>`;
        }
        str += '</ul>';
        document.getElementById('idShowTable').innerHTML = str;
    }
    
}

let person = {
    name : 'John',
    age : 23,
    email: 'john@gmail.com',
    address : {
        city : 'Bangalore',
        state : 'Karnataka'
    }
}

let str = `<div class="card" style="width: 18rem;" >
<img src="images/GToutline.png" class="card-img-top" alt="...">
<div class="card-body">
  <h5 class="card-title">${person.name}</h5>
  <p class="card-text">
    Email: ${person.email}<br/>
    Address:<br/>
        &nbsp;&nbsp;City: ${person.address.city}<br/>
        &nbsp;&nbsp;State:${person.address.state}<br/>
    </p>
   <a href="#" class="btn btn-primary">Go somewhere</a>
</div>
</div>`;

document.getElementById('idPersonDetails').innerHTML = str;
