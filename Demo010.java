public class Demo010 {
    
    public static String getFizzBizz(int input) {
        
        if (input <= 0) {
            return "Error";
        }
        
       
        if (input % 3 == 0 && input % 5 == 0) {
            return "FIZZBIZZ";
        }
        
        
        if (input % 3 == 0) {
            return "FIZZ";
        }
        
        
        if (input % 5 == 0) {
            return "BIZZ";
        }
    
        return Integer.toString(input);
    }

    public static void main(String[] args) {
        
        System.out.println(getFizzBizz(33));  
        System.out.println(getFizzBizz(5));   
        System.out.println(getFizzBizz(15));  
        System.out.println(getFizzBizz(7));   
        System.out.println(getFizzBizz(0));   
        System.out.println(getFizzBizz(-3));  
    }
}
