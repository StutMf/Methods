import java.util.Scanner;
import java.util.Arrays;
public class Methods {
	static int co = 0;
    static int ch = 0;

	public static int sortInsert(int[] array) {
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
        for (i = 0; i < array.length; i++) {
        	return array[i];
        }
    }

	public static int sortSelect(int[] arr){
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
	        return arr[i];
	     }
	}

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] notDiv2 = new int[5];
		int[] div2 = new int[5];
		for (int i = 0; i < 10; i++) {
			
		}

	}
}