package yelp.map;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
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
	
	//Get all data no filter
	 @GET
     @Produces(MediaType.APPLICATION_JSON)
     @Path("/getRest") 
    public List<Restaurant> getAllRestaurants() {
		List<Restaurant> allrest = new ArrayList<Restaurant>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\Prajakta\\Desktop\\Workspaces eclipse\\workspace perl\\YelpViz\\src\\resources\\CA_Data.csv")));
			String line;
			while((line=br.readLine()) != null){
				if(line.contains("business_id")){
					continue;
				}
				String[] values= line.split(",");
				//business_id,name,schools,open,category,subcategory,is_vegetarian,review_count,stars,neighborhoods,url,photo_url,city,state,latitude,longitude
				Restaurant r = new Restaurant();
				r.setBusiness_id(values[0]);
				r.setName(values[1]);
				r.setSchools(values[2]);
				r.setOpen(values[3]);
				r.setCategory(values[4]);
				r.setSubcategory(values[5]);
				r.setIs_vegetarian(values[6]);
				r.setReview_count(Integer.parseInt(values[7]));
				r.setStars(Float.parseFloat(values[8]));
				r.setNeighborhoods(values[9]);
				r.setUrl(values[10]);
				r.setPhoto_url(values[11]);
				r.setCity(values[12]);
				r.setState(values[13]);
				r.setLatitude(Double.parseDouble(values[14]));
				r.setLongitude(Double.parseDouble(values[15]));
				allrest.add(r);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return allrest;
    }
	 
	 //get all restaurants of type="" subtype="" 
	 @GET
     @Produces(MediaType.APPLICATION_JSON)
     @Path("/getRestOfType/{category}/{subcategory}") 
	 public List<Restaurant> getRestaurantsOfType(@PathParam("category") String category, @PathParam("subcategory") String subcategory) {
		 List<Restaurant> rest = new ArrayList<Restaurant>();
		 System.out.println("category" + category + " sub:" + subcategory);
		 try {
				BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\Prajakta\\Desktop\\Workspaces eclipse\\workspace perl\\YelpViz\\src\\resources\\CA_Data.csv")));
				String line;
				while((line=br.readLine()) != null){
					if(line.contains("business_id")){
						continue;
					}
					
					String[] values = line.split(",");
					if(values[4].equals(category) && values[5].equals(subcategory)){
						//business_id,name,schools,open,category,subcategory,is_vegetarian,review_count,stars,neighborhoods,url,photo_url,city,state,latitude,longitude
							Restaurant r = new Restaurant();
							r.setBusiness_id(values[0]);
							r.setName(values[1]);
							r.setSchools(values[2]);
							r.setOpen(values[3]);
							r.setCategory(values[4]);
							r.setSubcategory(values[5]);
							r.setIs_vegetarian(values[6]);
							r.setReview_count(Integer.parseInt(values[7]));
							r.setStars(Float.parseFloat(values[8]));
							r.setNeighborhoods(values[9]);
							r.setUrl(values[10]);
							r.setPhoto_url(values[11]);
							r.setCity(values[12]);
							r.setState(values[13]);
							r.setLatitude(Double.parseDouble(values[14]));
							r.setLongitude(Double.parseDouble(values[15]));
							rest.add(r);
					}
				} 
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     return rest;
	 }
}