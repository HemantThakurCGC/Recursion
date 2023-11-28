//Find fact of a number using recursion

public class MyClass {
    
    public static int fact(int n){
        if(n==0){
            return 1;
        }
       // int small=fact(n-1);
        //int ans=n*small;
        return n*fact(n-1);
    }
    
    
    public static void main(String args[]) {
      int n=5;
          System.out.println("fact of "+n +" is :" + fact(n) );
    }
}
