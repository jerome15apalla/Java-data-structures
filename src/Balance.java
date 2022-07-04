import java.util.Scanner;

public class Balance {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		ListI<String> list = new LinkedList<String>();
		String expr,element;
		int currentSize = 100;
		
		double dooo;
		
		String s = "Computers have lots of memory";
		System.out.println(s.charAt(16));
		
		//dooo=Double.parseDouble(input.nextInt());
		
		System.out.print("Expression: ");
		expr =input.next();
		
		for(int x=0;x<expr.length();x++) {
			element=Character.toString(expr.charAt(x));
			
			if(element.equals("(") || element.equals("[") || element.equals("{"))
				list.addLast(element);	
			else if(element.equals(")") || element.equals("]") || element.equals("}"))
				list.balance(element);			
		}
		
		System.out.println(""+2+5+"");
		
		System.out.println(list.answer());
	}
	
	public void addLast() {
System.out.println("saihasda");
  }
}
