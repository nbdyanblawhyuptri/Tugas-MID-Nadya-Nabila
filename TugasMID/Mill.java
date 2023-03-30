//Nadya Nabila Wahyuputri_13020210127
import java.util.Scanner;
public class Mill {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int mill, km  ;
            System.out.print("Mil : ");
            mill = input.nextInt();



          km = (int) (mill*1609);
            
            System.out.println("Hasil dari "+ mill +" Mill, Adalah : ");
            System.out.println(km+" Meter ");
        }
    }
    
}