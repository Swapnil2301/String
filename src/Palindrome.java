import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a String to Check:  ");
        String text  = Sc.nextLine();
        String rev_text = Reverse_String.Reverse(text);
        System.out.println(rev_text);
        if(text.equals(rev_text)){
            System.out.println("Its is Palindrome");
        }
        else{
            System.out.println("It is not Palindrome");
        }


    }
}
