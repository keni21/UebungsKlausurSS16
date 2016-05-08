package Uebungsblatt4;


public class Kredit implements Comparable<Kredit> {
	
	private String vertragsPartner;
	private String vertragsDatum;
	private double gesamtBetrag;
	private int gesamtJahre;
	private double offenerBetrag;
	private int offeneJahre;
	private double rate;
	
	public Kredit(String vertragsPartner, String vertragsDatum, double gesamtBetrag, int gesamtJahre, double rate) {
		super();
		this.vertragsPartner = vertragsPartner;
		this.vertragsDatum = vertragsDatum;
		this.gesamtBetrag = gesamtBetrag;
		this.gesamtJahre = gesamtJahre;
		this.rate = rate;
		
		this.offenerBetrag=gesamtBetrag;
		this.offeneJahre=gesamtJahre;
	}
	

	@Override
	public String toString() {
		return "Kredit [vertragsPartner=" + vertragsPartner + ", vertragsDatum=" + vertragsDatum + ", gesamtBetrag="
				+ gesamtBetrag + ", gesamtJahre=" + gesamtJahre + ", offenerBetrag=" + offenerBetrag + ", offeneJahre="
				+ offeneJahre + ", rate=" + rate + "]";
	}


	@Override
	public int compareTo(Kredit o) {
		int compare=this.vertragsDatum.compareTo(o.vertragsDatum);
		if(compare<0)
		{
			return 1;
		}
		if(compare>0)
		{
			return -1;
		}
		if (compare==0)
		{
			if(this.gesamtBetrag<o.gesamtBetrag)
			{
				return 1;
			}
			if(this.gesamtBetrag>o.gesamtBetrag)
			{
				return -1;
			}
		}
		return 0;
		
	}

	public void deduct() throws CreditAlreadyPaidException
	{
		if(gesamtBetrag>=rate&&offeneJahre>0)
		{
			gesamtBetrag-=rate;
			offeneJahre--;
		}
		else
		{
			throw new CreditAlreadyPaidException("Credit Already Paid");
		}
		
	}
	
	

	public String getVertragsPartner() {
		return vertragsPartner;
	}


	public void setVertragsPartner(String vertragsPartner) {
		this.vertragsPartner = vertragsPartner;
	}


	public String getVertragsDatum() {
		return vertragsDatum;
	}


	public void setVertragsDatum(String vertragsDatum) {
		this.vertragsDatum = vertragsDatum;
	}


	public double getGesamtBetrag() {
		return gesamtBetrag;
	}


	public void setGesamtBetrag(double gesamtBetrag) {
		this.gesamtBetrag = gesamtBetrag;
	}


	public int getGesamtJahre() {
		return gesamtJahre;
	}


	public void setGesamtJahre(int gesamtJahre) {
		this.gesamtJahre = gesamtJahre;
	}


	public double getOffenerBetrag() {
		return offenerBetrag;
	}


	public void setOffenerBetrag(double offenerBetrag) {
		this.offenerBetrag = offenerBetrag;
	}


	public int getOffeneJahre() {
		return offeneJahre;
	}


	public void setOffeneJahre(int offeneJahre) {
		this.offeneJahre = offeneJahre;
	}


	public double getRate() {
		return rate;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
	
	
	
	

}
