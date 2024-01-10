class Recursion {
    //Solving Reccurence realtion 
    /*
     * 1.Master Theorm 
     *    T(n)=aT(n/b)+ theta(n^k log^p n)
     *    constraint -->  where a>=1 ,b>1,k>=0 and p is a real number 
     *     case 1: 
     *           if(a>b^k) then T(n)= theta (n^log b^a )
     *     case 2:
     *           if(a=b^k) and 
     *            (a) if(p<-1 ) then T(n)=Theta(n log ^ba)
     *            (b) if(p=-1 ) then T(n)=Theta(n log ^ba log^2 n)
     *            (c) if(p>-1 ) then T(n)=Theta(n log ^ba log^p+1 n)
     *     case 3:
     *           if(a<b^k) and 
     *            (a) if p<0 then T(n)=Theta (n^k)
     *            (b) if p>=0 then T(n)=Theta( n^k log^pn)
      * 
     * 2.Substituition method
     * 3.Recursion Tree
     */
    public static void main(String[] args) {
        MyMethod();    
    }
    private static void MyMethod()
    {
        System.out.println("This is my method");
        MyMethod();   
    }
}