package Warenkorb;

import java.util.Comparator;

public class CartUsernameComparator implements Comparator<cart>{

	@Override
	public int compare(cart o1, cart o2) {

		int i=o1.getUsername().compareTo(o2.getUsername());
				if(i!=0)
				{
					return i;
				}
		return 0;
	}
	
	

}
