package Warenkorb;

public class cart implements Comparable<cart> {
	
	private String username="";
	private int numArticles=0;
	private int totalltems=0;
	private double totalAmount=0;
	
	public cart(String username, int numArticles, int totalltems, double totalAmount) {
		super();
		this.username = username;
		this.numArticles = numArticles;
		this.totalltems = totalltems;
		this.totalAmount = totalAmount;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getNumArticles() {
		return numArticles;
	}

	public void setNumArticles(int numArticles) {
		this.numArticles = numArticles;
	}

	public int getTotalltems() {
		return totalltems;
	}

	public void setTotalltems(int totalltems) {
		this.totalltems = totalltems;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "cart [username=" + username + ", numArticles=" + numArticles + ", totalltems=" + totalltems
				+ ", totalAmount=" + totalAmount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numArticles;
		long temp;
		temp = Double.doubleToLongBits(totalAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + totalltems;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		cart other = (cart) obj;
		if (numArticles != other.numArticles)
			return false;
		if (Double.doubleToLongBits(totalAmount) != Double.doubleToLongBits(other.totalAmount))
			return false;
		if (totalltems != other.totalltems)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public int compareTo(cart o) {
		if (this.totalAmount<o.totalAmount)
		{
			return-1;
		}
		if (this.totalAmount>o.totalAmount)
		{
			return 1;
		}
		return 0;
	}
	
	

}
