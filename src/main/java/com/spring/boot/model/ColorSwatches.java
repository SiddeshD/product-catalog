/**
 * 
 */
package com.spring.boot.model;

/**
 * @author DELL
 *
 */
public class ColorSwatches {
	
	private String color;
	private String basicColor;
	private String colorSwatchUrl;
	private String imageUrl;
	private boolean isAvailable;
	private Long skuId;
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the basicColor
	 */
	public String getBasicColor() {
		return basicColor;
	}
	/**
	 * @param basicColor the basicColor to set
	 */
	public void setBasicColor(String basicColor) {
		this.basicColor = basicColor;
	}
	/**
	 * @return the colorSwatchUrl
	 */
	public String getColorSwatchUrl() {
		return colorSwatchUrl;
	}
	/**
	 * @param colorSwatchUrl the colorSwatchUrl to set
	 */
	public void setColorSwatchUrl(String colorSwatchUrl) {
		this.colorSwatchUrl = colorSwatchUrl;
	}
	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}
	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	/**
	 * @return the isAvailable
	 */
	public boolean isAvailable() {
		return isAvailable;
	}
	/**
	 * @param isAvailable the isAvailable to set
	 */
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	/**
	 * @return the skuId
	 */
	public Long getSkuId() {
		return skuId;
	}
	/**
	 * @param skuId the skuId to set
	 */
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	public ColorSwatches(String color, String basicColor, String colorSwatchUrl, String imageUrl, boolean isAvailable,
			Long skuId) {
		super();
		this.color = color;
		this.basicColor = basicColor;
		this.colorSwatchUrl = colorSwatchUrl;
		this.imageUrl = imageUrl;
		this.isAvailable = isAvailable;
		this.skuId = skuId;
	}
	public ColorSwatches() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ColorSwatches [color=" + color + ", basicColor=" + basicColor + ", colorSwatchUrl=" + colorSwatchUrl
				+ ", imageUrl=" + imageUrl + ", isAvailable=" + isAvailable + ", skuId=" + skuId + "]";
	}
	
	
	

}
