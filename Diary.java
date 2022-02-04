import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

public class Diary {
    public static void main(String[] args) {
         //Stting up scanner.
        Scanner scan = new Scanner (System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d MMM uuu HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();   

        System.out.println("Hi there. Welcome back !! It is currently "+ dtf.format(now) + "." );
        scan.close();
    }

}
        
