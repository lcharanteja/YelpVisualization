package yelp.map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Restaurant {
	
	String business_id;
	String name;
	String schools;
	String open;
	String category;
	String subcategory;
	String is_vegetarian;
	int review_count;
	float stars;
	String neighborhoods;
	String url;
	String photo_url;
	String city;
	String state;
	double latitude;
	double longitude;
	int isAmbienceGood;
	int isFoodGood;
	int isPriceGood;
	int isServiceGood;
	
	public Restaurant() {}

	public Restaurant(String business_id, String name, String schools,
			String open, String category, String subcategory,
			String is_vegetarian, int review_count, float stars,
			String neighborhoods, String url, String photo_url, String city,
			String state, double latitude, double longitude,
			int isAmbienceGood, int isFoodGood, int isPriceGood,
			int isServiceGood) {
		super();
		this.business_id = business_id;
		this.name = name;
		this.schools = schools;
		this.open = open;
		this.category = category;
		this.subcategory = subcategory;
		this.is_vegetarian = is_vegetarian;
		this.review_count = review_count;
		this.stars = stars;
		this.neighborhoods = neighborhoods;
		this.url = url;
		this.photo_url = photo_url;
		this.city = city;
		this.state = state;
		this.latitude = latitude;
		this.longitude = longitude;
		this.isAmbienceGood = isAmbienceGood;
		this.isFoodGood = isFoodGood;
		this.isPriceGood = isPriceGood;
		this.isServiceGood = isServiceGood;
	}

	public int getIsAmbienceGood() {
		return isAmbienceGood;
	}

	public void setIsAmbienceGood(int isAmbienceGood) {
		this.isAmbienceGood = isAmbienceGood;
	}



	public int getIsFoodGood() {
		return isFoodGood;
	}



	public void setIsFoodGood(int isFoodGood) {
		this.isFoodGood = isFoodGood;
	}



	public int getIsPriceGood() {
		return isPriceGood;
	}



	public void setIsPriceGood(int isPriceGood) {
		this.isPriceGood = isPriceGood;
	}



	public int getIsServiceGood() {
		return isServiceGood;
	}



	public void setIsServiceGood(int isServiceGood) {
		this.isServiceGood = isServiceGood;
	}



	public String getBusiness_id() {
		return business_id;
	}

	public void setBusiness_id(String business_id) {
		this.business_id = business_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchools() {
		return schools;
	}

	public void setSchools(String schools) {
		this.schools = schools;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	public String getIs_vegetarian() {
		return is_vegetarian;
	}

	public void setIs_vegetarian(String is_vegetarian) {
		this.is_vegetarian = is_vegetarian;
	}

	public int getReview_count() {
		return review_count;
	}

	public void setReview_count(int review_count) {
		this.review_count = review_count;
	}

	public float getStars() {
		return stars;
	}

	public void setStars(float stars) {
		this.stars = stars;
	}

	public String getNeighborhoods() {
		return neighborhoods;
	}

	public void setNeighborhoods(String neighborhoods) {
		this.neighborhoods = neighborhoods;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPhoto_url() {
		return photo_url;
	}

	public void setPhoto_url(String photo_url) {
		this.photo_url = photo_url;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
}
