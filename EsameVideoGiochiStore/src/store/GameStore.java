package store;

import java.util.Iterator;
import java.util.LinkedList;

import gamers.Gamer;

public class GameStore implements Iterable<Gamer> {

    private static final int MIN_LEVEL = 1;

	private LinkedList<Gamer> gamerList = new LinkedList<Gamer>();
	
	/*
	 * Aggiungere un nuovo giocatore a sistema se non è già presente;
	 */
	public void addNewGamer( Gamer newGamer)
	{
		if(!gamerList.contains(newGamer.getNick()))
		gamerList.addLast(newGamer);
		else {
			System.out.println("This nick name exists");
			System.exit(0);
		}
	}
	/*
	 * Aggiungere un videogioco alla libreria dei giochi di un particolare giocatore scalando il
	 * prezzo dal credito dell’utente se ha credito sufficiente;
	 */
	
	
	
	/*
	 * Aggiungere credito ad un utente (il credito non può essere negativo);
	 */
	public void addCredit( Gamer theGamer, double theCredit)
	{
		if(theGamer != null && theCredit > 0)
		{
			theGamer.setCredit(theCredit);
		}
			
	}
	
	
	public void prepare()
	{
		// sort our list of gamers by level
        //Collections.sort(gamers, Gamer.BY_LEVEL);
		gamerList.sort(Gamer.BY_LEVEL);
		
	}
	
	/*
	 * e. Ciclare tramite un iteratore su tutti i giocatori ordinati per livello decrescente.
	 * 
	 */
	
	@Override
	public Iterator<Gamer> iterator() {
		return gamerList.iterator();
	}

}
