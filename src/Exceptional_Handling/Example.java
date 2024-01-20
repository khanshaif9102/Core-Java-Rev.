package Exceptional_Handling;
     
     //how to create custom exceptions...
class AgeInvalidException extends Exception{
	AgeInvalidException(){
		super("Age is invalid");
	}
	AgeInvalidException(String message){
		super(message);
	}
	
}

public class Example {
	public static void main(String []args) {
		System.out.println("started....");
		try {
	int n1=	Integer.parseInt(args[0]);
	int n2=Integer.parseInt(args[1]);
		System.out.println("we have got two numbers..");
		int result=n1/n2;
		System.out.println("division is :"+result);
		
		if(n2<10) {
			throw new AgeInvalidException("my age is invalid");
		}
		
		}catch(ArithmeticException e) {
			System.out.println("n2 cannot be zero");
			System.out.println(e.getMessage());
		System.out.println("terminated");//ending point
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid input");
			System.out.println(e.getMessage());
		}
		catch(AgeInvalidException e) {
			System.out.println("Invalid n2");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("error !:"+e.getMessage());
		}
		finally {
			//always get executed irrespective of try catch
			System.out.println("i am in finally block");
			System.out.println("closing all resourcess");
		}
	}
}
