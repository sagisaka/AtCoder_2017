import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        String[] lines = line.split(",");
        for(String i:lines){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
