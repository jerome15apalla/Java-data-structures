import java.util.Scanner;

public class lastNames {

 
       public static void main(String[] args) {

             // TODO Auto-generated method stub
             ListI<String> list = new LinkedList<String>();
             Scanner input = new Scanner(System.in);
             String name,crush;
             int first=4, second=5;
             
             System.out.println(first+" "+second);
            		 
             
             for(int i=0;i<10;i++) {
            	 	name=input.next();
                    list.addLast(name);
             }

             for(int i=0;i<first;i++) {
            	 	name=input.next();
                    list.addFirst(name);
             }
             
             System.out.println(list.peekFirst());

             for(int i=0;i<second;i++) {
            	 list.removeLast();
             }
             
             crush=input.next();
             if(list.contains(crush)){
            	 System.out.println("true");
            	 list.remove(crush);
             }else{
            	 System.out.println("false");
            	 
             }
             
             System.out.println(list.peekLast());
             System.out.println(list.size());
             
             input.close();
       }
}