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
			<div class="col-md-6 offset-md-3">
				<form action="addcontact" method="post">
			    <div class="mb-2">
                    <input type="hidden" id="idContactId">
                </div>    
                <div class="mb-2">
                    <label for="idName" class="form-label">Name</label>
                    <input type="text" class="form-control" id="idName" name="name" placeholder="Enter the name">
                </div>
                <div class="mb-2">
                    <label for="idEmail" class="form-label">Email</label>
                    <input type="email" class="form-control" id="idEmail" name="email" placeholder="Enter the email">
                </div>
                <div class="mb-2">
                    <label for="idPhone" class="form-label">Phone</label>
                    <input type="text" class="form-control" id="idPhone" name="mobile" placeholder="Enter the phone">    
                 </div>
            	 <div class="mb-2">
            	 	<input type="submit" value="Submit" class="btn btn-primary">
            	 	<input type="reset" value="Reset" class="btn btn-primary">
            	 </div>     
                 </form>
  			</div>			
			</div>
		</div>    	
    </div>

</body>
</html>