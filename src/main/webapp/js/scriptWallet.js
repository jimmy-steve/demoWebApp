/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */
const wallet = document.getElementById("btc-wallet-total");

const price = document.getElementById("btc-current-price");
const price1 = document.getElementById("bnb-current-price");
const price2 = document.getElementById("eth-current-price");


const button = document.getElementById("refresh");
const button1 = document.getElementById("refresh1");
const button2 = document.getElementById("refresh2");


button.onclick = function () {

    fetch("https://api.binance.com/api/v3/ticker/24hr?symbol=BTCUSDT")
        .then(response => response.json())
        .then(data => {
            price.innerHTML = data.lastPrice;
            fetch("wallet/BTC")
                .then(response2 => response2.json())
                .then(data2 => {
                    wallet.innerHTML = data2.total * data.lastPrice;
                });
        });

}


button1.onclick = function () {

    fetch("https://api.binance.com/api/v3/ticker/24hr?symbol=BNBUSDT")
        .then(response => response.json())
        .then(data => {
            price1.innerHTML = data.lastPrice;
            fetch("wallet/BNB")
                .then(response2 => response2.json())
                .then(data2 => {
                    wallet.innerHTML = data2.total * data.lastPrice;
                });
        });

}

button2.onclick = function () {

    fetch("https://api.binance.com/api/v3/ticker/24hr?symbol=ETHUSDT")
        .then(response => response.json())
        .then(data => {
            price2.innerHTML = data.lastPrice;
            fetch("wallet/ETH")
                .then(response2 => response2.json())
                .then(data2 => {
                    wallet.innerHTML = data2.total * data.lastPrice;
                });
        });

}

function myF() {
    $('#mySelect').append($('<option>').val('head').text('Head'));
}

/*
 Pour la version serveur
 fetch("wallet/BTC")
 .then(response => response.json())
 .then(data => {
 price.innerHTML=data.price;
 wallet.innerHTML=data.total*data.price;
 });
 }*/