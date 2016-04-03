<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Login/Register - Audacious Welcome Home</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/business-casual.css" rel="stylesheet">

    <!-- Fonts -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<jsp:include page="PageHeader.html" />
    
    <div class="container">
<div class="col-lg-12">
 	
                <div class="clearfix"></div>
            </div>
        </div>

    <div class="box">
           <div class="row">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center">Login or Register
                        <strong>here</strong>
                    </h2>
 <p>                  
<%
String msg = (String)request.getAttribute("msg");
if (msg !=null)
out.print(msg);
%>
</p>
                    <hr>
                    <p>Registered Service Provider, please login to gain assess to your account.</p>
                    <form role="form" action="login" method="post">
                        <div class="row">
                            <div class="form-group col-lg-4">
                                <label>Email</label>
                                <input type="email" name="email" class="form-control">
                            </div>
                            <div class="form-group col-lg-4">
                                <label>Password </label>
                                <input type="password" name="password" class="form-control">
                            </div>
                            <div class="clearfix"></div>
                            
                            <div class="form-group col-lg-12">
                                <input type="hidden" name="save" value="contact">
                                <button type="submit" class="btn btn-default">Submit</button>
                            </div>
                        </div>
                    </form>
                    <p>New Service Provider, please register by providing the info below.</p>
                    <form role="form" action="register" method="post">
                        <div class="row">
                        <div class="form-group col-lg-3">
                                <label>First name</label>
                                <input type="text" name="fname" class="form-control">
                            </div>
                            <div class="form-group col-lg-3">
                                <label>Last name</label>
                                <input type="text" name="lname" class="form-control">
                            </div>
                            <div class="form-group col-lg-4">
                                <label>Email</label>
                                <input type="email" name="email" class="form-control">
                            </div>
                            <div class="form-group col-lg-4">
                                <label>Password </label>
                                <input type="password" required name ="password" class="form-control">
                            </div>
                            <div class="form-group col-lg-4">
                                <label>Confirm Password </label>
                                <input type="password" required name="cpassword" required class="form-control">
                            </div>
                            <div class="clearfix"></div>
                            
                            <div class="form-group col-lg-12">
                                <input type="hidden" name="save" value="contact">
                                <button type="submit" class="btn btn-default">Submit</button>
                            </div>
                        </div>
                    </form>
          </div>     
        </div>

              </div>
    <!-- /.container -->
<jsp:include page="PageFooter.html" />
    
    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
