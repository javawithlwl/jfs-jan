
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
                </tr>`;
        contacts.forEach(contact => {
            str += `<tr>
                        <td>${contact.name}</td>
                        <td>${contact.email}</td>
                        <td>${contact.mobile}</td>
                    </tr>`;
        });
        str += '</table>';
        document.getElementById('idShowContacts').innerHTML = str;
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
}

getContacts();

