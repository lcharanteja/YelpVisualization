<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>RestViz</title>
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
	<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RestViz</h3>
	<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A Restaurant Visualization of the Yelp dataset</p>
	<p>Based on yelp review data for restaurants RestViz will provide the best restaurant customized as per your need!</p>

<div style="clear:both;"></div>

	<div class="columns">
		<div class="colleft">
			<table>
				<tr><h3>Legend:</h3></tr>
				<tr>
					<td>Low Rating (<=2.5)</td>
					<td><img src="img/icon_circle_red.png"/></td>
				</tr>
				<tr>
					<td>Moderate Rating (3, 3.5, 4)</td>
					<td> <img src="img/icon_circle_yellow.png"/></td>
				</tr>
				<tr>
					<td>High Rating (4.5, 5)</td>
					<td><img src="img/icon_circle_green.png"/></td>
				</tr>
			</table>
		</div>
	
		<div class="colright">
			<h3>What is important for you?</h3>
				<input name="food" value="FOOD" type="checkbox">&nbsp;Good food</input><br>
        		<input name="ambience" value="AMB"  type="checkbox">&nbsp;Good ambience</input><br>
        		<input name="price" value="PRICE" type="checkbox">&nbsp;Worth the price</input><br>
        		<input name="service" value="SERVICE" type="checkbox">&nbsp;Good service</input><br>
			
		</div>
	</div>
<div style="clear:both;"></div>

</div>
<a id="mytrigger" class="trigger" href="#">Filter results</a>
<script src="<c:url value="js/script.js" />"></script>
</body>
</html>