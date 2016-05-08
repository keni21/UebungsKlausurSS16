package Übungsblatt3;

public class Team implements Comparable<Team>{
	
	private String name;
	private int CountWon;
	private int CountDraw;
	private int CountLost;
	private int GolasScored;
	private int GolasGot;
	private int Points;
	private int PlayedRounds;
	
	public Team(String name) {
		super();
		this.name = name;
		CountWon = 0;
		CountDraw = 0;
		CountLost = 0;
		GolasScored = 0;
		GolasGot = 0;
		Points = 0;
		PlayedRounds = 0;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", CountWon=" + CountWon + ", CountDraw=" + CountDraw + ", CountLost=" + CountLost
				+ ", GolasScored=" + GolasScored + ", GolasGot=" + GolasGot + ", Points=" + Points + ", PlayedRounds="
				+ PlayedRounds + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountWon() {
		return CountWon;
	}

	public void setCountWon(int countWon) {
		CountWon = countWon;
	}

	public int getCountDraw() {
		return CountDraw;
	}

	public void setCountDraw(int countDraw) {
		CountDraw = countDraw;
	}

	public int getCountLost() {
		return CountLost;
	}

	public void setCountLost(int countLost) {
		CountLost = countLost;
	}

	public int getGolasScored() {
		return GolasScored;
	}

	public void setGolasScored(int golasScored) {
		GolasScored = golasScored;
	}

	public int getGolasGot() {
		return GolasGot;
	}

	public void setGolasGot(int golasGot) {
		GolasGot = golasGot;
	}

	public int getPoints() {
		return Points;
	}

	public void setPoints(int points) {
		Points = points;
	}

	public int getPlayedRounds() {
		return PlayedRounds;
	}

	public void setPlayedRounds(int playedRounds) {
		PlayedRounds = playedRounds;
	}

	@Override
	public int compareTo(Team o) {
		if(this.getPoints()<o.getPoints())
		{
			return -1;
		}
		if(this.getPoints()>o.getPoints())
		{
			return 1;
		}
		else if (this.getPoints()==o.getPoints())
		{
			if((this.getGolasScored()-this.getGolasGot())<(o.getGolasScored()-o.getGolasGot()))
			{
				return -1;
			}
			if((this.getGolasScored()-this.getGolasGot())>(o.getGolasScored()-o.getGolasGot()))
			{
				return 1;
			}
		}
		return 0;
	}
	
	public void gameFinished(int goalsScored, int goalsGot) throws GoalsMustBePositivException
	{
		if(goalsScored<0||goalsGot<0)
		{
			throw new GoalsMustBePositivException("Goals must be positiv");
		}
		if(goalsScored>goalsGot)
		{
			CountWon+=1;
			PlayedRounds+=1;
			Points+=3;
			GolasGot+=goalsGot;
			GolasScored+=goalsScored;
		}
		if(goalsScored<goalsGot)
		{
			CountLost+=1;
			PlayedRounds+=1;
			Points+=0;
			GolasGot+=goalsGot;
			GolasScored+=goalsScored;
		}
		if(goalsScored==goalsGot)
		{
			CountDraw+=1;
			PlayedRounds+=1;
			Points+=1;
			GolasGot+=goalsGot;
			GolasScored+=goalsScored;
		}
	}
	
	
	

}
