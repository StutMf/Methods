import java.util.Scanner;
import java.util.Arrays;
public class Methods {
	static int co = 0;
    static int ch = 0;

	public static int[] sortInsert(int[] array) {
        int i, j, newValue;
        for (i = 1; i < array.length; i++) {
            newValue = array[i];
            j = i;
            while (j > 0 && array[j - 1] > newValue) {
                co++;
                array[j] = array[j - 1];
                j--;
            }
            ch++;
            array[j] = newValue;
        }
        return array;
    }

	public static int[] sortSelect(int[] array) {
	    for (int i = 0; i < array.length; i++) {
	        int min = array[i];
	        int min_i = i; 
	        for (int j = i+1; j < array.length; j++) {
	            if (array[j] < min) {
	                min = array[j];
	                min_i = j;
	            }
	        }
	        if (i != min_i) {
	            int tmp = array[i];
	            array[i] = array[min_i];
	            array[min_i] = tmp;
	        }
	     }
	     return array;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		final int arraySize = sc.nextInt();
		int[] a = new int[arraySize];
		System.out.println("Enter array elements with a space:");
		for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
		Methods.sortSelect(a);
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(a[a.length - 1]);
		/*int n = 10;
		int[] arr = new int[n];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}			

		/** DIVIDING ARR 
		*/
		/*
		int[] notDiv2 = new int[n / 2];
		int[] div2 = new int[n / 2];
		for (int i = 0; i < n; i+=2){
			div2[i / 2] = arr[i];
		}
		for (int i = 1; i < n; i+=2){
			notDiv2[i / 2] = arr[i];
		}
		div2 = sortInsert(div2);
		notDiv2 = sortSelect(notDiv2);

		/** OUTPUT
		*/
		/*
		int k = n / 2 + n % 2;
		System.arraycopy(div2, 0, arr, 0, k);
		System.arraycopy(notDiv2, 0, arr, k, k);	
		arr = sortInsert(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		*/
	}
}