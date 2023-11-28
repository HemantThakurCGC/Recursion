//Print nth number series
public class MyClass {
    
    public static void printInc(int x){
        if(x==1){
            System.out.print(x+" ");
            return;
        }
        printInc(x-1);
        System.out.print(x+" ");
        
    }
    
    public static void printDesc(int x){
        if(x==1){
            System.out.print(x);
            return;
        }
        System.out.print(x+" ");
        printDesc(x-1);
    }
    
    public static void main(String args[]) {
      int x=10;
      System.out.println("Increasing Order");
      printInc(x);
      System.out.println();
      System.out.println("Descreasing Order");
      printDesc(x);
    }
}
