<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Contact - Audacious Welcome Home</title>

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
                    <h2 class="intro-text text-center">Contact
                        <strong>form</strong>
                    </h2>
                    <hr>
                    <p>Please join our collective and let us hear from you.</p>
                    <form role="form" action="EmailSendingServlet1" method="post">
                        <div class="row">
                            <div class="form-group col-lg-3">
                                <label>First Name</label>
                                <input type="text" required name="fname" class="form-control">
                            </div>
                            <div class="form-group col-lg-3">
                                <label>Last Name</label>
                                <input type="text" required name="lname" class="form-control">
                            </div>
                            <div class="form-group col-lg-3">
                                <label>Email Address</label>
                                <input type="email" required name = "email" class="form-control">
                            </div>
                            <div class="form-group col-lg-3">
                                <label>Phone Number</label>
                                <input type="text" name ="phone" class="form-control">
                            </div>
                            <div class="clearfix"></div>
                            <div class="form-group col-lg-12">
                                <label>Comments/Questions/Suggestions</label>
                                <textarea name = "comment" class="form-control" rows="3"></textarea>
                            </div>
                            <div class="form-group col-lg-12">
                                <input type="hidden" name="save" value="contact">
                                <button type="submit" class="btn btn-default">Submit</button>
                            </div>
                        </div>
                    </form>
          </div>     
        </div>
<div class="box">
                  <div class="row">
                  <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center">FFF
                        <strong>Headquarters</strong>
                    </h2>
                    <hr>
                    <p>You may contact us at our Midtown Atlanta offices in The Garage.</p>
                            <div class="col-md-4">
                    <p>Phone:
                        <strong>678-517-2272</strong>
                    </p>
                    <p>Email:
                        <strong><a href="mailto:AudaciousWelcomeHome@gmail.com">AudaciousWelcomeHome@gmail.com</a></strong>
                    </p>
                    <p>Address:
                        <strong>848 Spring St., NW
                            <br>Atlanta, GA 30308</strong>
                    </p>
                </div>
                <div class="col-md-8">
                    <!-- Embedded Google Map using an iframe - to select your location find it on Google maps and paste the link as the iframe src. If you want to use the Google Maps API instead then have at it! -->
<!--                     <iframe width="100%" height="400" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="http://maps.google.com/maps?hl=en&amp;ie=UTF8&amp;ll=33.778216,-84.388210&amp;spn=56.506174,79.013672&amp;t=m&amp;z=4&amp;output=embed"></iframe> -->
                    <iframe width="100%" height="400" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://www.google.com/maps/d/u/1/embed?mid=zCZXFE7DUCLM.kjBMIMICOYaY"></iframe>
                </div>
              </div>
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
