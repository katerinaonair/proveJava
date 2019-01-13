/*
 * 
 */

package demo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import gamers.Gamer;
import gamers.UtenteGiaEsistenteException;
import store.GameStore;
import videogiochi.CategoryGame;
import videogiochi.Videogiochi;

public class Test {
	

	public static void main(String[] args) throws UtenteGiaEsistenteException {
				
		/*
		 * Crea 5 videogiochi a piacere con un prezzo compreso tra 5 e 70 Euro
		 */
		GenericList<Videogiochi> videoGiochiList = new GenericList<Videogiochi>();
		
		Videogiochi game1 = new Videogiochi(
				"g1", "Game Name 1", "SWH One", CategoryGame.SPARATUTTO, 5 );
		videoGiochiList.addToStart(game1);
		Videogiochi game2 = new Videogiochi(
				"g2", "Game Name 2", "SWH Two", CategoryGame.ARCADE, 30 );
		videoGiochiList.addToStart(game2);
		Videogiochi game3 = new Videogiochi(
				"g3", "Game Name 3", "SWH Two", CategoryGame.MANAGERIALE, 35 );
		videoGiochiList.addToStart(game3);
		Videogiochi game4 = new Videogiochi(
				"g4", "Game Name 4", "SWH Three", CategoryGame.ARCADE, 30 );
		videoGiochiList.addToStart(game4);
		Videogiochi game5 = new Videogiochi(
				"g5", "Game Name 5", "SWH Four", CategoryGame.RACING, 70 );
		videoGiochiList.addToStart(game5);
		
		videoGiochiList.outputList();
		
		System.out.println(" ");
		
		
		/*
		 * Crea 50 giocatori indicando solamente il nickname (generato univocamente) ed il credito
generato casualmente come numero tra 10 e 100 Euro e li aggiunge allo Store.
		 */
		
		ArrayList<Gamer> gamerList = new ArrayList<Gamer>();
		
				
		for(int i = 1; i < 51; i++)
		{
				final int min = 10; 
				final int max = 100; 
				final int rndCredit = rndCredit(min, max);
				Gamer gamer1 = new Gamer("nick"+i, rndCredit);
				gamerList.add(gamer1 );
		}
		
		/*
		 * Stampa a video tramite for-each tutti i giocatori ordinati per livello decrescente (Devono essere
visibili: nickname, ore di gioco e livello).
		 */
		GameStore gameStore = new GameStore();
		gameStore.prepare();
		gamerList.forEach(System.out::println);
		
		/*
		 * Scrive sul file “giocatori.csv” i 50 giocatori accompagnati dalla lista di giochi acquistati secondo il
seguente formato:
     Nickname,Credito,[Videogioco1,Videogioco2,...,VideogiocoN]

		 */
		try {
			FileWriter file = new FileWriter("gamers.txt");
			for(Gamer g: gamerList){
				file.write(g.getNick() + " Credit:" + g.getCredit() + "\n");
			}
			file.close();
		} catch (IOException e) {
			System.out.println("Problema con la scrittura su file!");
			e.printStackTrace();
		}
	}
		
		
	/*Helper*/
	/*
	 * Calculate random credit [20-70]
	 */
	public static int rndCredit(int min, int max)
	{
		max -= min;
		return (int) (Math.random() * ++max) + min;
	}

}
