<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    		<div class="col-md-8 offset-md-2">
    			<a href="index.html">Home</a>
    			<table class="table">
    				<thead>
    					<tr>
    						<th>Id</th>
    						<th>Name</th>
    						<th>Email</th>
    						<th>Mobile</th>
    					</tr>
    				</thead>
    				<tbody>
    				
    				<c:forEach items="${contacts}" var="contact">
    					<tr>
    						<td>${contact.cid}</td>
    						<td>${contact.name}</td>
    						<td>${contact.email}</td>
    						<td>${contact.mobile}</td>
    					</tr>
    				</c:forEach>
    					
    				</tbody>	
    			</table>
    		
    			
    		</div>
    	</div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>