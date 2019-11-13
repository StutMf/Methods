import java.util.Scanner;
import java.util.Arrays;
public class Methods {
	static int co = 0;
    static int ch = 0;

	public static void sortinsert(int[] array) {
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
            System.out.print(array[j]);
        }
    }

	public static void sortselect(int[] arr){
	    for (int i = 0; i < arr.length; i++) {
	        int min = arr[i];
	        int min_i = i; 
	        for (int j = i+1; j < arr.length; j++) {
	            if (arr[j] < min) {
	                min = arr[j];
	                min_i = j;
	            }
	        }
	        if (i != min_i) {
	            int tmp = arr[i];
	            arr[i] = arr[min_i];
	            arr[min_i] = tmp;
	        }
	        System.out.print(arr[i]);
	     }
	}

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		int[] notDivid2 = new int[5];
		int[] divid2 = new int[5];
		int j = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				divid2[j] = arr[i];
				j++;
			}
			else {
				notDivid2[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < 5; i++) {
			sortinsert(divid2[i]);
			sortselect(notDivid2[i]);
		}
	}
}