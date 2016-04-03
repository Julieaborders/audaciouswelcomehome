<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Home - Audacious Welcome Home</title>

    <!-- Core CSS -->
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
                <div class="col-lg-12 text-center">
                    <div id="carousel-example-generic" class="carousel slide">
                        <!-- Indicators -->
                        <ol class="carousel-indicators hidden-xs">
                            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                        </ol>

                        <!-- Wrapper for slides -->
                        <div class="carousel-inner">
                            <div class="item active">
                                <img class="img-responsive img-full" src="img/Refugees-Welcome-1.jpg" alt="">
                            </div>
                            <div class="item">
                                <img class="img-responsive img-full" src="" alt="">
                            </div>
                            <div class="item">
                                <img class="img-responsive img-full" src="img/refugees_welcome_racists_not_ap.jpg" alt="">
                            </div>
                        </div>

                        <!-- Controls -->
                        <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                            <span class="icon-prev"></span>
                        </a>
                        <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                            <span class="icon-next"></span>
                        </a>
                    </div>
                    <h2 class="brand-before">
                        <small>Thanks For Visiting</small>
                    </h2>
                    <h1 class="brand-name">Audacious Welcome Home</h1>
                    <hr class="tagline-divider">
                    <h2>
                         <small>
                            <strong>FIBI - For Immigrants By Immigrants</strong>
                        </small>
                    </h2>
                </div>
            </div>
        </div>
		   <div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center"><strong>Featured Hero:</strong>
                    Showcasing Our Community
                    </h2>
                    <hr>
                    <img class="img-responsive img-border img-left" src="img/FREE.jpg" alt="FREE QR">
                    <hr class="visible-xs">
                    <p>This section  highlights an organization whose works we admire. This month's honoree is <a href="http://friendsofrefugees.com/" target="_blank"> <strong>Friends of Refugee Clarkston</strong></a>!
                    As always, we seek to<strong> INSPIRE, INFORM, IN-STEP, REPEAT!</strong>
                    <p>Need other service types not mapped yet? 
                    Check out our <a href="Resources.jsp"><strong>Other Resource Links</strong></a>.</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center">Building a Strong Community
                        <strong>You Can't Deny!</strong>
                    </h2>
                    <hr>
                    <iframe title="New York Times Video - Embed Player" width="440" height="321" frameborder="0" scrolling="no" allowfullscreen="true" marginheight="0" marginwidth="0" id="nyt_video_player" 
                    src="http://graphics8.nytimes.com/video/players/offsite/index.html?videoId=100000002567769"></iframe>
                  <!--   <img class="img-responsive img-border img-left" src="img/LostBoysBookCvr.jpg" alt="Lost Boy Grows Up Content" > -->
                    <hr class="visible-xs">
                    <p>Part of our motivation for starting Audacious Welcome Home (AWH) is a desire to highlight and expand the triumph of the human spirit over extreme adversity.  A huge thanks to those who till the Soil of the Soul, through good times and bad, 
                     as depicted in this overarching narrative we affectionately refer to as,<a href="https://books.google.com/books/about/The_Lost_Boys_of_Sudan.html?id=mGauWmAKAvcC&source=kp_cover&hl=en" target="_blank"> 
                     <strong>Ode to Jacob's Ladder</strong></a>, to enable the community to continue to flourish in the future.
                    We trust that you, when the time is RIPE, will <a href="contact.jsp"><strong>Join the AWH Collective</strong>
                    </a> in whatever capacity best suits you.</p>
                    <p> Meanwhile, if you'd like to explore our Audacious Welcome Home resources, <a href="aVenues.jsp">
                    select <strong>[a]Venues</strong> from any page.</a></p>
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

    <!-- Script to Activate the Carousel -->
    <script>
    $('.carousel').carousel({
        interval: 3000 //changes the speed
    })
    </script>

</body>

</html>
