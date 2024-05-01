
public class Main {

	public static void main(String[] args) {
		Deste kart2 = new Deste();
		
		/**
		 * make variables
		 */
		kart2.KartOlustur();
		
		System.out.println("Karýþtýrýlmadan Önce \n\n");
		/**
		 * show variable
		 */
		kart2.DesteGoster();
		/**
		 * swap variable
		 */
		for(int i=0;i<53;i++)
		{
			kart2.DesteKarýstýr();
		}
		System.out.println("\n\nKarýþtýrýldýktan Sonra \n\n");
		/**
		 * show variable
		 */
		kart2.DesteGoster();

	}

}
