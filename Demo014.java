public class Demo014 {
    public static void main(String[] args) {
        int a = 5;

        
        System.out.println("Pre-Increment:");
        System.out.println("Before: x = " + a); 
        System.out.println("++x = " + (++a));  
        System.out.println("After: x = " + a); 

        
        System.out.println("\nPost-Increment:");
        System.out.println("Before: x = " + a); 
        System.out.println("x++ = " + (a++));  
        System.out.println("After: x = " + a); 

        
        System.out.println("\nPre-Decrement:");
        System.out.println("Before: x = " + a); 
        System.out.println("--x = " + (--a));  
        System.out.println("After: x = " + a); 

        
        System.out.println("\nPost-Decrement:");
        System.out.println("Before: x = " + a); 
        System.out.println("x-- = " + (a--));  
        System.out.println("After: x = " + a); 
    }
}
