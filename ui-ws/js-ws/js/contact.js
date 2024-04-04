
let baseUrl = 'https://cbook-app.onrender.com/api/contact';
function getContacts(){
        fetch(baseUrl + '/all').then(response => {
            response.json().then(data => {
                let contacts = data;
                showContacts(contacts);
            });
        });
}
function showContacts(contacts){
    if(contacts.length == 0){
        document.getElementById('idShowContacts').innerHTML = 'No contacts found';
    }else{
        let str = "<table class='table table-striped'>";
        str += `<tr>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Mobile</th>
                    <th>Edit/Delete</th>
                </tr>`;
        contacts.forEach(contact => {
            str += `<tr>
                        <td>${contact.name}</td>
                        <td>${contact.email}</td>
                        <td>${contact.mobile}</td>
                        <td>
                            <i class="fa fa-edit" onclick="editContact('${contact.cid}','${contact.name}')"/> &nbsp; &nbsp;
                            <i class="fa fa-trash" onclick="deleteContact('${contact.cid}','${contact.name}')"/>
                        </td>
                    </tr>`;
        });
        str += '</table>';
        document.getElementById('idShowContacts').innerHTML = str;
    }
}
function updateContact(){
    let id = document.getElementById('idContactId').value;
    let name = document.getElementById('idName').value;
    let email = document.getElementById('idEmail').value;
    let mobile = document.getElementById('idPhone').value;
    let contact = {"cid":id,"name":name, "email":email, "mobile":mobile};

    fetch(baseUrl, {
        method: 'PUT',
        body: JSON.stringify(contact),
        headers: {
            'Content-type': 'application/json; charset=UTF-8',
        },

    }).then((response) => {
        getContacts();
        document.getElementById('idAddBtn').style.display = 'block'; 
        document.getElementById('idUpdateBtn').style.display = 'none';
        document.getElementById('idName').value = '';
        document.getElementById('idEmail').value = '';
        document.getElementById('idPhone').value = '';
    });
}
function editContact(id,name){
    document.getElementById('idAddBtn').style.display = 'none'; 
    document.getElementById('idUpdateBtn').style.display = 'block';
    fetch(baseUrl + '/'+id).then(response => {
        response.json().then(data => {
            let contact = data;
            document.getElementById('idName').value = contact.name;
            document.getElementById('idEmail').value = contact.email;
            document.getElementById('idPhone').value = contact.mobile;
            document.getElementById('idContactId').value = contact.cid; 
        });
    });

}

function deleteContact(id,name){
    console.log('delete contact with id '+id);
    if(confirm('Are you sure you want to delete contact with name '+name+ '?')){
        fetch(baseUrl+'/'+id, {
            method: 'DELETE',
        }).then((response) => {
            getContacts();
        });
    }

}
function saveContact(contact){
    fetch(baseUrl, {
        method: 'POST',
        body: JSON.stringify(contact),
        headers: {
            'Content-type': 'application/json; charset=UTF-8',
        },
    })
    .then((response) => response.json())
    .then((json) => getContacts());
}

function addContact(){
    let name = document.getElementById('idName').value;
    let email = document.getElementById('idEmail').value;
    let mobile = document.getElementById('idPhone').value;
    let contact = {"name":name, "email":email, "mobile":mobile};
    saveContact(contact);
    document.getElementById('idName').value = '';
    document.getElementById('idEmail').value = '';
    document.getElementById('idPhone').value = '';
}

getContacts();

function searchContact(){
    let name = document.getElementById('idSearch').value;
    if(name !== ''){
       fetch(baseUrl + '/search/' + name).then(response => {
            response.json().then(data => {
                let contacts = data;
                showContacts(contacts);
            });
        }); 
    }else{
        getContacts();
    }
}