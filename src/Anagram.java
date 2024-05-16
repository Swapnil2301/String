import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);

    }
        public static void main (String[]args){
            String word1 = "rescue";
            String word2 = "secure";
            System.out.print(isAnagram(word1,word2));
        }




}
