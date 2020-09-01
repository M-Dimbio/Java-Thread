//                                 Question 3 Part C -2
//interface myInterface1 {
	//public void run();
//}
public class Anonymous_2 implements Runnable{
	public static void PrintNumb(int n) {

		if (n == 1)
			System.out.print(1 + " ");
		else {
			PrintNumb(n - 1);
			System.out.print(n + " ");

		}
	}

	public static void main(String[] args) {
		Runnable  obj = () -> {PrintNumb(100);};
		new Thread(obj).start();
		//obj.run();
		//System.out.println();
		System.out.println("END");

	}

	
	public void run() {
		// TODO Auto-generated method stub
		
	}

}