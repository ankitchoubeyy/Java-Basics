
// importing the java.util is mandatory to use the input fucntion like scanner
import java.util.*;

class Input {
    public static void main(String[] args) {
        System.out.println("Enter Your name: ");
        // Taking input
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // .nextLine will fetch the whole line
        sc.close();
        
        System.out.println(name);

        System.out.println("Enter Your age: ");
        int age = sc.nextInt();
        System.out.println(age);

    }

}
