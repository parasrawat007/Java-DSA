public class testRecursion {
    public static void main(String[] args) {
        work(1);
    }    
    static void work(int n)
    {
        if(n>12000)
        {
            return;
        }
        System.out.println(n);
        work(n+1);
        
    }
}
