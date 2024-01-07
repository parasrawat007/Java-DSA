public class QueueTest {
    private int maxSize;
    private int front;
    private int rear;
    private int currentSize;
    private int queueArray[];
    
    public QueueTest(int maxSize)
    {
        this.maxSize=maxSize;
        this.front=0;
        this.rear=-1;
        this.currentSize=0;
        this.queueArray=new int[maxSize];
    }

    public void enQueue (int data)
    {
        //check if queue is full before entering new data
        if (isQueueFull())
        {
            throw new RuntimeException("Queue is Full");
        }
        //we have to wrap the queue in case max size has reached 
        if(rear ==maxSize-1)
        {
            rear = -1;
        }
        queueArray[++rear]=data;
        System.out.println(data+" :: is added int the queue");
        currentSize++;
    }
    public int deQueue()
    {
        //checking if queue is empty before removing new item
        if(isQueueEmpty())
        {
            throw new RuntimeException("Queue is empty");
        }
        int result=queueArray[front++];
        System.out.println(result +" :: is removed in Queue");
        //We have to wrap the queue in case max suze has reached
        if(front==maxSize)
        {
            front=0;
        }
        currentSize--;
        return result; 
    }
    public  boolean isQueueEmpty()
    {
        return currentSize==0;
    }
    public boolean isQueueFull()
    {
        return maxSize==currentSize;
    }
    public int size()
    {
        return currentSize;
    }
    public static void main(String[] args) {
        QueueTest queue = new QueueTest(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        System.out.println("Size is :: "+queue.size());
        queue.deQueue();
        System.out.println("Size is :: "+queue.size());
        queue.deQueue();
        System.out.println("Size is :: "+queue.size());
        queue.enQueue(70);
        System.out.println("Size is :: "+queue.size());

    }
}
