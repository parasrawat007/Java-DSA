class Stack2 {
    int size;
    int arr[];
    int top;  // Add this line to declare 'top'
    
    Stack2(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (size - 1 == top);
    }
    
    public int peek() {
        if (!this.isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }
    
    public void push(int element) {
        if (!isFull()) {
            top++;
            arr[top] = element;
            System.out.println("Pushed element is : " + element);
        } else {
            System.out.println("Stack is full now");
        }
    }
    
    public int pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("Popped element: " + arr[returnedTop]);
            return arr[returnedTop];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    
    public static void main(String[] args) {
        Stack2 o = new Stack2(10);
        o.push(0);
        o.push(1);
        o.push(2); 
        o.push(3);
        o.push(4);
        o.pop();
    }
}