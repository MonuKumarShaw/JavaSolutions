package SortingStrivers;
import java.util.*;
public class sorting {
    public static void BubbleSort(int arr[]){
        for(int turn =  0;turn <arr.length-1;turn++){
            for(int j =0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        
    }



    // selection sort
    public static void SelectionSort(int arr[]){
        
        for(int i =0;i<arr.length-1;i++){
            int smallest = i;
           for(int j =i+1;j<arr.length;j++){
            if(arr[j]< arr[smallest]){
                smallest= j;
            }
           }
           //swap
           int temp = arr[i]; // 5
           arr[i] = arr[smallest]; //1
           arr[smallest] = temp; //5
        }
    }


    //Insertion sort


    public static void InsertionSort(int arr[]){
       for(int i =1;i<arr.length;i++){
        int curr = arr[i]; //4
        int prev = i-1;
        while(prev>=0 && arr[prev] >curr){
            arr[prev+1] = arr[prev];
            prev--;
        }
        arr[prev+1] = curr;

       }
    }

// counting sort
public static void CountingSort(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i =0;i<arr.length;i++){
        largest = Math.max(largest, arr[i]);
    }
    //create count array
    int count[] = new int[largest+1]; // +1 for includingg zero also
    // now filling count array
    for(int i =0;i<arr.length;i++){
        count[arr[i]]++; // logic
    }

    // now sorting
    int j =0;
    for(int i =0;i<count.length;i++){
     while(count[i]>0){
        arr[j] = i;
        j++;
        count[i]--;
     }
    }
}

    public static void printarr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {5,4,2,3,1};
        CountingSort(arr);
        printarr(arr);
    }
}
