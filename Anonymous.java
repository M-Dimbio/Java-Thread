// -----------------------------Question 3 Part C
interface Myinterface  {
	public void run () ;
}
public class Anonymous extends Thread {


	public static void main(String[] args) 
	{
		Myinterface mi = new Myinterface()
		{


			public void run() {
				PrintNumb(100);

			}
			public  void PrintNumb(int n) 
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
		mi.run();
		System.out.println("\nThe End");

	}

}
