import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] reverseElement = {1,2,3,4,5};
        System.out.println("the oeginal value: "+ Arrays.toString(reverseElement));
        reverseArray(reverseElement);
        System.out.println("the reverse element: "+ Arrays.toString(reverseElement));
    }
    private static int[] reverseArray(int[] array){
        int maxIndex = array.length-1;
        int halfIndex = array.length/2;
        for (int i=0; i< halfIndex ; i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
        return  array;
    }
}
