<%--
  Created by IntelliJ IDEA.
  User: lafon
  Date: 2022-08-16
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>PageDErreur</title>
    <%@include file="/includes/head.jsp" %>
</head>
<body>
<%@include file="/includes/navbar.jsp"%>


<br><br>
<div class="alert alert-danger container" role="alert">
    <h3 class="text-center" style="color: red">Bravo !!!! Le système à planté .......<br><!-- comment --></h3>

</div>
<br>

<br>

<div class="container bg-secondary rounded-0">
    <div class="px-4 py-5 my-5 text-center">
        <img class="d-block mx-auto mb-4" src="./image/erreurImage.jpg">
        <h1 class="display-5 fw-bold text-light">!!! Erreur 404 !!!</h1>
        <div class="col-lg-6 mx-auto">
            <p class="lead mb-4 text-light">Quickly design and customize responsive mobile-first sites with Bootstrap, the world’s most popular front-end open source toolkit, featuring Sass variables and mixins, responsive grid system, extensive prebuilt components, and powerful JavaScript plugins.</p>
            <div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
                <a href="./index.jsp" class="btn btn-primary btn-lg px-4 gap-3">Home</a>
                <a href="./index.jsp" class="btn btn-primary btn-lg px-4">Maison</a>
            </div>
        </div>
    </div>
</div>

<div class="b-example-divider"></div>

<%@include file="/includes/footer.jsp"%>
</body>
</html>
