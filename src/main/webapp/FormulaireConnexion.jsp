<%--
  Created by IntelliJ IDEA.
  User: lafon
  Date: 2022-08-16
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <%@include file="/includes/head.jsp"%>
</head>
<body>
<%@include file="/includes/navbar.jsp"%>
<br>
<br>

<div class="container ">
    <div class="row rounded-2">
<div class="col-4 bg-dark text-light my-5 rounded-2 border" style="border-radius: 20px">
    <br>


        <form action="ConnexionServlet" method="post">
            <div class="form-group row">
                <label for="inputNom" class="col-sm-2 col-form-label">Nom</label>
                <div class="col-sm-10">
                    <input type="text" name="nom" class="form-control" id="inputNom" placeholder="Nom">
                </div>
            </div>
            <div class="form-group row">
                <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
                <div class="col-sm-10">
                    <input type="password" name="motDePasse" class="form-control" id="inputPassword3" placeholder="Password">
                </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-10">
                    <button type="submit" class="btn btn-primary">Sign in</button>
                </div>
            </div>
        </form>
</div>

        <br><br>






    </div>
</div>

<%@include file="/includes/footer.jsp"%>
</body>
</html>
