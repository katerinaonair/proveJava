
/*
 * List of Gamers
 */
package gamers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import videogiochi.Videogiochi;


public class GamesList implements Iterable<Gamer> {
	
	private final List<Gamer> gamers = new ArrayList<>();
	private final List<Videogiochi> giochi = new ArrayList<>();

	
	public List<Gamer> gamers()
	{
		return gamers;
	}

	public void add(Gamer gamer)
	{
		gamers.add(gamer);
	}
	
	public void prepare()
	{
		// sort our list of gamers by nick
		//Collections.sort(gamers);
		for(Gamer g: gamers)
			System.out.println(g);
		
	}
	
	@Override
	public String toString()
	{
		return " " + gamers + '\n' ;
 	}

	@Override
	public Iterator<Gamer> iterator() {
		return gamers.iterator();
	}
	
}
