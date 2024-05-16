public class AplphabeticalOrder {
    public static void main(String[] args) {
        String[] array ={"Swapnil","Ajay","ssacaw","Who??"};
        String temp;
        for (int i = 0;i<array.length;i++) {
            for (int j =i+1;j<array.length;j++){
                if(array[i].compareTo(array[j])>0){
                    temp =array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for(int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
