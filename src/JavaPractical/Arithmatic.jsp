<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*;" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
  <!--  save as a Arithmetic.jsp program
	contain different arithmetic operation-->
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=UTF-8">
<title>R4R Tech Soft</title>
</head>
<body>
<h1 style="color: green; font-style: inherit">
		Hello R4R Tech Soft! Arithmetic Operation</h1>
<!javascript is used for checked the validation>
<script>
function check(){
if(document.Arithmetic.firstDigit.value==null|
				|document.Arithmetic.firstDigit.value=="")
{
alert("Please Enter the value of X:");
return false;
}else
if(document.Arithmetic.secondDigit.value==null||
				document.Arithmetic.secondDigit.value=="")
{
alert("Please Enter the value of Y:");
return false;
}
else{document.Arithmetic.submit();}
}
</script>
<form action="#" name="Arithmetic">

<BR>Enter the  first digit: X
<input type="text" name="firstDigit" value="" size="20" >
<BR><BR>Enter the second digit: Y
<input type="text" name="secondDigit" value="" size="20" >
<BR><BR>
&nbsp;&nbsp; <input type="submit" value=" submit"
		name="submit" onclick="check()">
</form>
<%
if (request.getParameter("submit") != null) {
//Take the value of x & y and  Type Conversion
String s = (String) request.getParameter("firstDigit");
int x = Integer.parseInt(s);
String s1 = (String) request.getParameter("secondDigit");
int y = Integer.parseInt(s1);
//Arithmetic operation
int Sum = x + y;
{
out.println("<BR> Additon of X and Y = " + Sum);
int Substraction = x - y;
out.println("<BR> Substraction of X and Y = "
						+ Substraction);
float Division = x / y;
out.println(" <BR>Division of X and Y = "+ Division);
int Mulitplication = x * y;
out.println("<BR> Mulitplication of X and Y = "
							+ Mulitplication);
out.print("<br/>");
}
out.print("<BR>");
for (int i = 0; i <= x; i++) {
if ((i % 2) == 0) {
out.print(" Even number of X : " + i);
out.print("<br>");
}
}
out.print("<BR>");
for (int i = 0; i <= x; i++) {
if ((i % 2) != 0) {
out.print(" Odd number of X :" + i);
out.print("<br>");
}
}
}