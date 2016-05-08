package Übungsblatt2;

public class Transporter {
	
	public void beam(String person, String from, String to, boolean urgent)throws TransporterMalfunctionException
	{
		if(urgent==true)
		{
			double zufall=Math.random()*100;
			System.out.println(zufall);
			
			if(zufall<70)
			{
				throw new TransporterMalfunctionException("beamen nix gut");
			}
			else
			{
				System.out.println("beamen von "+from+ " nach "+to+" erfogreich");
			}
		}
		
	}
	public void shutdown()
	{
		System.out.println("schalting ab");
	}

}
