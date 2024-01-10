class TowerOfHanoi
{
    static int i=0;
    static void towerOFHanoi(int n, char from_peg,char to_peg, char aux_peg)
    {     
        if(n==1)
        {
            System.out.println("Move disk 1 from peg "+ from_peg+" to peg "+ to_peg);
            return ;
        }
        towerOFHanoi(n-1, from_peg, aux_peg,to_peg);
        System.out.println("Move disk "+n+" from peg " + from_peg+" to peg "+ to_peg);
        towerOFHanoi(n-1, aux_peg, to_peg, from_peg);
        System.out.println("Move disk "+n+" from peg " +from_peg+" to peg "+to_peg);
        towerOFHanoi(n-1, aux_peg, to_peg, from_peg);
    }
    public static void main(String[] args) {
        int n=3; 
        towerOFHanoi(n,  'a', 'c','b');
        System.out.println("Value of i "+i);
    }
}