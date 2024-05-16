import java.util.Scanner;
public class Reverse_String {
    public static String Reverse(String text){
        String output  = "";
        for (int i = text.length() -1 ;i>=0;i--){
            output = output + text.charAt(i);
        }
        return output;
    }
    public static void main(String[] args) {
        String text = "Swapnil";
        System.out.println(Reverse(text));
        }
    }
