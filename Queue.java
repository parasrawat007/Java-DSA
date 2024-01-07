public class Queue {
    //Enqueue Opertations
    /*
     *  1. Check if queue is full
     *  2. If the queue is full, then print "Queue overflow"
     *  3. Assign Queue[Rear]=ELEMENT
     */

    //Dequeue operat 
    /*
        1. Check if queue is full
        2. If the queue is full, then print "Queue overflow"  
        3. Copy the element at the front of the queue to some temporary queue =QUEUE[FRONT]
        4. Increment Front By 1 
    */
    int front;
    int rear;
    int n;
    int queue[];
    Queue(int n)
    {
        this.n=n;
        queue=new int[n];
        front=rear=-1;
    }
    void Enqueue(int x)
    {
        if(rear ==n-1 )
        {
            System.out.println("Overflow");
        }
        else if(front==-1&&rear==-1)
        {
            front=rear=0;
            queue[rear]=x;
        }
        else
        {
            rear++;
            queue[rear]=x;
        }
    }
    void Dequeue()
    {
        if(front==-1&& rear==-1)
        {
            System.out.println("Underflow");
        }
        else if(front==rear)
        {
            front=rear=-1;
        }
        else
        {
            System.out.println("Dequeue item :: "+ queue[front]);
            front++;
        }
    }
    void Display()
    {
        System.out.println("Queue : ");
        for(int i=front;i<n;i++)
        {
            System.out.println(queue[i]);
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        for (int i = 0; i < 5 ; i++) {
            q.Enqueue(i);
        }
        q.Display();
        q.Dequeue();
        q.Display();
    }
}
