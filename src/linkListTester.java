public class linkListTester {

       public static void main(String[] args) {

             // TODO Auto-generated method stub

             ListI<Integer> list = new LinkedList<Integer>();

             int n=10;

             for(int i=0;i<n;i++) {
                    list.addFirst(i);
             }

             for(int i=0;i<n;i++) {
                    list.addLast(i);
             }

             list.removeFirst();

             list.removeLast();

             list.remove(8);

             System.out.println(list.contains(8));

             System.out.println(list.peekFirst());

             System.out.println(list.peekLast());

             System.out.println(list.size());

       }

 

}