import java.util.Scanner;
public class AsciiValues {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter A Char: ");
        String input = sc.nextLine();
        char ch = input.charAt(0);
        System.out.println("ASCII Value of "+ ch +" is "+ (int)ch);
    }
}
