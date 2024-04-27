<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!--  Step 1:- Create the html form -->

<form action="todo-demo.jsp">
	Add new item: <input type = "text" name = "theItem" />
	
	<input type = "submit" value = "submit" />
	
</form>

<br>

<!--  Step 2:- Add new item to "To Do" list -->

<%
   // get the to Do iteams from the session
   List<String> items = (List<String>) session.getAttribute("myToDoList");
   // if the To Do item dosen't exist then create a new item
   if(items == null){
	   items = new ArrayList<String>();
	   session.setAttribute("myToDoList", items);
   }
   // see if there is form data to add
   String theItem = request.getParameter("theItem");
   if(theItem != null){
	   items.add(theItem);
   }
%>

<!--  Step 3:- Display all "To Do" items from the session -->

	<hr>
	<b>To List Items: </b><br>
	
	<ol>
	<%
		for(String temp : items){
			out.println("<li>" + temp + "</li>");
		}
	
	
	%>
	</ol>




</body>
</html>