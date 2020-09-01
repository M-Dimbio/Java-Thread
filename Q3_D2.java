
public class Q3_D2 implements Runnable {

	public void run() {

	}

	public static void PrintNumb(int n) {

		if (n == 1)
			System.out.print(1 + " ");
		else {
			PrintNumb(n - 1);
			System.out.print(n + " ");

		}
	}

	public static void main(String[] args) 
	{
		Runnable obj = () -> {
			PrintNumb(100);
		};
		obj.run();
		System.out.println();
		System.out.println("END");
	}


}
