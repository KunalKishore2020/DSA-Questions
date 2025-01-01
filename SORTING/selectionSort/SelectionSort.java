
import java.io.*;
import java.util.*;

class SelectionSort {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input for array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        // Creating and populating the array
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Creating an instance of Solution class and calling selectionSort
        Solution solution = new Solution();
        solution.selectionSort(arr);
        
        // Printing the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// } Driver Code Ends
class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        for(int i=0; i<=n-2; i++){
            int min = i;
            for(int j=i; j<=n-1; j++){
                if(arr[j]<arr[min]){
                   int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}