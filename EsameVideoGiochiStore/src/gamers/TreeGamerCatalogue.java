package gamers;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeGamerCatalogue implements Iterable<Gamer> {

    private SortedSet<Gamer> gamers = new TreeSet<>();

	
	@Override
	public Iterator<Gamer> iterator() {
		// TODO Auto-generated method stub
		return gamers.iterator();
	}

	
}
