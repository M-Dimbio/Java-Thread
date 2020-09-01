// ---------------------------------Question 2
import java.util.Scanner;
public class Math101 
{
	
	public static interface Callback<T> 
	{
		void process(T notification);
	}
	public static void Divide(int a, int b,
			Callback<Integer> onSuccess,
			Callback<String> onError) 
	{
		
		try 
		{
			int result = a / b;
			onSuccess .process(result);
			
		}
		catch(Exception e) {
			
			onError.process(e.getMessage());
		}
	}
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("PLease enter 2 numbers: ");
		System.out.print("First number: ");
		int a=kb.nextInt();
		System.out.print("Second number:");
		int b=kb.nextInt();

		Callback<Integer> A = (Integer result) -> {result=a/b;System.out.println("Your expression is:"+result);};
		Callback<String> B = (String mess) -> {mess = "Error occurred: Division cannot be performed!";System.out.println(mess);};
		Divide(a,b,A,B);
				
			
	}

}
