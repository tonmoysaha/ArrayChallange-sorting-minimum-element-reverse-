import java.util.Scanner;

public class FindMinimumElement {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter count: ");
        int count = scanner.nextInt();
        int[] element = readIntegers(count);

        int minimumVAlue = findMinimumElement(element);
        System.out.println("The minimum Value: "+ minimumVAlue);

        int minimumVAlue2 = findMinimumElement2(element);
        System.out.println("The minimum Value in second process: "+ minimumVAlue2);

    }
    private static int[] readIntegers(int count){

        int[] array = new int[count];
        for (int i=0 ; i< array.length ; i++)
        {
            System.out.println("enter number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }
    private static int findMinimumElement(int[] array){
        int min = Integer.MAX_VALUE;

        for (int i=0; i<array.length ; i++){
            int value = array[i];
            if (min > value){
                min = value;
            }
        }
        return  min;
    }
    //other process to minimum value
    private static int findMinimumElement2(int[] array){
        int min = array[0];
        for (int i=0; i<array.length ; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
