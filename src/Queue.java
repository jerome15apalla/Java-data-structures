public class Queue{
        int[] array;
        int front, rear; 
        int currentSize;
        int count;
        
         public Queue()
         {    
             front= -1; 
             rear = -1;
             currentSize = 10;
             count = 0;
             array = new int[currentSize];
         }
        public void Enqueue(int a)
        {
            //If Queue is empty, make front and rear equal to 0
            if(isEmpty())
            {
                front=0;
                rear=0; 
            }
            if(isFullQueue())
            {
                //void yung type pero may return
                //return 0;
                System.out.println("Queue overflow");
            }
            
            array[rear]=a;
            rear = (rear+1) % currentSize;
            count++;
        }
        public boolean isEmpty()
        {
            if(rear==-1){    
            return true;
            }
            return false;
        }
        public int DeQueue()
        {
            if(isEmpty())
            {
                return (Integer)null;
            }
            int temp = array[front];
            array[front]=0;
            front = (front+1)% currentSize;
            count--;
            return temp;
        }
        public boolean isFullQueue()
        {
            if(QueueSize()==currentSize){
            return true; 
            }
            return false;
        }
        public int QueueSize()
        {
            return count;
        }
}