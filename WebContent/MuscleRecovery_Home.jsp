
<%@page import="java.util.List"%>
<%@page import="musclerecoverywebserver.service.Login"%>
<%@page import="musclerecoverywebserver.model.Tbluser"%>

<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>MuscleRecovery - Home</title>
<style type="text/css">
  body {
    color: black; background-color: white;
    font-size: 100.01%;
    font-family: Helvetica,Arial,sans-serif;
    margin: 0; padding: 1em;
  }

  ul#Navigation {
    font-size: 0.91em;
    float: left; width: 22em;
    margin: 0; padding: 0;
    border: 1px dashed silver;
  }
  ul#Navigation li {
    list-style: none;
    margin: 0; padding: 0.5em;
  }
  ul#Navigation a {
    display: block;
    padding: 0.2em;
    font-weight: bold;
  }
  ul#Navigation a:link {
    color: black; background-color: #eee;
  }
  ul#Navigation a:visited {
    color: #666; background-color: #eee;
  }
  ul#Navigation a:hover {
    color: black; background-color: white;
  }
  ul#Navigation a:active {
    color: white; background-color: gray;
  }

  div#Inhalt {
    margin-left: 22em;
    padding: 0 1em;
    border: 1px dashed silver;
    min-width: 16em; /* Mindestbreite (der Ueberschrift) verhindert Anzeigefehler in modernen Browsern */
  }
  div#Inhalt h1 {
    font-size: 1.5em;
    margin: 0 0 1em;
  }
  div#Inhalt h2 {
    font-size: 1.2em;
    margin: 0 0 1em;
  }
  div#Inhalt p {
    font-size: 1em;
    margin: 1em 0;
  }
</style>
</head>
<body>

<ul id="Navigation">
  <li><a href="MuscleRecovery_FAQ.jsp">FAQs</a></li>
  <li><a href="MuscleRecovery_HighscoreOverview.jsp">Highscores</a></li>
  <li><a href="MuscleRecovery_Trainingsplaene.jsp">Trainingspläne</a></li>
  <li><a href="MuscleRecovery_UserStatistics.jsp">User Statistiken</a></li>
</ul>

<div id="Inhalt">
  <h1>Muscle Recovery Home</h1>
  <h2>
            <%
/*             	System.out.println("ini user");
            	Tbluser user = (Tbluser) session.getAttribute("emailaddress");
            	System.out.println("ini user complete"); */
            %>
            <b>Willkommen <%-- <%= user.getNickname()%> --%></b>
  </h2>
  <img src="images/2_scaled.png" alt="MuscleRecoveryLogo"></p>
  <p>Bavaria ipsum dolor sit amet ned woar schoo hea, Obazda a Hoiwe gor obacht? 
  Amoi Radi Schdeckalfisch, bittschön hawadere midananda gwihss? Hoid 
  Schdeckalfisch Steckerleis, nix Radler i bin a woschechta Bayer nix Gwiass 
  woass ma ned wia da Buachbinda Wanninger! Bradwurschtsemmal gschmeidig 
  hallelujah sog i, luja Enzian um Godds wujn dringma aweng Weiznglasl hob hogg 
  di hera is Vergeltsgott. Schnacksln luja gwiss umananda von, i moan oiwei 
  Schaung kost nix anbandeln Blosmusi resch. Ned ebba zwoa, sei Maibam obacht. 
  Ghupft wia gsprunga Spezi aba guad gwihss gar nia need mogsd a Bussal Xaver 
  nimma auszutzeln jo leck mi! Bitt obacht Mamalad, Deandlgwand nia need. Kirwa 
  nix hod, hawadere midananda! Aba Heimatland Gidarn hawadere midananda 
  hallelujah sog i, luja no anbandeln, do dahoam imma Haberertanz. </p>
</div>

<p><a href="MuscleRecovery_Logout.jsp">Logout</a></p>
</body>
</html>