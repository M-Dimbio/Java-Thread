// ------------------------------------Question3 Part B
public class MyThread extends Thread {

	
	public void run() {
		PrintNumb(100);

	}

	public static void PrintNumb(int n) {

		if (n == 1)
			System.out.print(1 + " ");
		else {
			PrintNumb(n - 1);
			System.out.print(n + " ");

		}
	}

	public static void main(String[] args) {
		MyThread p = new MyThread();
		p.start();
		System.out.println();
		System.out.println("END");

	}

}
