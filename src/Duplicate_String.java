public class Duplicate_String {
    public static void main(String[] args) {
        String[] array= {"Swapnil","AWAASSASDC","Swapnil","jk","jk","qwert","asdf"};
        for(int i = 0;i<array.length;i++){
            for(int j = i+1;j<array.length;j++){
                if(array[i].equals(array[j])){
                    System.out.println(array[i]);
                }
            }
        }
    }
}
