/**
 * 
 */
package com.spring.boot.model;

/**
 * @author DELL
 *
 */
public class QuickAddToBasket {
	
	private Boolean showChooseSizeTriggerQV;

	public QuickAddToBasket(Boolean showChooseSizeTriggerQV) {
		super();
		this.showChooseSizeTriggerQV = showChooseSizeTriggerQV;
	}

	public QuickAddToBasket() {
		super();
	}

	/**
	 * @return the showChooseSizeTriggerQV
	 */
	public Boolean getShowChooseSizeTriggerQV() {
		return showChooseSizeTriggerQV;
	}

	/**
	 * @param showChooseSizeTriggerQV the showChooseSizeTriggerQV to set
	 */
	public void setShowChooseSizeTriggerQV(Boolean showChooseSizeTriggerQV) {
		this.showChooseSizeTriggerQV = showChooseSizeTriggerQV;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QuickAddToBasket [showChooseSizeTriggerQV=" + showChooseSizeTriggerQV + "]";
	}
	
	

}
