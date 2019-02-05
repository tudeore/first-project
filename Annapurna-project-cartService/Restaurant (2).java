/**
 * 
 */
package com.capgemini.restaurant.entity;

import java.util.Map;
import java.util.Set;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ugawari
 *
 */
@Document
public class Restaurant {

	@Id
	private Integer restaurantId;	
	private String name;
	private Address address;
	private Set<FoodItems> foodItems;
	private Map<Integer, Integer> ratings;
	private Map<Integer, String> reviews;
	private String type;
	private Set<String> photos;	

	public Restaurant() {
		super();
	}
	
	public Restaurant(Integer restaurantId, String name, Address address, Set<FoodItems> foodItems,
			Map<Integer, Integer> ratings, Map<Integer, String> reviews, String type, Set<String> photos) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.address = address;
		this.foodItems = foodItems;
		this.ratings = ratings;
		this.reviews = reviews;
		this.type = type;
		this.photos = photos;
	}
	
	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<FoodItems> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(Set<FoodItems> foodItems) {
		this.foodItems = foodItems;
	}

	public Map<Integer, Integer> getRatings() {
		return ratings;
	}

	public void setRatings(Map<Integer, Integer> ratings) {
		this.ratings = ratings;
	}

	public Map<Integer, String> getReviews() {
		return reviews;
	}

	public void setReviews(Map<Integer, String> reviews) {
		this.reviews = reviews;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set<String> getPhotos() {
		return photos;
	}

	public void setPhoto(Set<String> photos) {
		this.photos = photos;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", address=" + address + ", foodItems="
				+ foodItems + ", ratings=" + ratings + ", reviews=" + reviews + ", type=" + type + ", photos=" + photos
				+ "]";
	}
	
	
}
