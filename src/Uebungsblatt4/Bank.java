package Uebungsblatt4;

import java.util.ArrayList;
import java.util.Collections;

public class Bank {
	
	private ArrayList<Kredit>list=new ArrayList<>();

	public Bank(ArrayList<Kredit> list) {
		super();
		this.list = list;
	}

	public ArrayList<Kredit> getKredit()
	{
		Collections.sort(list);
		return list;
	}
	
	public ArrayList<Kredit> getNaechsteKreditFaellig()
	{
		KreditoffeneJahre k=new KreditoffeneJahre();
		Collections.sort(list,k);
		return list;
	}
	
	public void neuerKredit(Kredit k) throws toMuchOpenCreditException
	{
		if(list.size()<=3)
		{
			list.add(k);
		}
		if (list.size()>3)
			{
			throw new toMuchOpenCreditException("nix da zu viele Kredite");
			}
	}
	
	public void deductAll()
	{
		for (Kredit kredit : list) 
		{
			try 
			{
				kredit.deduct();
			} catch (CreditAlreadyPaidException e) 
			{
				System.out.println("kredit "+ kredit+" bereits abbezahlt und wurde gelöscht");
				//list.remove(kredit);
				list.remove(kredit);
				e.printStackTrace();
			}
		}
	}
	
}
