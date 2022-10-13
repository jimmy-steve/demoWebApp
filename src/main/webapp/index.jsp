<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Pratique Hibernate/MAven/WebApp/Java</title>
    <%@include file="/includes/head.jsp"%>
</head>
<body>
<%@include file="/includes/navbar.jsp"%>

<div class="container">
    <div class="card-header my-3"> commande d'un gâteau d'anniversaire pour enfants </div>











</div>



<br>
<div class="container">
    <div class="card-header my-3"> commande d'un gâteau d'anniversaire pour enfants </div>
    <div class="row" >
        <div class="col-5">



            <form action="AnniversaireServlet" method="post" name="formulaire" >

                <table class="table table-striped table-hover table-bordered">
                    <thead>
                    <tr>
                        <th colspan="2" class="text-center">Saisir votre commande</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>Nom : </td>
                        <td><input type="text" name="nom" value="" /></td>
                    </tr>
                    <tr>
                        <td>Prénom : </td>
                        <td><input type="text" name="prenom" value="" /></td>
                    </tr>
                    <tr>
                        <td>Adresse : </td>
                        <td><input type="text" name="adresse" value="" /></td>
                    </tr>
                    <tr>
                        <td>Thèmes</td>
                        <td>
                            <input type="radio" name="theme" value="spiderman" /><span>Spiderman</span><br>
                            <input type="radio" name="theme" value="transformer" /><span>Transformer</span><br>
                            <input type="radio" name="theme" value="barbie" /><span>Barbie</span>
                        </td>
                    </tr>
                    <tr>
                        <td>Glacage</td>
                        <td>
                            <input type="radio" name="glacage" value="chocolat" /><span>Chocolat</span><br>
                            <input type="radio" name="glacage" value="vanille" /><span>Vanille</span><br>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" class="text-center">
                            <input type="submit" value="Envoyer" />
                        </td>
                    </tr>

                    </tbody>
                </table>


            </form>
            <br>
        </div>
    </div>
</div>














<%--Section CryptoMonnaie--%>
<%--affichage du prix en temps réel de la monnaie a l'aide d'un api--%>
<br>
<div class="container">
    <div class="card-header my-3">Les CryptoWallet </div>
    <div class="row" >
        <div class="col">
            <div class="d-flex p-2">
                <div class="card" style="width: 16rem;">
                    <img class="card-img-top" src="./image/btc.jpg">
                    <div class="card-body">
                        <h5 class="card-title">Bitcoin</h5>
                        <p class="card-text">The current BTC price is <strong><span id="btc-current-price"></span></strong></p>
                        <p class="card-text">You currently own<strong></strong></p>
                        <a href="#" id="refresh" class="btn btn-primary">Refresh</a>
                    </div>
                </div>
            </div>
        </div>


        <div class="col">
            <div class="d-flex p-2">
                <div class="card" style="width: 16rem;">
                    <img class="card-img-top" src="./image/bnb.jpg">
                    <div class="card-body">
                        <h5 class="card-title">BNB</h5>
                        <p class="card-text">The current BNB price is <strong><span id="bnb-current-price"></span></strong></p>
                        <p class="card-text">You currently own <strong><span id="bnb-wallet-total"></span></strong></p>
                        <a href="#" id="refresh1" class="btn btn-primary">Refresh</a>
                    </div>
                </div>
            </div>
        </div>

        <div class="col">

            <div class="d-flex p-2">
                <div class="card" style="width: 16rem;">
                    <img class="card-img-top" src="./image/eth.jpg">
                    <div class="card-body">
                        <h5 class="card-title">Ethereum</h5>
                        <p class="card-text">The current ETH price is <strong><span id="eth-current-price"></span></strong></p>
                        <p class="card-text">You currently own <strong><span id="eth-wallet-total"></span></strong></p>
                        <a href="#" id="refresh2" class="btn btn-primary">Refresh</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<br>



<%--Plusieurs module de pratique--%>
    <div class="container">
        <div class="card-header my-3">Plusieurs modules de pratique</div>
        <br>
        <br>
        <div class="row">

            <div class="container">
                <div class="row">
                    <div class="row row-cols-1 row-cols-md-2 g-4">
                        <div class="col">
                            <div class="card">
                                <div class="card-body">
                                    <h5 class="card-title">Module de Requête</h5>
                                    <table border="1">
                                        <thead>
                                        <tr>
                                            <td>Val1</td>
                                            <td><input type="text" name="val1" value=""/></td>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>Val2</td>
                                            <td><input type="text" name="val2" value=""/></td>
                                        </tr>
                                        <tr>
                                            <td>Val3</td>
                                            <td><input type="text" name="val3" value=""/></td>
                                        </tr>
                                        <tr>
                                            <td>Val4</td>
                                            <td><input type="text" name="val4" value=""/></td>
                                        </tr>
                                        </tbody>
                                    </table>

                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">


                            <form action="TemperatureServlet" name="ConversionTemp" method="get">

                                <table class="table-sm table-dark text-center" border="2" cellspacing="1"
                                       cellpadding="1">
                                    <thead>
                                    <tr>
                                        <th colspan="2">Conversion de température</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>Valeur à convertir</td>
                                        <td>
                                            <input type="text" name="temp" value=""/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Vers</td>
                                        <td>
                                            <input type="radio" name="choix" value="celcius"/><span>Celcius</span><br>
                                            <input type="radio" name="choix" value="fahr"/><span>Fahrenheit</span>

                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2">
                                            <div class="text-center">
                                                <input class=" btn btn-danger " type="submit" value="Envoyer"/>
                                            </div>
                                        </td>
                                    </tr>
                                    </tbody>
                                </table>
                            </form>


                        </div>
                        <div class="col-md-4">


                            <form action="TraitementIMC" name="imc" method="Post">

                                <table class="table-sm table-warning text-center" border="2" cellspacing="1"
                                       cellpadding="1">
                                    <thead>
                                    <tr>
                                        <th colspan="2">Calculateur IMC</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>Nom :</td>
                                        <td>
                                            <input type="text" name="nom" value=""/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Taille :</td>
                                        <td>
                                            <input type="text" name="taille" value=""/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Poids :</td>
                                        <td>
                                            <input type="text" name="poids" value=""/>
                                        </td>
                                    </tr>
                                    <tr>
                                    <tr>
                                        <td colspan="2">
                                            <div class="text-center">
                                                <input class=" btn btn-danger " type="submit" value="Envoyer"/>
                                            </div>
                                        </td>
                                    </tr>
                                    </tbody>
                                </table>
                            </form>


                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
    <br>
    <br>
    <br>
    <br>

<%@include file="/includes/footer.jsp"%>
</body>
</html>