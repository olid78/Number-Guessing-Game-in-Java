import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        do{
            System.out.println("Guess The secret number :");
            userNumber = sc.nextInt();
            if ( userNumber == myNumber ){
                System.out.println("wohho you are the besttttt !!!");
                break;
            }
            else if ( userNumber > myNumber ){
                System.out.println("ops the number is small ");
                break;
            }
            else{
                System.out.println("opps the number is too large ");
                break;
            }

        } while (userNumber >= 0 ) ;

        System.out.print("My number was : ");
        System.out.println(myNumber);
    }
}