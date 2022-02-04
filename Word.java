import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("HEY THERE, WELCOME TO PeaceInHisWord. Whats you're name??");
        String name = scan.nextLine();

        System.out.println("\nPleased to meet you " + name + "!.");
        System.out.println("\nSo tell me " + name + " how are you doing today? ");

        System.out.println("\n1. Extremely Happy ");
        System.out.println("2. Im okay");
        System.out.println("3. Sad");
        System.out.println("4. Depressed ");
        System.out.println("5. Insecure");
        System.out.println("6. Depressed");
        System.out.println("7. Lonely");
        System.out.println("8. Angry");

        int ans1 = scan.nextInt();

        if (ans1 == 1){

            System.out.println("\nThat is Amazing to hear!! ");
            System.out.println("\nWanna hear a  word of God regarding the happiness you're feeling? :)");
            System.out.println("\n1. Yes");
            System.out.println("2. No");
            int ans2 = scan.nextInt();

            if (ans2 == 1){
                System.out.println("\nSure !");
                System.out.println("\nAnd whoever trusts in the LORD, happy is he.");
                System.out.println("                                   - Proverbs 16:20");
            }
            else{
                System.out.println("No issues!!. ");
            }
        }

    }
    
}
