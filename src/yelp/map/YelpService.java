package yelp.map;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.sun.jersey.api.view.Viewable;
 
@Path("/")
public class YelpService {
 
	@GET
	@Path("/update")
	public Response getMsg() {
 
		String output = "Jersey say : ";
 
		return Response.status(200).entity(output).build();
 
	}
	
	@GET
    @Produces("text/html")
    public Viewable index() {
        return new Viewable("/index");
    }
 
}