/**
 * 
 */
package com.spring.boot.model;

/**
 * @author DELL
 *
 */
public class Price {
	private double was;
	private double than1;
	private double than2;
	private double now;
	private double uom;
	private String currency;
	private double priceDifference;
	
	
	public Price(double was, double than1, double than2, double now, double uom, String currency,
			double priceDifference) {
		super();
		this.was = was;
		this.than1 = than1;
		this.than2 = than2;
		this.now = now;
		this.uom = uom;
		this.currency = currency;
		this.priceDifference = priceDifference;
	}
	public Price() {
		
	}
	public Price(double was, double than1, double than2, double now, double uom, String currency) {
		this.was = was;
		this.than1 = than1;
		this.than2 = than2;
		this.now = now;
		this.uom = uom;
		this.currency = currency;
	}
	/**
	 * @return the was
	 */
	public double getWas() {
		return was;
	}
	/**
	 * @param was the was to set
	 */
	public void setWas(double was) {
		this.was = was;
	}
	/**
	 * @return the than1
	 */
	public double getThan1() {
		return than1;
	}
	/**
	 * @param than1 the than1 to set
	 */
	public void setThan1(double than1) {
		this.than1 = than1;
	}
	/**
	 * @return the than2
	 */
	public double getThan2() {
		return than2;
	}
	/**
	 * @param than2 the than2 to set
	 */
	public void setThan2(double than2) {
		this.than2 = than2;
	}
	/**
	 * @return the now
	 */
	public double getNow() {
		return now;
	}
	/**
	 * @param now the now to set
	 */
	public void setNow(double now) {
		this.now = now;
	}
	/**
	 * @return the uom
	 */
	public double getUom() {
		return uom;
	}
	/**
	 * @param uom the uom to set
	 */
	public void setUom(double uom) {
		this.uom = uom;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the priceDifference
	 */
	public double getPriceDifference() {
		return priceDifference;
	}
	/**
	 * @param priceDifference the priceDifference to set
	 */
	public void setPriceDifference(double priceDifference) {
		this.priceDifference = priceDifference;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Price [was=" + was + ", than1=" + than1 + ", than2=" + than2 + ", now=" + now + ", uom=" + uom
				+ ", currency=" + currency + "]";
	}
}
