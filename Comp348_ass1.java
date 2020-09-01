// -------------------------------------Question 1
public class Comp348_ass1 {
	// Question 1
	
	interface Interface1
	{
		double a();
	}
	interface Interface2
	{
		String a (int a );
	}
	interface Interface3
	{
		boolean c (int a,String s);
	}

	public static void main(String[] args) 
	{
		
		Interface1 obj= () -> 5.5;	
		Interface2 obj1=(int a)-> String.format("The number is %d",a);
		Interface3 obj2= (int a,String s)-> a == Integer.parseInt(s);
		//using lambda expression no parameter
		System.out.println(obj.a());
		//using lambda expression with one parameter
		System.out.println(obj1.a(5));
		//using lambda expression with multiple parameters
		System.out.println(obj2.c(5,"5"));
		
	}

}
