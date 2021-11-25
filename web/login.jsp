<%-- 
    Document   : login
    Created on : 23-Nov-2021, 15:21:40
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="header.jsp" %>
        <style>


            body{
                background-color: #1ac8db;
            }
            .borderfom{
                border: 2px solid red;
            }
        </style>
    </head>
    <body>
        <div><h1 class="text-center">LOGIN PAGES</h1></div>
        <div class="container card p-5">
            <form action="loginservlet" method="POST">
            <div class="form-group">
                <label for="exampleInputEmail1">Email address</label>
                <input type="email"  name="useremail" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
               </div>
            <div class="form-group">
                <label for="exampleInputPassword1"> Enter Password</label>
                <input type="password"  name="userpass"class="form-control" id="exampleInputPassword1" placeholder="Password">
            </div>
            <div class="form-check">
                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                <label class="form-check-label" for="exampleCheck1">Check me out</label>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
        </div>
    </body>
</html>
