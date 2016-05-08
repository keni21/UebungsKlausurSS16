package Warenkorb;

import java.util.Comparator;

public class AnonymeComparator implements Comparator<cart>{

	@Override
	public int compare(cart o1, cart o2) {
		double o1durch = o1.getTotalAmount() / o1.getTotalltems();
		double o2durch = o2.getTotalAmount() / o2.getTotalltems();
		
		if(o1durch>o2durch)
		{
			return -1;
		}
		if(o1durch<o2durch)
		{
			return 1;
		}
		return 0;
	}

}
