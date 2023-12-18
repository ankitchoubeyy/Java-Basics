import java.util.*;
class Function {

    // creating a function
    public static int sumTwoNum(int a, int b) {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int add = sumTwoNum(a, b);
        System.out.println("Sum of two number is : " +add);
    }
}
