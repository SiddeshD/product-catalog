/**
 * 
 */
package com.spring.boot.model;

/**
 * @author DELL
 *
 */
public class PromotionalFeatures {
	
	private String title;
	private String iconUrl;
	private String linkUrl;
	private String description;
	private String longDescription;
	public PromotionalFeatures() {
		super();
	}
	public PromotionalFeatures(String title, String iconUrl, String linkUrl, String description,
			String longDescription) {
		super();
		this.title = title;
		this.iconUrl = iconUrl;
		this.linkUrl = linkUrl;
		this.description = description;
		this.longDescription = longDescription;
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
	 * @return the iconUrl
	 */
	public String getIconUrl() {
		return iconUrl;
	}
	/**
	 * @param iconUrl the iconUrl to set
	 */
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	/**
	 * @return the linkUrl
	 */
	public String getLinkUrl() {
		return linkUrl;
	}
	/**
	 * @param linkUrl the linkUrl to set
	 */
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the longDescription
	 */
	public String getLongDescription() {
		return longDescription;
	}
	/**
	 * @param longDescription the longDescription to set
	 */
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PromotionalFeatures [title=" + title + ", iconUrl=" + iconUrl + ", linkUrl=" + linkUrl
				+ ", description=" + description + ", longDescription=" + longDescription + "]";
	}
	
	
}
