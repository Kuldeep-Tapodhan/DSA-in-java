package BasicJava.Recursion;

public class Minimuncost_Frog_Jump {
    public  static  int Minicost(int[] h,int n,int i){
        if (i ==n-1) {
            return 0;
        }

        int op1= Math.absx + Minicost(h,n,i+1);
        if(i==n-2)return  op1;
        int op2= Math.abs(h[i] -h[i+2]) + Minicost(h,n,i+2);

        return Math.min(op1,op2);
    }

    public static void main(String[] args) {
        int[] cost={10,30,40,20};

        System.out.println(Minicost(cost,cost.length,0));

    }
}
