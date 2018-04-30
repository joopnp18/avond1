public class Liedje
{
	String titel;
	String artiest;
	
	public static void main(String[] args)
	{
		Liedje liedje1 = new Liedje();
		Liedje liedje2 = new Liedje();
		
		liedje1.titel = "Fat Bottomed Girls";
		liedje2.titel = "Wish You Were Here";
		liedje2.artiest = "Pink Floyd";
		
		artiestIsQueen(liedje1);
		
		spelen(liedje2.titel);
		afkondigen(liedje2.artiest);
		spelen(liedje1.titel);
		afkondigen(liedje1.artiest);
		
		einde();
	}
	
	public static void spelen(String naam)
	{
		uitvoer("Het liedje " + naam + " wordt nu afgespeeld.");
	}

	public static void afkondigen(String naam)
	{
		uitvoer("Dit is een nummer van " + naam + ".");
	}	

	public static void artiestIsQueen(Liedje liedje1)
	{
		liedje1.artiest = "Queen";
	}
	
//	programma einde	
	public static void einde()
	{
		uitvoer("=====");
		uitvoer("Klaar.");
	}

//	standaard uitvoer van tekst naar de console
	public static void uitvoer(String tekst)
	{
		System.out.println(tekst);
	}
}
