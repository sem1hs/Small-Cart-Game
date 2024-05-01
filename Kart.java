
public class Kart{
	
	protected String[] KartTuru = {"Kupa","Karo","Sinek","Maça"};
	protected String[] KartNumara = {"2","3","4","5","6","7","8","9","10","As","Papaz","Kýz","Vale"};
	protected String[][] Kartlar = new String[4][13];
	/**
	 * this construct
	 * make with KartTuru and KartNumara
	 */
	public void KartOlustur()
	{	
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<13;j++)
			{
				Kartlar[i][j] = KartTuru[i] + " " + KartNumara[j];	
			}			
		}
	}
}
