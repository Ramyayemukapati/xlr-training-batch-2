public class Demo015 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping (using temp variable): a = " + a + ", b = " + b);
    }
}
