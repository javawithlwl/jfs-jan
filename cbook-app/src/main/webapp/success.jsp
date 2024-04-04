<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Contact Information</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  </head>
  <body>
    <div class="py-2 bg-danger text-white text-center">
    	<h3>Contact Book</h3>
    	<p>
    		Contact book application will allow you to manage your contacts.
    	</p>
    </div>
    <div class="container">
		<div class="row mt-2">
			<a href="index.html">Home</a>
			
			<p> Contact is added with id : ${param.cid} , to view all contact <a href="cbook">Show Contacts</a><br/>
			
		</div>    	
    </div>

</body>
</html>