<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Resources - Fresh Food Finds </title>

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

        <div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center">Audacious Welcome Home
                        <strong>Additional Resource List</strong>
                    </h2>
                    <hr>
                </div>
                <div class="col-md-6">
                    <img class="img-responsive img-border-left" src="img/WSGBounty.jpg" alt="">
                </div>
                <div class="col-md-6">
                <p><strong>
                <%
String resultMessage = (String)request.getAttribute("Message");
if (resultMessage !=null)
out.print(resultMessage);
%></strong>
</p>
                    <p>Just back or headed to the Farmers Market and need some ideas for what and/or how to prep your bounty?  
                    May we offer these helpful resources: 
                     </p>
                     <ul>
                     <li>
                     <p>
                     	<a href="http://foodforthesoul.opare.net/recipes-to-live-for/50-shades-of-vegan-kale-recipes/" target ="_blank">Food for the Soul Recipes</a>
                     </li>
                     </p>
                     <li>
                     <p>
                        <a href="http://georgiaorganics.org/wp-content/uploads/2014/01/harvestcalendar_small.pdf" target="_blank">GA Organics Harvest Calendar</a>
                    </p>
                    </li>
                    <li> 
                    <p>
                    <a href="http://www.mycherishedlife.com/blog/build-a-better-grain-bowl" target="_blank">Bowls That'll Bowl You Over</a>
                   </p>
                   </li>
                   <li>
                    <p>
                    <a href="http://www.health.harvard.edu/healthy-eating-plate" target="_blank">Harvard Healthy Plate</a>
                    </p>
                    </li>
                   </ul>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>

        
                <div class="clearfix"></div>
            </div>
      
    <!-- /.container -->
<jsp:include page="PageFooter.html" />  

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
