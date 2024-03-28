console.log('todo.js loaded');

function showPostDetails(){
  fetch('https://jsonplaceholder.typicode.com/posts/1')
  .then((response) => response.json())
  .then((json) => console.log(json));
}
function showAllPosts(){
    fetch('https://jsonplaceholder.typicode.com/posts')
  .then((response) => response.json())
  .then((json) => console.log(json));
}
function createNewPost(){
fetch('https://jsonplaceholder.typicode.com/posts', {
  method: 'POST',
  body: JSON.stringify({
    title: 'foo',
    body: 'bar',
    userId: 1,
  }),
  headers: {
    'Content-type': 'application/json; charset=UTF-8',
  },
})
  .then((response) => response.json())
  .then((json) => console.log(json));
}

function updatePost(){
    fetch('https://jsonplaceholder.typicode.com/posts/100', {
      method: 'PUT',
      body: JSON.stringify({
        title: 'foo updated',
        body: 'bar updated',
        userId: 1,
        id: 100
      }),
      headers: {
        'Content-type': 'application/json; charset=UTF-8',
      },
    })
      .then((response) => response.json())
      .then((json) => console.log(json));
    }
showPostDetails();
showAllPosts();
createNewPost();
updatePost();