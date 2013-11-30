
var markers = [];
var myMap;
var infoWindow = new google.maps.InfoWindow({maxHeight:350, autoScroll:false, disableAutoPan: false});
$(document).ready(function() {
	google.maps.event.addDomListener(window, 'load', initialize);
	$("#mytrigger").click(function(){
		$("#mypanel").toggle("fast");
		$(this).toggleClass("active");
		return false;
	});
});

function initialize(){
	var myOptions = {
			zoom: 8,
			panControl: false,
			zoomControl: true,
			mapTypeControl: true,
			scaleControl: true,
			streetViewControl: false,
			overviewMapControl: false,
			mapTypeId: google.maps.MapTypeId.ROADMAP
	};

	var e=document.getElementById("mapPresentationCanvas");
	myMap = new google.maps.Map(e, myOptions);


	myMap.setCenter( new google.maps.LatLng(34.089061,-116.889896));  //Default is CA. play it safe and set automatically
	
	generateAndPlaceMarkers();
}
function createMarker(anAlert) {
	var alertLocation = new google.maps.LatLng(anAlert.latitude,anAlert.longitude);//37.09024,-95.712891);//new google.maps.LatLng(anAlert.latitude,anAlert.longitude),	alertMessage = "my msg",icon = "img/icon_circle_red.png";
	
	var myicon;
	if(anAlert.popular==0){
		myicon= "img/icon_circle_red.png";
	}else{
		myicon= "img/icon_circle_green.png";
	}
	var marker = new google.maps.Marker({
		position: alertLocation,
		map: myMap,
		icon:myicon,
		title: anAlert.category +"," + anAlert.subcategory});
	//marker.alertID = anAlert.id;	
	return marker;
}

function generateAndPlaceMarkers()	{
	
	var anAlert=new Object();
	anAlert.latitude=37.09024;
	anAlert.longitude=-95.712891;
	
	

    $.ajax({
        type: "GET",
        url: "resources/CA_Data.csv",
        dataType: "text",
        success: function(data) {processData(data);}
     });
    
   
}

function processData(allText) {
    var allTextLines = allText.split(/\r\n|\n/);
    var headers = allTextLines[0].split(',');
    var lines = [];

    for (var i=1; i<allTextLines.length; i++) {
        var data = allTextLines[i].split(',');
        if (data.length == headers.length) {
        	var anAlert=new Object();
            var tarr = [];
            //business_id,name,schools,open,category,subcategory,is_vegetarian,
            //review_count,stars,neighborhoods,url,photo_url,city,state,latitude,longitude
            for (var j=0; j<headers.length; j++) {
                tarr.push(headers[j]+":"+data[j]);
               
                if(j==1){
                	anAlert.name = data[j];
                }else if(j==2){
                	anAlert.school = data[j];
                }else if(j==3){
                	anAlert.open = data[j];
                }else if(j==4){
                	anAlert.category = data[j];
                }else if(j==5){
                	anAlert.subcategory = data[j];
                }else if(j==6){
                	anAlert.is_veg = data[j];
                }else if(j==8){
                	anAlert.stars = data[j];
                }else if(j==10){
                	anAlert.url = data[j];
                }else if(j==14){
                	anAlert.latitude = data[j];
                }else if(j==15){
                	anAlert.longitude = data[j];
                }else if(j==16){
                	anAlert.popular = data[j];
                }
            }
            lines.push(tarr);
           
        	
        	//anAlert.popular = 1;
            marker = createMarker(anAlert);
    		//markers[anAlert.id] = marker;
    		google.maps.event.addListener(marker,'click', markerClickHandler.bind(anAlert,marker));
    		marker.setMap(myMap);
        }
    }
    // alert(lines);
}

function markerClickHandler(marker,event)  {
	//infoWindow.close(myMap);
	//regionWindow.close(myMap);
	var selectedMarker = this;
	infoWindow.setContent("<div style='width: 310px; height:150px; font-size: 11px;'><b>name: </b>" + selectedMarker.name  +
			//" <br/><b>Country: </b>" + selectedAlert.country.countryName +
			" <br/><b>Coordinates: </b> (" + selectedMarker.latitude + ", " + selectedMarker.longitude + ")" +
			" <br/><b>School: </b>" + selectedMarker.school +
			" <br/><b>Open: </b>" + selectedMarker.open +
			" <br/><b>URL: </b>" + selectedMarker.url + 
			" <br/><b>category: </b>" + selectedMarker.category +
			"<br/><b>subcategory: </b>" + selectedMarker.subcategory +
			"<br/><b>isveg: </b>" + selectedMarker.is_veg +
			"<br/><b>stars: </b>" + selectedMarker.stars +"</div>");
	//infoWindow.setContent("category:" + selectedAlert.category + " subc:" + selectedAlert.subcategory + " latitude:" + selectedAlert.latitude +" longitude:" + selectedAlert.longitude);
	infoWindow.open(myMap,marker);
}