<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
	 <link rel="stylesheet" type="text/css" href="style.css">
	 <title>logout Page</title>
</head>
<body>
	 <%		
		 session.removeAttribute("emailaddress");
		 session.removeAttribute("password");
		 session.invalidate();
	 %>
<center>
	 <h1>Logout erfolgreich !</h1>
	 Um sich erneut anzumelden <a href="MuscleRecovery_Login.jsp">klicken Sie hier</a>.
</center>
</body>
</html>