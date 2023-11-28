//Power of  a is b a=2,b=10 a power b-> 2 ^10=1024

public class MyClass {
    public static int pow(int a,int b){
        if(b==0)return 1;   
        return a*pow(a,b-1);
    }  
    public static void main(String args[]) {
      int a=2;
      int b=10;
        System.out.println(a+ " Power "+b +"  is :" + pow(a,b) );
    }
}
