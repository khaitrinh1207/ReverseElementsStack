import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElement {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng : ");
        size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" Nhập phần tử "+(i+1)+" :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng ban đầu : "+ Arrays.toString(arr));
        resever(arr);
    }

    private static void resever(int[] arr){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("Mảng sau khi đảo ngược : "+Arrays.toString(arr));
    }
}