/**
 * 
 */
package com.spring.boot.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * @author DELL
 *
 */

public class Product {
	
	private int productId;
	private String type;
	private String title;
	private int code;
	private double averageRating;
	private Price price;
	private String image;
	private List<String> additionalServices = new ArrayList<String>();
	private String displaySpecialOffer;
	private PromoMessages promoMessages;
	private String nonPromoMessage;
	private Long defaultSkuId;
	private List<ColorSwatches> colorSwatches = new ArrayList<>();
	private int colorSwatchSelected;
	private String colorWheelMessage;
	private Boolean outOfStock;
	private Boolean emailMeWhenAvailable;
	private String availabilityMessage;
	private Boolean compare;
	private String fabric;
	private Boolean swatchAvailable;
	private Boolean categoryQuickViewEnabled;
	private String swatchCategoryType;
	private String brand;
	private int ageRestriction;
	private Boolean isInStoreOnly;
	private Boolean isMadeToMeasure;
	private Boolean isBundle;
	private Boolean isProductSet;
	private List<PromotionalFeatures> promotionalFeatures = new ArrayList<>();
	private List<String> features = new ArrayList<>();
	private QuickAddToBasket addToBasket;
	private DynamicAttributes dynamicAttributes;
	private String directorate;
	private Date date;
	
	
	public Product() {
		super();
	}


	public Product(int productId, String type, String title, int code, double averageRating, Price price, String image,
			List<String> additionalServices, String displaySpecialOffer, PromoMessages promoMessages,
			String nonPromoMessage, Long defaultSkuId, List<ColorSwatches> colorSwatches, int colorSwatchSelected,
			String colorWheelMessage, Boolean outOfStock, Boolean emailMeWhenAvailable, String availabilityMessage,
			Boolean compare, String fabric, Boolean swatchAvailable, Boolean categoryQuickViewEnabled,
			String swatchCategoryType, String brand, int ageRestriction, Boolean isInStoreOnly, Boolean isMadeToMeasure,
			Boolean isBundle, Boolean isProductSet, List<PromotionalFeatures> promotionalFeatures,
			List<String> features, QuickAddToBasket addToBasket, DynamicAttributes dynamicAttributes,
			String directorate, Date date) {
		super();
		this.productId = productId;
		this.type = type;
		this.title = title;
		this.code = code;
		this.averageRating = averageRating;
		this.price = price;
		this.image = image;
		this.additionalServices = additionalServices;
		this.displaySpecialOffer = displaySpecialOffer;
		this.promoMessages = promoMessages;
		this.nonPromoMessage = nonPromoMessage;
		this.defaultSkuId = defaultSkuId;
		this.colorSwatches = colorSwatches;
		this.colorSwatchSelected = colorSwatchSelected;
		this.colorWheelMessage = colorWheelMessage;
		this.outOfStock = outOfStock;
		this.emailMeWhenAvailable = emailMeWhenAvailable;
		this.availabilityMessage = availabilityMessage;
		this.compare = compare;
		this.fabric = fabric;
		this.swatchAvailable = swatchAvailable;
		this.categoryQuickViewEnabled = categoryQuickViewEnabled;
		this.swatchCategoryType = swatchCategoryType;
		this.brand = brand;
		this.ageRestriction = ageRestriction;
		this.isInStoreOnly = isInStoreOnly;
		this.isMadeToMeasure = isMadeToMeasure;
		this.isBundle = isBundle;
		this.isProductSet = isProductSet;
		this.promotionalFeatures = promotionalFeatures;
		this.features = features;
		this.addToBasket = addToBasket;
		this.dynamicAttributes = dynamicAttributes;
		this.directorate = directorate;
		this.date = date;
	}


	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}


	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}


	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}


	/**
	 * @return the averageRating
	 */
	public double getAverageRating() {
		return averageRating;
	}


	/**
	 * @param averageRating the averageRating to set
	 */
	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}


	/**
	 * @return the price
	 */
	public Price getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(Price price) {
		this.price = price;
	}


	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}


	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}


	/**
	 * @return the additionalServices
	 */
	public List<String> getAdditionalServices() {
		return additionalServices;
	}


	/**
	 * @param additionalServices the additionalServices to set
	 */
	public void setAdditionalServices(List<String> additionalServices) {
		this.additionalServices = additionalServices;
	}


	/**
	 * @return the displaySpecialOffer
	 */
	public String getDisplaySpecialOffer() {
		return displaySpecialOffer;
	}


	/**
	 * @param displaySpecialOffer the displaySpecialOffer to set
	 */
	public void setDisplaySpecialOffer(String displaySpecialOffer) {
		this.displaySpecialOffer = displaySpecialOffer;
	}


	/**
	 * @return the promoMessages
	 */
	public PromoMessages getPromoMessages() {
		return promoMessages;
	}


	/**
	 * @param promoMessages the promoMessages to set
	 */
	public void setPromoMessages(PromoMessages promoMessages) {
		this.promoMessages = promoMessages;
	}


	/**
	 * @return the nonPromoMessage
	 */
	public String getNonPromoMessage() {
		return nonPromoMessage;
	}


	/**
	 * @param nonPromoMessage the nonPromoMessage to set
	 */
	public void setNonPromoMessage(String nonPromoMessage) {
		this.nonPromoMessage = nonPromoMessage;
	}


	/**
	 * @return the defaultSkuId
	 */
	public Long getDefaultSkuId() {
		return defaultSkuId;
	}


	/**
	 * @param defaultSkuId the defaultSkuId to set
	 */
	public void setDefaultSkuId(Long defaultSkuId) {
		this.defaultSkuId = defaultSkuId;
	}


	/**
	 * @return the colorSwatches
	 */
	public List<ColorSwatches> getColorSwatches() {
		return colorSwatches;
	}


	/**
	 * @param colorSwatches the colorSwatches to set
	 */
	public void setColorSwatches(List<ColorSwatches> colorSwatches) {
		this.colorSwatches = colorSwatches;
	}


	/**
	 * @return the colorSwatchSelected
	 */
	public int getColorSwatchSelected() {
		return colorSwatchSelected;
	}


	/**
	 * @param colorSwatchSelected the colorSwatchSelected to set
	 */
	public void setColorSwatchSelected(int colorSwatchSelected) {
		this.colorSwatchSelected = colorSwatchSelected;
	}


	/**
	 * @return the colorWheelMessage
	 */
	public String getColorWheelMessage() {
		return colorWheelMessage;
	}


	/**
	 * @param colorWheelMessage the colorWheelMessage to set
	 */
	public void setColorWheelMessage(String colorWheelMessage) {
		this.colorWheelMessage = colorWheelMessage;
	}


	/**
	 * @return the outOfStock
	 */
	public Boolean getOutOfStock() {
		return outOfStock;
	}


	/**
	 * @param outOfStock the outOfStock to set
	 */
	public void setOutOfStock(Boolean outOfStock) {
		this.outOfStock = outOfStock;
	}


	/**
	 * @return the emailMeWhenAvailable
	 */
	public Boolean getEmailMeWhenAvailable() {
		return emailMeWhenAvailable;
	}


	/**
	 * @param emailMeWhenAvailable the emailMeWhenAvailable to set
	 */
	public void setEmailMeWhenAvailable(Boolean emailMeWhenAvailable) {
		this.emailMeWhenAvailable = emailMeWhenAvailable;
	}


	/**
	 * @return the availabilityMessage
	 */
	public String getAvailabilityMessage() {
		return availabilityMessage;
	}


	/**
	 * @param availabilityMessage the availabilityMessage to set
	 */
	public void setAvailabilityMessage(String availabilityMessage) {
		this.availabilityMessage = availabilityMessage;
	}


	/**
	 * @return the compare
	 */
	public Boolean getCompare() {
		return compare;
	}


	/**
	 * @param compare the compare to set
	 */
	public void setCompare(Boolean compare) {
		this.compare = compare;
	}


	/**
	 * @return the fabric
	 */
	public String getFabric() {
		return fabric;
	}


	/**
	 * @param fabric the fabric to set
	 */
	public void setFabric(String fabric) {
		this.fabric = fabric;
	}


	/**
	 * @return the swatchAvailable
	 */
	public Boolean getSwatchAvailable() {
		return swatchAvailable;
	}


	/**
	 * @param swatchAvailable the swatchAvailable to set
	 */
	public void setSwatchAvailable(Boolean swatchAvailable) {
		this.swatchAvailable = swatchAvailable;
	}


	/**
	 * @return the categoryQuickViewEnabled
	 */
	public Boolean getCategoryQuickViewEnabled() {
		return categoryQuickViewEnabled;
	}


	/**
	 * @param categoryQuickViewEnabled the categoryQuickViewEnabled to set
	 */
	public void setCategoryQuickViewEnabled(Boolean categoryQuickViewEnabled) {
		this.categoryQuickViewEnabled = categoryQuickViewEnabled;
	}


	/**
	 * @return the swatchCategoryType
	 */
	public String getSwatchCategoryType() {
		return swatchCategoryType;
	}


	/**
	 * @param swatchCategoryType the swatchCategoryType to set
	 */
	public void setSwatchCategoryType(String swatchCategoryType) {
		this.swatchCategoryType = swatchCategoryType;
	}


	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}


	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}


	/**
	 * @return the ageRestriction
	 */
	public int getAgeRestriction() {
		return ageRestriction;
	}


	/**
	 * @param ageRestriction the ageRestriction to set
	 */
	public void setAgeRestriction(int ageRestriction) {
		this.ageRestriction = ageRestriction;
	}


	/**
	 * @return the isInStoreOnly
	 */
	public Boolean getIsInStoreOnly() {
		return isInStoreOnly;
	}


	/**
	 * @param isInStoreOnly the isInStoreOnly to set
	 */
	public void setIsInStoreOnly(Boolean isInStoreOnly) {
		this.isInStoreOnly = isInStoreOnly;
	}


	/**
	 * @return the isMadeToMeasure
	 */
	public Boolean getIsMadeToMeasure() {
		return isMadeToMeasure;
	}


	/**
	 * @param isMadeToMeasure the isMadeToMeasure to set
	 */
	public void setIsMadeToMeasure(Boolean isMadeToMeasure) {
		this.isMadeToMeasure = isMadeToMeasure;
	}


	/**
	 * @return the isBundle
	 */
	public Boolean getIsBundle() {
		return isBundle;
	}


	/**
	 * @param isBundle the isBundle to set
	 */
	public void setIsBundle(Boolean isBundle) {
		this.isBundle = isBundle;
	}


	/**
	 * @return the isProductSet
	 */
	public Boolean getIsProductSet() {
		return isProductSet;
	}


	/**
	 * @param isProductSet the isProductSet to set
	 */
	public void setIsProductSet(Boolean isProductSet) {
		this.isProductSet = isProductSet;
	}


	/**
	 * @return the promotionalFeatures
	 */
	public List<PromotionalFeatures> getPromotionalFeatures() {
		return promotionalFeatures;
	}


	/**
	 * @param promotionalFeatures the promotionalFeatures to set
	 */
	public void setPromotionalFeatures(List<PromotionalFeatures> promotionalFeatures) {
		this.promotionalFeatures = promotionalFeatures;
	}


	/**
	 * @return the features
	 */
	public List<String> getFeatures() {
		return features;
	}


	/**
	 * @param features the features to set
	 */
	public void setFeatures(List<String> features) {
		this.features = features;
	}


	/**
	 * @return the addToBasket
	 */
	public QuickAddToBasket getAddToBasket() {
		return addToBasket;
	}


	/**
	 * @param addToBasket the addToBasket to set
	 */
	public void setAddToBasket(QuickAddToBasket addToBasket) {
		this.addToBasket = addToBasket;
	}


	/**
	 * @return the dynamicAttributes
	 */
	public DynamicAttributes getDynamicAttributes() {
		return dynamicAttributes;
	}


	/**
	 * @param dynamicAttributes the dynamicAttributes to set
	 */
	public void setDynamicAttributes(DynamicAttributes dynamicAttributes) {
		this.dynamicAttributes = dynamicAttributes;
	}


	/**
	 * @return the directorate
	 */
	public String getDirectorate() {
		return directorate;
	}


	/**
	 * @param directorate the directorate to set
	 */
	public void setDirectorate(String directorate) {
		this.directorate = directorate;
	}


	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", type=" + type + ", title=" + title + ", code=" + code
				+ ", averageRating=" + averageRating + ", price=" + price + ", image=" + image + ", additionalServices="
				+ additionalServices + ", displaySpecialOffer=" + displaySpecialOffer + ", promoMessages="
				+ promoMessages + ", nonPromoMessage=" + nonPromoMessage + ", defaultSkuId=" + defaultSkuId
				+ ", colorSwatches=" + colorSwatches + ", colorSwatchSelected=" + colorSwatchSelected
				+ ", colorWheelMessage=" + colorWheelMessage + ", outOfStock=" + outOfStock + ", emailMeWhenAvailable="
				+ emailMeWhenAvailable + ", availabilityMessage=" + availabilityMessage + ", compare=" + compare
				+ ", fabric=" + fabric + ", swatchAvailable=" + swatchAvailable + ", categoryQuickViewEnabled="
				+ categoryQuickViewEnabled + ", swatchCategoryType=" + swatchCategoryType + ", brand=" + brand
				+ ", ageRestriction=" + ageRestriction + ", isInStoreOnly=" + isInStoreOnly + ", isMadeToMeasure="
				+ isMadeToMeasure + ", isBundle=" + isBundle + ", isProductSet=" + isProductSet
				+ ", promotionalFeatures=" + promotionalFeatures + ", features=" + features + ", addToBasket="
				+ addToBasket + ", dynamicAttributes=" + dynamicAttributes + ", directorate=" + directorate + ", date="
				+ date + "]";
	}
	
	public static Comparator<Product> productComparator = new Comparator<Product>() {

        @Override
        public int compare(Product p1, Product p2) {
        	int retValue = 0;
        	if(!Double.toString(p1.getPrice().getPriceDifference()).equals("") &&
        			!Double.toString(p2.getPrice().getPriceDifference()).equals("")) {
        		if(p1.getPrice().getPriceDifference() < p2.getPrice().getPriceDifference()) {
        			retValue = 1;
        		}else if(p1.getPrice().getPriceDifference() > p2.getPrice().getPriceDifference()) {
        			retValue = -1;
        		}else{
        			retValue = 0;
        		}
        	}
    		return retValue;
        }
    };
	
}
