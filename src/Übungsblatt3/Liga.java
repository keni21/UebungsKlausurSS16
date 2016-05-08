package Übungsblatt3;

import java.util.ArrayList;
import java.util.Collections;

public class Liga {
	
	private String Name;
	
	private ArrayList<Team>list=new ArrayList<>();
	ComparatorName name=new ComparatorName();
	
	public ArrayList<Team> getAllTeams()
	{
		Collections.sort(list,name);
		return list;
	}
	
	public void add(String name) throws TeamAlreadyExistsExepction
	{
		for (Team team : list) 
		{
			if(name.equals(team.getName()))
			{
				throw new TeamAlreadyExistsExepction("Team Already Exists");
			}
		}
		this.list.add(new Team(name));
		
	}
	
	public void newGame(String teamA,int goalsA, String teamB, int goalsB) throws TeamNotFoundException
	{
		Team a=findteam(teamA);
		Team b=findteam(teamB);
		
			if(a==null||b==null)
			{
				throw new TeamNotFoundException("Team not found");
			}
			else 
			{
				try {
					a.gameFinished(goalsA, goalsB);
				} catch (GoalsMustBePositivException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					b.gameFinished(goalsB, goalsA);
				} catch (GoalsMustBePositivException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
	public Team findteam(String teamy)
	{
		for (Team team : list) {
			if(team.equals(teamy))
			{
				return team;
			}
		}
		return null;
	}

}

