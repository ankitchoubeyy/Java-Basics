import java.util.*;

class ConditonalStatements {
    public static void main(String[] args) {
        // If eles Statements
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter you age: ");
         * 
         * int age = sc.nextInt();
         * if (age > 18) {
         * System.out.println("You are adult");
         * }else{
         * System.out.println("You are minor");
         * }
         */

        // 2. Switch case Statements

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day Number: ");

        int dayNumber = sc.nextInt();
        sc.close();
        switch (dayNumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid number!");
                System.out.println("Valid Number Range: 1-7");
                break;
        }

    }
}
