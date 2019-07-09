import java.util.Arrays;
import java.util.Scanner;

public class Sortingarray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = scanner.nextInt();
        int[] sortArray = getArraylist(number);
        System.out.println("\n");
        int[] newSortArray = reverseArray(sortArray);
        printArray(newSortArray);

    }

    public static int[] getArraylist(int array) {
        System.out.println("enter scan number:");
        int[] newArray = new int[array];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = scanner.nextInt();
        }

        return newArray;
    }
//    public static int[] reverseArray(int[] array){
//        for (int i = array.length-1 ; i >=0; i--){
//            System.out.println("index: "+i+"reversevalue"+array[i]);
//        }
//        return array;
//    }

    public static int[] reverseArray(int[] array) {
        int[] sortedArray = Arrays.copyOf(array,array.length);
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < sortedArray.length; i++) {
//            sortedArray[i] = array[i];
//        }
        boolean flag = true;
        int temp = 0;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static int[] printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("index: " + i + " reversevalue: " + array[i]);
        }
        return array;
    }
}
