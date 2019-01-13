package gamers;


import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import static java.util.Comparator.comparing;


public class Gamer /*implements Comparable<Gamer>*/ {
	
    public static final Comparator<Gamer> BY_LEVEL = comparing(Gamer::getLevel);

	
	private String nick;
	private double hours = 0;
	private int level = 1;
	private double credit;
	private static Set<String> usernameSet = new HashSet<>();

	Random randomGenerator = new Random();
	final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";

	
	public Gamer(String theNick, double theCredit)
	{
		
			this.nick = theNick;
			this.credit = theCredit;
		
	}
	
	public Gamer(String theNick, double theHours, int theLevel,double theCredit ) throws UtenteGiaEsistenteException
	{
		if(usernameSet.contains(theNick))
			throw new UtenteGiaEsistenteException("User name exists!");
		else{
			usernameSet.add(theNick);
			this.hours = theHours;
			this.level = theLevel;
			this.credit = theCredit;
		}
	}
	
	
	public String getNick()
	{
		return nick;
	}
	public double getHours()
	{
		return hours;
	}
	public int getLevel()
	{
		return level;
	}
	public double getCredit()
	{
		return credit;
	}
	
	public void setNick(String newNick)
	{
		if(newNick == null || equals(true) )
		{
			System.out.println("The nick must be not null and must be unique");
			System.exit(0);
			
		}
		else
		{
			nick = newNick;
		}
	}
	public void setHours(double newHours)
	{
		if(newHours != 0)
		{
			hours = newHours;
		}
		else
		{
			System.exit(0);
		}
	}
	public void setLevel(int newLevel)
	{
		if(newLevel != 0)
		{
			level = newLevel;
		}
		else
		{
			System.exit(0);
		}
	}
	public void setCredit(double newCredit)
	{
		if(newCredit != 0)
		{
			credit = credit + newCredit;
		}
		else
		{
			System.exit(0);
		}
	}
	
	
	
	@Override
	public String toString()
	{
		return "Gamer{ " +
				"nick: " + nick + ' ' +
				"hours: " + hours +' ' +
				"level: " + level +' ' +
				//"credit: " + credit +' ' +
				'}';
 	}
	
	public boolean equals(Object otherObject)
	{
		if (otherObject == null)
			return false;
		if (getClass() != otherObject.getClass())
			return false;
		else {
			Gamer gamer = 
					(Gamer)otherObject;
			return (nick == gamer.nick);
					
		}			
	}
	
	/* public int compareTo(Gamer other) {
	        return nick.compareTo(other.nick);
	    }*/
	
	
	
}
