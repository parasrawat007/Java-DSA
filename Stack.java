class Stack {
    static final int Max=1000;
    int a[]= new int[Max];
    int top;
    
    boolean isEmpty()
    {
        return (top < 0) ? true : false;
    }
    
    Stack()
    {
        top=-1;
    }
    
    boolean push(int x)
    {
        if(top >= (Max-1))
        {
            System.out.println("Stack Overflow ");
            return false;
        }
        else
        {
            a[++top]=x;
            System.out.println(x + " Pushed into stack");
            return true;
        }
    }
    
    int pop()
    {
        if(top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int x = a[top--];
            return x;
        }
    }
    
    int peek()
    { 
        if(top < 0)
        {
            System.out.println("Stack Underflow");
            return 0; // You might want to handle this case differently based on your requirements
        }
        else
        {
            return a[top];
        }
    }
    
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.pop();       
    }
}