<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Vertical Sliding Info Panel With jQuery</title>
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
<script type="text/javascript" src="http://jqueryjs.googlecode.com/files/jquery-1.3.2.js"></script>
<script src="https://maps.google.com/maps/api/js?sensor=false"/>
<script type="text/javascript">
$(document).ready(function(){
	
});
</script>

</head>

<body>


		<div id="main_container">
					<div id="map_container">
						<div id="mapPresentationCanvas"></div>
					</div>	<!-- end of map container -->
				</div>	<!-- end of main container -->
		
	


<div id="mypanel" class="panel">
	<h3>Sliding Panel</h3>
	<p>Here's our sliding panel/drawer made using jQuery with the toggle function and some CSS3 for the rounded corners</p>

	<p>This panel could also be placed on the right. This could be particularly useful if, <a href="http://spyrestudios.com" title="SpyreStudios">like me</a>, you have a left-aligned website layout.</p>

	
<div style="clear:both;"></div>

	<div class="columns">
		<div class="colleft">
		<h3>Navigation</h3>
			<ul>
				<li><a href="http://spyrestudios.com/" title="home">Home</a></li>
				<li><a href="http://spyrestudios.com/about/" title="about">About</a></li>
				<li><a href="http://spyrestudios.com/portfolio/" title="portfolio">Portfolio</a></li>
				<li><a href="http://spyrestudios.com/contact/" title="contact">Contact</a></li>
				<li><a href="http://spyrestudios.com" title="blog">Blog</a></li>
			</ul>
		</div>
	
		<div class="colright">
			<h3>Social Stuff</h3>
			<ul>
				<li><a href="http://twitter.com/jophillips" title="Twitter">Twitter</a></li>
				<li><a href="http://designbump.com/user/147" title="DesignBump">DesignBump</a></li>
				<li><a href="http://digg.com/users/jophillips" title="Digg">Digg</a></li>
				<li><a href="http://delicious.com/jon.phillips" title="Del.Icio.Us">Del.Icio.Us</a></li>
				<li><a href="http://designmoo.com/users/jonphillips" title="DesignMoo">DesignMoo</a></li>
			</ul>
		</div>
	</div>
<div style="clear:both;"></div>

</div>
<a id="mytrigger" class="trigger" href="#">success viz</a>
<script src="<c:url value="js/script.js" />"></script>
</body>
</html>