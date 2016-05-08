package Uebungsblatt4;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		Kredit kredit1=new Kredit("Max Muster", "2014-12-24", 4000, 20, 200);
		Kredit kredit2=new Kredit("Mix Muster", "2014-12-26", 5000, 5, 1000);
		Kredit kredit3=new Kredit("Mux Muster", "2014-12-24", 7000, 14, 500);
		
		ArrayList<Kredit> listkredit=new ArrayList<>();
		
		listkredit.add(kredit1);
		listkredit.add(kredit2);
		listkredit.add(kredit3);
		
		Bank list =new Bank(listkredit);
		//list.getKredit();
//		for (Kredit kredit : listkredit) {
//			System.out.println(kredit);
//		}
//		
//		System.out.println("______________________________________________________________________________________________________________________________________________________________________");
//		list.getNaechsteKreditFaellig();
//		for (Kredit kredit : listkredit) {
//			System.out.println(kredit);
//		}
//		System.out.println("______________________________________________________________________________________________________________________________________________________________________");
		
		list.deductAll();
		list.deductAll();
		list.deductAll();
		list.deductAll();
		list.deductAll();
		list.deductAll();
		list.deductAll();
		list.deductAll();
		list.deductAll();
		list.deductAll();
		list.deductAll();
		list.deductAll();
		list.deductAll();
		list.deductAll();
		list.deductAll();
		//list.deductAll();
		
		for (Kredit kredit : listkredit) {
			System.out.println(kredit);
		}
		
	}

}
