/**
 * 
 */
package com.spring.boot.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DELL
 *
 */
public class PromoMessages {
	private String priceMatched;
	private String offer;
	private String customPromotionalMessage;
	private String bundleHeadline;
	private List<String> customSpecialOffer = new ArrayList<String>();
	
	public PromoMessages() {
		super();
	}

	public PromoMessages(String priceMatched, String offer, String customPromotionalMessage, String bundleHeadline,
			List<String> customSpecialOffer) {
		this.priceMatched = priceMatched;
		this.offer = offer;
		this.customPromotionalMessage = customPromotionalMessage;
		this.bundleHeadline = bundleHeadline;
		this.customSpecialOffer = customSpecialOffer;
	}

	/**
	 * @return the priceMatched
	 */
	public String getPriceMatched() {
		return priceMatched;
	}

	/**
	 * @param priceMatched the priceMatched to set
	 */
	public void setPriceMatched(String priceMatched) {
		this.priceMatched = priceMatched;
	}

	/**
	 * @return the offer
	 */
	public String getOffer() {
		return offer;
	}

	/**
	 * @param offer the offer to set
	 */
	public void setOffer(String offer) {
		this.offer = offer;
	}

	/**
	 * @return the customPromotionalMessage
	 */
	public String getCustomPromotionalMessage() {
		return customPromotionalMessage;
	}

	/**
	 * @param customPromotionalMessage the customPromotionalMessage to set
	 */
	public void setCustomPromotionalMessage(String customPromotionalMessage) {
		this.customPromotionalMessage = customPromotionalMessage;
	}

	/**
	 * @return the bundleHeadline
	 */
	public String getBundleHeadline() {
		return bundleHeadline;
	}

	/**
	 * @param bundleHeadline the bundleHeadline to set
	 */
	public void setBundleHeadline(String bundleHeadline) {
		this.bundleHeadline = bundleHeadline;
	}

	/**
	 * @return the customSpecialOffer
	 */
	public List<String> getCustomSpecialOffer() {
		return customSpecialOffer;
	}

	/**
	 * @param customSpecialOffer the customSpecialOffer to set
	 */
	public void setCustomSpecialOffer(List<String> customSpecialOffer) {
		this.customSpecialOffer = customSpecialOffer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PromoMessages [priceMatched=" + priceMatched + ", offer=" + offer + ", customPromotionalMessage="
				+ customPromotionalMessage + ", bundleHeadline=" + bundleHeadline + ", customSpecialOffer="
				+ customSpecialOffer + "]";
	}
	

	

}
