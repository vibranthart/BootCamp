
public class PartD {
	public static void main(String[] args) {

		//Question D
		for(int i=1;i<=6;i++)
		{
			for(int j=0; j<i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		//Question E
		/*
		 *   *
		 *  * *
		 * * * *
		 ** * * *
		 *
		 *
		 */
		
		for(int i=1;i<5;i++)
		{
			for(int j=0;j<(4-i);j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		
	}
}
