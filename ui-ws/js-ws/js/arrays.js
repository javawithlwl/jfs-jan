let persons = [
    { name: 'John', age: 23},
    { name: 'Doe', age: 25},
    { name: 'Smith', age: 30},
    { name: 'Alex', age: 28 },
    { name: 'Mike', age: 35 }
];

persons.push({ name: 'Peter', age: 40 });

let str = '<ul class="list-group">';
persons.forEach((person) => {
    str += `<li class="list-group">${person.name} - ${person.age}</li>`;
});
str += '</ul>';
document.getElementById('idUserNames').innerHTML = str;

let todos = [];

function addTodo(event) {
    console.log(event);
    if (event.keyCode === 13) {
        let todo = document.getElementById('idTask').value;
        todos.push(todo);
        document.getElementById('idTask').value = '';
        showTodos();
    }
};

function showTodos() {

    if(todos.length === 0){
        document.getElementById('idShowTodos').innerHTML = 'Three are no todos';
        return;
    }else{
        let str = "<table class='table table-striped'>";
        todos.forEach((todo, index) => {
            str += `<tr>
                        <td>${index + 1}</td>
                        <td>${todo}</td>
                        <td><i class='fa fa-edit'></i></td>
                        <td><i class='fa fa-trash' onclick='deleteItem(${index})'></i></td>
                        
                    </tr>`;
        });
        str += '</table>';
        document.getElementById('idShowTodos').innerHTML = str;
    }
}
showTodos();

function deleteItem(index){
    if(confirm('Are you sure you want to delete ? '+todos[index])){
        todos.splice(index, 1);
        showTodos();
    }
}