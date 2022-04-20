import java.util.Scanner;

public class GuessTheNumber{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int)(Math.random()*100);  // Here Random number get generated
        int i;
        
        System.out.println("Guess the correct number ...");
        System.out.println("You have 7 Chance ... Let's Go ....");

        for(i=0; i<7; i++){
            System.out.print("Enter the number between 1 to 100 : ");
            int n = sc.nextInt();
            if(n == randomNumber){
                System.out.println("Woohooo... Congratulations ! You got it ...");
                break;
            }else if(n < randomNumber){
                System.out.println("your Number is too small...");
            }else{
                System.out.println("Your Number is too large...");
            }
            System.out.println((6-i) + " Chance remaining");
        }
        
        if(i==7){
            System.out.println("You have Exhausted your 7 trials...");
            System.out.println("---------- GAME OVER - TRY AGAIN ----------");
            System.out.println("The Number was : " + randomNumber);
        }
    }
}