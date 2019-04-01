/**
 * 
 */
package com.spring.boot.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.spring.boot.model.Price;
import com.spring.boot.model.Product;


/**
 * @author DELL
 *
 */
@RestController
public class ProductCatalogController {
	
	@Autowired
	RestTemplate restTemplate;

	
	@GetMapping("/products")
	public List<Product> getProductNames() throws IOException {
		String sURL = "https://jl-nonprod-syst.apigee.net/v1/categories/600001506/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma";
		URL url = new URL(sURL);
	    URLConnection request = url.openConnection();
	    request.connect();
	    List<Product> products = new ArrayList<>();
	    Product product = null;
	    JsonParser jp = new JsonParser(); //from gson
	    JsonObject root = (JsonObject) jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
	    JsonArray jsonArray = root.getAsJsonArray("products");
	    
	   /* for (int i = 0; i < jsonArray.size(); i++) {
	    	JsonElement element = jsonArray.get(i);
	    	 Gson gson = new GsonBuilder().create();
	    	product = new Product();
	    	if (element.isJsonObject()) {
	    		JsonObject obj = element.getAsJsonObject();
	    		int productId = obj.get("productId").getAsInt();//code
	    		String type = obj.get("type").getAsString();
	    		String title = obj.get("title").getAsString();
	    		int code = obj.get("code").getAsInt();//averageRating
	    		double averageRating = obj.get("averageRating").getAsDouble();
	    		product.setProductId(productId);
	    		product.setType(type);
	    		product.setTitle(title);
	    		product.setCode(code);
	    		product.setAverageRating(averageRating);
	    		JsonObject priceObj = obj.get("price").getAsJsonObject();
	    		Price price = new Price();
	    		if(!priceObj.get("was").getAsString().equals("") && !priceObj.get("now").getAsString().equals("")) {
	    			price.setWas(priceObj.get("was").getAsDouble());
		    		price.setNow(priceObj.get("now").getAsDouble());
		    			price.setPriceDifference(price.getWas() - price.getNow());
	    		}
	    		
	    		price.setCurrency(priceObj.get("currency").getAsString());
	    		product.setPrice(price);
	    	}
	    	products.add(product);
	    }*/
	    
	    Iterator<JsonElement> elements = jsonArray.iterator();

	    while(elements.hasNext()) {
	    		product = new Product();
	    		JsonObject prod = elements.next().getAsJsonObject();
	         
	         	int productId = prod.get("productId").getAsInt();//code
	    		String type = prod.get("type").getAsString();
	    		String title = prod.get("title").getAsString();
	    		int code = prod.get("code").getAsInt();//averageRating
	    		double averageRating = prod.get("averageRating").getAsDouble();
	    		product.setProductId(productId);
	    		product.setType(type);
	    		product.setTitle(title);
	    		product.setCode(code);
	    		product.setAverageRating(averageRating);
	    		JsonObject priceObj = prod.getAsJsonObject("price");
	    		Price price = new Price();
	    		try {
	    			if(!priceObj.get("was").getAsString().equals("") && !priceObj.get("now").getAsString().equals("")) {
		    			price.setWas(priceObj.get("was").getAsDouble());
			    		price.setNow(priceObj.get("now").getAsDouble());
			    		price.setPriceDifference(price.getWas() - price.getNow());
			    		price.setCurrency(priceObj.get("currency").getAsString());
		    		}else {
		    			price.setNow(priceObj.get("now").getAsDouble());
			    		price.setPriceDifference(price.getNow());
		    		}
	        	   
	    		}catch (Exception e) {
	        	   JsonObject nowObject = priceObj.getAsJsonObject("now");
	        	   if(!nowObject.get("from").getAsString().equals("") && !nowObject.get("to").getAsString().equals("")) {
	        		   price.setWas(nowObject.get("from").getAsDouble());
	        		   price.setNow(nowObject.get("to").getAsDouble());
		        	   price.setPriceDifference(price.getWas() - price.getNow());
		        	   price.setCurrency(priceObj.get("currency").getAsString());
	        	   }
	           }
	           price.setCurrency(priceObj.get("currency").getAsString());
	           product.setPrice(price);
	           products.add(product);
	           //products.add(gson.fromJson(prod.toString(), Product.class));
	    }
	    Collections.sort(products, Product.productComparator);
		return products;
	}
}
