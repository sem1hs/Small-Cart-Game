
public class Main {

	public static void main(String[] args) {
		Deste kart2 = new Deste();
		
		/**
		 * make variables
		 */
		kart2.KartOlustur();
		
		System.out.println("Kar��t�r�lmadan �nce \n\n");
		/**
		 * show variable
		 */
		kart2.DesteGoster();
		/**
		 * swap variable
		 */
		for(int i=0;i<53;i++)
		{
			kart2.DesteKar�st�r();
		}
		System.out.println("\n\nKar��t�r�ld�ktan Sonra \n\n");
		/**
		 * show variable
		 */
		kart2.DesteGoster();

	}

}
