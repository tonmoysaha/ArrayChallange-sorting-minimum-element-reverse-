import java.util.Scanner;

public class ArrayChallange1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntArray = getArraylist(5);
        prinarraylist(myIntArray);
        System.out.println("avarage value: "+getAvarage(myIntArray));
    }

    private static int[] getArraylist(int array) {
        System.out.println("enter the scan value");
        int[] value = new  int[array];
        for (int i = 0 ; i< value.length ; i++)
        {
            value[i] = scanner.nextInt();
        }
       return value;
    }
    private static int[] prinarraylist(int[] array){
        for (int i=0 ; i< array.length ; i++){
            System.out.println("\n"+"index:"+i+"value"+array[i]);
        }
        return  array;
    }
    private static double getAvarage(int[] array){
        int sum =0 ;
        for (int i=0 ; i<array.length ; i++)
        {
            sum += array[i];
            System.out.println("\n"+"totall sum: "+sum);
        }
        return  (double)sum / (double)array.length;
    }
}
