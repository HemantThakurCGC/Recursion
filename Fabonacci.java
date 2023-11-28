//Print nth fabonacci number
public class MyClass { 
    public static int fab(int n){
        if(n==0 || n==1){
            return n;
        }
  //      int prev=fab(n-1);
//        int pprev=fab(n-2);
        return fab(n-1)+fab(n-2);
    }   
    public static void main(String args[]) {
      int n=9;
      System.out.println("fibonacci of "+n +"  number is :" + fab(n) );
    }
}
