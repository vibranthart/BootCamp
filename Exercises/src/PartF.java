
public class PartF {
	public static void main(String[] args) {

		//Question F
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
		
		for(int i=3;i>0;i--)
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
