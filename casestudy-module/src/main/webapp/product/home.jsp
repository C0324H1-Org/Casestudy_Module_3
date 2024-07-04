<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Merriweather&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200"/>
    <style>
        .material-symbols-outlined {
            font-variation-settings: 'FILL' 0,
            'wght' 400,
            'GRAD' 0,
            'opsz' 24
        }
    </style>
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0"/>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<section class="home">
    <div class="content">
        <h1> <span>Iphone </span>
            <br>
            Up To 50% Off
        </h1>
        <p>The Event only takes play for 5 das
            <br>From 15/05/2024 to 20/05/2024
        </p>
        <div class="btn"><button>Shop Now</button></div>

    </div>
    <div class="img">
        <img src="/images/iphone-15-pro-gold-1-2-650x650.png.webp" alt="">
    </div>
</section>

<div class="container" id="product-cards1">
    <h1 class="text-center">IPhones</h1>
    <div class="row" style="margin-top: 30px;">
        <div class="col-md-3 py-3 py-md-0">
            <div class="card">
                <img src="/images/p6.png" alt="">
                <div class="card-body">
                    <h3 class="text-center">Iphone 13 pro</h3>
                    <p class="text-center">Lorem ipsum dolor sit amet.</p>
                    <div class="star text-center">
                        <i class="fa-solid fa-star checked"></i>
                        <i class="fa-solid fa-star checked"></i>
                        <i class="fa-solid fa-star checked"></i>
                        <i class="fa-solid fa-star checked"></i>
                        <i class="fa-solid fa-star checked"></i>
                    </div>
                    <h2>$1000 <button type="button" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
    <span class="material-symbols-outlined">add_shopping_cart
</span>
                    </button>

                 </h2>

                </div>
            </div>
        </div>
    </div>

</div>
<section class="home">
    <div class="content">
        <h1> <span>LapTop</span>
            <br>
            Up To 50% Off
        </h1>
        <p>The Event only takes play for 5 das
            <br>From 15/05/2024 to 20/05/2024
        </p>
        <div class="btn"><button>Shop Now</button></div>

    </div>
    <div class="img">
        <img src="/images/0025006_macbook-pro-13-inch-m2-10-core-8gb-ram-256gb-ssd-chinh-hang-cu-dep.png" alt="">
    </div>
</section>
<div class="container" id="product-cards1">
    <h1 class="text-center">IPhones</h1>
    <div class="row" style="margin-top: 30px;">
        <div class="col-md-3 py-3 py-md-0">
            <div class="card">
                <img src="/images/p6.png" alt="">
                <div class="card-body">
                    <h3 class="text-center">Iphone 13 pro</h3>
                    <p class="text-center">Lorem ipsum dolor sit amet.</p>
                    <div class="star text-center">
                        <i class="fa-solid fa-star checked"></i>
                        <i class="fa-solid fa-star checked"></i>
                        <i class="fa-solid fa-star checked"></i>
                        <i class="fa-solid fa-star checked"></i>
                        <i class="fa-solid fa-star checked"></i>
                    </div>
                    <h2>$1000 <span><li class="fa-solid fa-cart-shopping"></li></span></h2>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="container" id="other-cards">
    <div class="row">
        <div class="col-md-6 py-3 py-md-0">
            <div class="card">
                <img src="/images/c1.png" alt="">
                <div class="card-img-overlay">
                    <h3>Best Laptop</h3>
                    <h5>Latest Collection</h5>
                    <p>Up To 50% Off</p>
                    <button id="shopnow1">Shop Now</button>
                </div>
            </div>
        </div>
        <div class="col-md-6 py-3 py-md-0">
            <div class="card">
                <img src="/images/c2.png" alt="">
                <div class="card-img-overlay">
                    <h3>Best Headphone</h3>
                    <h5>Latest Collection</h5>
                    <p>Up To 50% Off</p>
                    <button id="shopnow2">Shop Now</button>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="container" id="offer">
    <div class="row">
        <div class="col-md-3 py-3 py-md-0">
            <i class="fa-solid fa-cart-shopping"></i>
            <h3>Free Shipping</h3>
            <p>On order over $1000</p>
        </div>
        <div class="col-md-3 py-3 py-md-0">
            <i class="fa-solid fa-rotate-left"></i>
            <h3>Free Returns</h3>
            <p>Within 30 days</p>
        </div>
        <div class="col-md-3 py-3 py-md-0">
            <i class="fa-solid fa-truck"></i>
            <h3>Fast Delivery</h3>
            <p>World Wide</p>
        </div>
        <div class="col-md-3 py-3 py-md-0">
            <i class="fa-solid fa-thumbs-up"></i>
            <h3>Big choice</h3>
            <p>Of products</p>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
<a href="#" class="arrow"><i><img src="/images/arrow.png" alt=""></i></a>

<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
     aria-labelledby="staticBackdropLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
<%--          form nằm đây      --%>
            <form>
            <div class="modal-header">
                <h4 class="modal-title">Add Employee</h4>

            </div>
            <div class="modal-body">
                <div class="container" id="product-cards2">
                    <h1 class="text-center">IPhones</h1>
                    <div class="col-12" style="text-align: center; ">

                        <img src="/images/iphone%2013%20pro.png" alt="">
                        <h3 class="text-center">Iphone 13 pro
                            Lorem ipsum dolor sit amet.</h3>
                        <div class="star text-center">
                            <i class="fa-solid fa-star checked"></i>
                            <i class="fa-solid fa-star checked"></i>
                            <i class="fa-solid fa-star checked"></i>
                            <i class="fa-solid fa-star checked"></i>
                            <i class="fa-solid fa-star checked"></i>
                        </div>
                        <h2>$1000 <span><li class="fa-solid fa-cart-shopping"></li></span></h2>


                    </div>
                    <div class="row" style="margin-top: 30px;">

                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                <button type="submit" class="btn btn-success" data-bs-toggle="modal" >
                    <span class="material-symbols-outlined">add_shopping_cart</span>
                </button>
            </div>
            </form>

        </div>
    </div>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</html>