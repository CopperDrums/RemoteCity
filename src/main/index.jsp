<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  import="java.util.*"%>

<html>
<head>
    <title>Сообщество Некрасовки</title>
    <link rel="stylesheet" href="../../bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../bootstrap/css/bootstrap-theme.min.css" >
    <link rel="stylesheet" href="../../bootstrap/js/bootstrap.min.js" >
    <link rel="stylesheet" href="../../css/index.css" >
<script src="https://code.jquery.com/jquery-3.1.0.js"></script>
</head>



<body background="../../../imgs/background.jpg">


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">NewMoscow</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="/NewMoscow/Lottery">DiceRoll<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Page 1-1</a></li>
            <li><a href="#">Page  1-2</a></li>
            <li><a href="#">Page 1-3</a></li>
          </ul>
        </li>
        <li><a href="/NewMoscow/form.html">Gift a pet</a></li>
        <li><a href="/NewMoscow/downloadForm.html">Download a file</a></li>
        <li><a href="/NewMoscow/SecretLink.do">Secret link</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span>Завести аккаунт</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span>Войти</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="jumbotron">
  <h2>Сообщество Некрасовки</h2>
  <p>место для общения жителей района Некрасовка</p>
</div>



<div class="container-fluid">
    <div class="row">
        <div class="col-xs-24 zero">
                <br/><p style="font-style: italic; font-weight: bold">Добро пожаловать в Некрасовку! Что делать?<p/>
                 <p style="font-style: italic; font-weight: bold;">Заводим аккаунт, заполняем информацию о себе,
                знакомимся с соседями и
                наслаждаемся приятной компанией!</p><br/>

<p>Hello <%= "<b>Worlds</b>" %>
        </div>
    </div>

       <div class="row">
          <div class="col-xs-5 first">Had I the heavens’ embroidered cloths, Enwrought with golden and silver light, The blue and
          the dim and the dark cloths Of night and light and the half light, I would spread the cloths under your feet: But I, being poor, have only my dreams; I have spread my dreams under your feet; Tread softly because you tread on my dreams.</div>
          <div class="col-xs-14 second">
                    <br/>
                    Had I the heavens’ embroidered cloths, Enwrought with golden and silver light, The blue and
                    the dim and the dark cloths Of night and light and the half light, I would spread the cloths under your feet: But I, being poor, have only my dreams; I have spread my dreams under your feet; Tread softly because you tread on my dreams.


            <br/><br/><br/><br/><br/>
            <p align="center">
                    <a href="#">
                        <img src="../../../imgs/users.jpg" class="img-circle" alt="Cinque Terre" width="304" height="236">
                    </a>
            </p>
            <br/><br/><br/><br/>
          </div>


          <div class="col-xs-5 third"><br/><br/>
                <div class="panel panel-default">
                				<div class="panel-heading">
                					<h3 class="panel-title">
                						<span class="glyphicon glyphicon-log-in"></span>
                						Log In
                					</h3>
                				</div>
                				<div class="panel-body">
                					<form>
                						<div class="form-group">
                							<input type="text" class="form-control" id="uid" name="uid" placeholder="Username">
                						</div>
                						<div class="form-group">
                							<input type="password" class="form-control" id="pwd" name="pwd" placeholder="Password">
                						</div>
                						<button type="submit" class="btn btn-default">Log In</button>
                					</form>
                				</div>
                			</div>




          </div>
     </div>

</div>



</body>
</html>