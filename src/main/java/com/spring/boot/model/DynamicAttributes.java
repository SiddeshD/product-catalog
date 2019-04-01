/**
 * 
 */
package com.spring.boot.model;

/**
 * @author DELL
 *
 */
public class DynamicAttributes {
	private String newinproducttype;
	private String washinginstructions;
	private String dressbyoccasion;
	private String dressshape;
	private String typeofpattern;
	
	public DynamicAttributes() {
		super();
	}

	/**
	 * @return the newinproducttype
	 */
	public String getNewinproducttype() {
		return newinproducttype;
	}

	/**
	 * @param newinproducttype the newinproducttype to set
	 */
	public void setNewinproducttype(String newinproducttype) {
		this.newinproducttype = newinproducttype;
	}

	/**
	 * @return the washinginstructions
	 */
	public String getWashinginstructions() {
		return washinginstructions;
	}

	/**
	 * @param washinginstructions the washinginstructions to set
	 */
	public void setWashinginstructions(String washinginstructions) {
		this.washinginstructions = washinginstructions;
	}

	/**
	 * @return the dressbyoccasion
	 */
	public String getDressbyoccasion() {
		return dressbyoccasion;
	}

	/**
	 * @param dressbyoccasion the dressbyoccasion to set
	 */
	public void setDressbyoccasion(String dressbyoccasion) {
		this.dressbyoccasion = dressbyoccasion;
	}

	/**
	 * @return the dressshape
	 */
	public String getDressshape() {
		return dressshape;
	}

	/**
	 * @param dressshape the dressshape to set
	 */
	public void setDressshape(String dressshape) {
		this.dressshape = dressshape;
	}

	/**
	 * @return the typeofpattern
	 */
	public String getTypeofpattern() {
		return typeofpattern;
	}

	/**
	 * @param typeofpattern the typeofpattern to set
	 */
	public void setTypeofpattern(String typeofpattern) {
		this.typeofpattern = typeofpattern;
	}

	public DynamicAttributes(String newinproducttype, String washinginstructions, String dressbyoccasion,
			String dressshape, String typeofpattern) {
		super();
		this.newinproducttype = newinproducttype;
		this.washinginstructions = washinginstructions;
		this.dressbyoccasion = dressbyoccasion;
		this.dressshape = dressshape;
		this.typeofpattern = typeofpattern;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DynamicAttributes [newinproducttype=" + newinproducttype + ", washinginstructions="
				+ washinginstructions + ", dressbyoccasion=" + dressbyoccasion + ", dressshape=" + dressshape
				+ ", typeofpattern=" + typeofpattern + "]";
	}
	
	
}
