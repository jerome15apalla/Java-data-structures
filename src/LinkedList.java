public class LinkedList<E> implements ListI<E>{

       class Node<E>{

             E data;

             Node<E> next;

             public Node(E obj) {

                    data=obj;

                    next=null;

             }

       }

       private Node<E> head;

       private Node<E> tail;

       private int currentSize;
       
       public LinkedList() {

             head=null;

             tail=null;

             currentSize=0;

       }

       public void addLast(E obj) {

             Node<E> node = new Node<E>(obj);

             if(head==null) {

                 head = tail = node;

                 currentSize++;

                 return;

          }
          
          tail.next = node;
          tail = node;

          currentSize++;

       }
       
       public E removeFirst() {

           if(head == null) {

                  return null;

           }

           E temporary = head.data;

           if(head == tail) {

                  head=tail=null;

           }else {

                  head=head.next;

           }

           currentSize--;

           return temporary;

     }
       
       public E removeLast() {
             if(head == null) {

                    return null;

             }

             if(head == tail) {

                    return removeFirst();

             }

             Node<E> current = head,previous = null;

             while(current != tail) {

                    previous = current;

                    current = current.next;

             }

             previous.next = null;

             tail=previous;

             currentSize--;

             return current.data;

       }

       public void balance(String closing) {
    	   
    	   if(head==null) { 
    		   currentSize++;	
    		   return;			
    	   }
    	   
    	   switch(closing) {
    	   
	    	   case ")":
	    		   if((tail.data).equals("(") )
	    			   removeLast();  
	    		   break;
	    	   case "]":
	    		   if((tail.data).equals("[") )
	    			   removeLast();
	    		   break;
	    	   case "}":
	    		   if((tail.data).equals("{") )
	    			   removeLast();
	    		   break;
    	   }
       }
       
       public boolean answer() {
    	   if(currentSize==0) {
    		   return true;
    	   }

    	   return false;
       }

}