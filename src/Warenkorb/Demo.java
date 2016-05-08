package Warenkorb;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		
		CartUsernameComparator test=new CartUsernameComparator();
		AnonymeComparator anoyn=new AnonymeComparator();
		
		ArrayList<cart>list=new ArrayList<>();
		list.add(new cart("warenkorb1", 4, 5, 12));
		list.add(new cart("warenkorb4", 5, 5, 19));
		list.add(new cart("warenkorb3", 6, 5, 18));

		for (cart cart : list) {
			System.out.println(cart);
		}
		
		System.out.println();
		
		Collections.sort(list);
		for (cart cart : list) {
			System.out.println(cart);
		}
		
		System.out.println();
		
		Collections.sort(list,test);
		for (cart cart : list) {
			System.out.println(cart);
		}
		
		System.out.println();
		
		Collections.sort(list,anoyn);
		for (cart cart : list) {
			System.out.println(cart);
		}
	}

}
