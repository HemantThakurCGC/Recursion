//Sum of Digits 1234->1+2+3+4=10

public class MyClass {
    
    public static int sum(int n){
        if(n>=0 && n<=9){
            return n;
        }
        //int smallans=sum(n/10);
        // int ans=smallans+n%10;
        return sum(n/10)+n%10;
    }
    public static void main(String args[]) {
      int n=923;
      System.out.println("Sum  of "+n +"  is :" + sum(n) );
    }
}
