public class Reverse_Array_string {
    public static void main(String[] args) {
    String fruits [] = {"Apple","grapes","Kivi"};
    for (int i = 0;i<fruits.length;i++){
        fruits[i] =Reverse_String.Reverse(fruits[i]);
    }
        for(String fruit :fruits){
            System.out.print(fruit+" ");
        }
}
}
