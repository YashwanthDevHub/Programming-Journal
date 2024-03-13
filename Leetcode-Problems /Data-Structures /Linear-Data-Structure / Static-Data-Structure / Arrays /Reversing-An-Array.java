package Simple;

import java.util.Arrays;
import java.util.Scanner;
public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How Many Numbers In Array = ");
        int n = in.nextInt();
        int[] array = new int[n];
        int[] temp = new int[array.length];
        InitializeTheArray(array);
        ReversingTheArray(array,temp);
    }
    public static void InitializeTheArray(int[] array) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
    }public static void ReversingTheArray(int[] array, int[] temp) {
        int k = temp.length - 1;
        for (int i = 0; i < array.length; i++) {
            temp[k--] = array[i];
        }
        System.out.println("After Reversing The String = " + Arrays.toString(temp));
    }
}
