<%-- 
    Document   : admin
    Created on : 23-Nov-2021, 15:52:52
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="header.jsp" %>
    </head>
    <body>
        <div><h1 class="text-center">ENTER TRAIN DETAILS</h1></div>
        <div class="container card p-5">
            <form action="adminservlet" method="POST">
                <div class="form-group">
                    <label for="exampleInputEmail1">ENTER TRAIN NAME</label>
                    <input type="text"  name="trainname" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Your Name">

                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">ENTER TRAIN NUMBER</label>
                    <input type="text" name="trainnumber" class="form-control" id="exampleInputPassword1" placeholder=" Enter Email">
                </div>

                <div class="form-group">
                    <label for="exampleInputPassword1">TRAIN FROM</label>
                    <input type="text" name="trainfrom" class="form-control" id="exampleInputPassword1" placeholder="Enter Password">
                </div>

                <div class="form-group">
                    <label for="exampleInputPassword1">TRAIN TO</label>
                    <input type="text" name="trainto" class="form-control" id="exampleInputPassword1" placeholder="Enter Password">
                </div>
                <div class="form-group">
                <label for="exampleInputPassword1">SEATS</label>
                <input type="text" name="trainseat" class="form-control" id="exampleInputPassword1" placeholder="Enter Password">
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
