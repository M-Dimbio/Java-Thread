// -----------------------------------------Question 3 Part A
public class Part3 implements Runnable  {

	@Override
	public void run() {
		PrintNumbers(100);
		
		
	}
	
	public static void PrintNumbers(int x) 
	{
		
		
		if (x==1) {
			System.out.print(x+",");return;
			
		}
		PrintNumbers(x-1);
		
		System.out.print(x+",");
		
		
		
		
	}
	public static void main(String[] args) 
	{
		
		Part3 p3= new Part3();
		p3.run();
		System.out.println("\nThe End");
	}

}

