<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="login" method="post"  action="login.do" >
		<div class="form-group">
			<input type="text" class="form-control" name="memberEmail" placeholder="Email"  id= "email" required="required">		
		</div>
		<div class="form-group mt-3">
			<input type="password" class="form-control" name="memberPass" placeholder="Password" required="required">	
		</div>   
		 
		<div class="form-check mt-3">
		<label class="form-check-label" for="rememberEmail">Email 기억하기:</label>
			<input type="checkbox" class="form-check-input" name="rememberEmail" placeholder="rememberEmail" id="rememberEmail" > 
			
		</div> 
		     
		<div class="form-group text-center mt-5">
		    <input type="text" name="returnUrl" value="${param.returnUrl}" /> 
				<button type="submit" class="btn btn-dark btn-lg btn-block login-btn" >Login</button>
		</div>
	</form>
</body>
</html>