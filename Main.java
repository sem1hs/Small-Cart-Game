
public class Main {

	public static void main(String[] args) {
		Deste kart2 = new Deste();
		
		/**
		 * make variables
		 */
		kart2.KartOlustur();
		
		System.out.println("Karıştırılmadan Önce \n\n");
		/**
		 * show variable
		 */
		kart2.DesteGoster();
		/**
		 * swap variable
		 */
		for(int i=0;i<53;i++)
		{
			kart2.DesteKarıstır();
		}
		System.out.println("\n\nKarıştırıldıktan Sonra \n\n");
		/**
		 * show variable
		 */
		kart2.DesteGoster();

	}

}
