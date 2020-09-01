
public class Q3_D implements Runnable
{

	public void run() 
	{

	}
	public static void main (String[]args) 
	{
		Runnable r1=new Runnable()
		{


			public void run() {

				PrintNumb(100);
				
			}
			public void PrintNumb(int n) 
			{

				if (n == 1)
					System.out.print(1 + " ");
				else 
				{
					PrintNumb(n - 1);
					System.out.print(n + " ");

				}
			}
		};
		r1.run();
		System.out.println("\nTHE End");
	}
}
