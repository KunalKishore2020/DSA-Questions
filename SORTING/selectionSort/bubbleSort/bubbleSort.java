package bubbleSort;

import java.io.IOException;
import java.util.Scanner;

class bubbleSort {
   
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
           solution.bubbleSort(arr);
           
           // Printing the sorted array
           System.out.println("Sorted array:");
           for (int i = 0; i < n; i++) {
               System.out.print(arr[i] + " ");
           }
       }
   }
   
   class Solution {
       // Function to sort the array using bubble sort algorithm.
       public static void bubbleSort(int arr[]) {
           int n = arr.length;
           for(int i = 0; i <= n-1; i++){
               int max = i;
               for(int j = i+1; j<= n-1; j++ ){
                   if(arr[j] < arr[max]){
                       int temp = arr[max];
                       arr[max] = arr[j];
                       arr[j] = temp;
                   }
               }
           }
       }
   }
   

