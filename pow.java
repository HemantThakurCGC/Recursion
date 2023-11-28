//Power of  a is b a=2,b=10 a power b-> 2 ^10=1024

public class MyClass {  
    public static int pow(int a,int b){
        if(b==0)return 1;
      //  return a*pow(a,b-1);
      //Optimize Solution
      int ans=pow(a,b/2);
      if(b%2==0){
          return ans * ans;
      }
      return a*ans*ans;
    } 
    public static void main(String args[]) {
      int a=2;
      int b=9;
        System.out.println(a+ " Power "+b +"  is :" + pow(a,b) );
    }
}
