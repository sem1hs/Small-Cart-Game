import java.util.Random;

public class Deste extends Kart{
	protected int RandI;
	protected int RandJ;
	private Random rnd = new Random(); 
	protected String[][] KartlarTemp = new String[4][13];
	/**
	 * @return 0-3 random number
	 */
	public int SayiUretI()
	{
		RandI = rnd.nextInt(4);
		return RandI;
	}
	/**
	 * @return 0-12 random number
	 */
	public int SayiUretJ()
	{
		RandJ = rnd.nextInt(13);
		return RandJ;
	}
	/**
	 * @param tempI random number
	 * @param tempJ random number
	 * @param tempFirstI random number
	 * @param tempFirstj random number
	 * 
	 * and swap
	 */
	public void DesteKarýstýr()
	{
		int tempI = SayiUretI();
		int tempJ = SayiUretJ();
		int tempFirstI = SayiUretI();
		int tempFirstJ = SayiUretJ();
		
		KartlarTemp[tempI][tempJ] = Kartlar[tempI][tempJ];
		Kartlar[tempI][tempJ] = Kartlar[tempFirstI][tempFirstJ];
		Kartlar[tempFirstI][tempFirstJ] = KartlarTemp[tempI][tempJ];	
	}
	public void DesteGoster()
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<13;j++)
			{
				System.out.println(Kartlar[i][j]);
			}			
		}
	}
}
