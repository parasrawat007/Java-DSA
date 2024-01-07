public class Stackj {
    private int arr[];
    private int top;
    private int capacity;
    Stackj(int size)
    {
        arr= new int[size];
        capacity=size;
        top=-1;
    }
    public void push(int x)
    {
        if(isFull())
        {
            System.out.println("Overflow");
            System.exit(1);
        }
        System.out.println("Inserting :: "+x);
        arr[++top]=x;
    }
    public boolean isEmpty()
    {
        return (top==-1);
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return arr[top--];
    }
    public int size()
    {
        return top+1;
    }
    public boolean isFull()
    {
        return (capacity-1==top);
    }
    public void printStack()
    {
        System.out.println("Stack :: ");
        for(int i=0;i<=top;i++)
        {
            System.out.println(arr[i]);
        }
    }                    
    public static void main(String[] args) {
        Stackj s= new Stackj(10);
        s.push(10);        
        s.push(20);        
        s.push(30);
        s.printStack();   
        s.pop();
        s.printStack();
        System.out.println("Size :: "+s.size());
        System.out.println("Size :: "+s.size());
    }
}