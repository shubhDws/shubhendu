package coding.interview.entity;

public class Mobile {
	
	private String brand;
	private int model;
	
	public Mobile(String brand, int model) {
		this.brand = brand;
		this.model = model;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Mobile)) {
			return false;
		}
		Mobile other = (Mobile) obj;
		if (brand == null) {
			if (other.brand != null) {
				return false;
			}
		} else if (!brand.equals(other.brand)) {
			return false;
		}
		if (model != other.model) {
			return false;
		}
		return true;
	}
	public String getBrand() {
		return brand;
	}
	public int getModel() {
		return model;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + model;
		return result;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(int model) {
		this.model = model;
	}


	
}
