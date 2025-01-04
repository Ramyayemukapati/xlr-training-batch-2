import java.util.Scanner;
public class dem7{
public static void main(String[] args) {
        String name;
        int age ; 
        long phno;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name");
        name = sc.nextLine();
        System.out.println("please enter your age");
        age = sc.nextInt();
        System.out.println("please enter your phno");
        phno = sc.nextLong();
        System.out.println("hello"+name+"ur age is"+age+"and phno"+phno);
}
}



    
