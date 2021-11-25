<%-- 
    Document   : registration
    Created on : 23-Nov-2021, 14:15:31
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
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
        <div><h1 class="text-center">REGISTRATION PAGE</h1></div>
        <div class="container card p-5">
            <form action="registerservlet" method="POST">
            <div class="form-group">
                <label for="exampleInputEmail1">Enter your Name</label>
                <input type="text"  name="username" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Your Name">

            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Enter your Email</label>
                <input type="email" name="useremail" class="form-control" id="exampleInputPassword1" placeholder=" Enter Email">
            </div>
                
                            <div class="form-group">
                <label for="exampleInputPassword1"> Enter Your Password</label>
                <input type="password" name="userpass" class="form-control" id="exampleInputPassword1" placeholder="Enter Password">
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
