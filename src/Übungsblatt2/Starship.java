package Übungsblatt2;

public class Starship {
	
	private String name;
	private Transporter transporter=new Transporter();
	
	public void beamUp(String person, String from)
	{
		try {
			this.transporter.beam(person,from,name, true);
		} catch (TransporterMalfunctionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			this.transporter.shutdown();
		}
	}

}
