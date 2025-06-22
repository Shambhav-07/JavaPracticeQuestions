//31.Delete element from array.
//32.Remove all occurrences of an element.
//33.Replace an element at given index.
//34.Swap two elements in array.
//35.Remove duplicates from array.
//36.Shift all zeros to end.
//37.Replace even numbers with 0.
//38.Replace negative numbers with their square.
//39.Double each element in array.
//40.Replace prime numbers with-1.
import java.util.Arrays;

public class Set03Arrays {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int[] replacePrimesWithMinusOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                arr[i] = -1;
            }
        }
        return arr;
    }


    public static int[] Double_each_element_in_array(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=arr[i];
        }
        return arr;
    }

    public static int[] negative_numbers_with_their_square(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                arr[i]*=arr[i];
            }
        }
        return arr;
    }
    public static int[] replaceEvenWith0(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                arr[i] =0;
            }
        }
        return arr;
    }

    public static int[] ShiftZerotoend(int arr[]){
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
            while (j<arr.length){
                arr[j] =0;
                j++;
            }

        return arr;
    }

    public static int removeDuplicates(int[] arr) {
        int j=1;
        for(int i =1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }
    public static void swapTwoElementsInArray(int arr[],int i,int j){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }
    public static void replace_an_element_at_given_index(int arr[],int index,int element){
        arr[index] = element;
        System.out.print(Arrays.toString(arr));
    }
    public static void remove_All_Occurrences_of_An_element(int arr[],int target){
        int count=0;
        for (int i = 0, j=0; i <arr.length ; i++) {
            if (arr[i]!=target){
               count++;
            }
        }

        int newArr[] = new int[count];
        for (int i = 0, j=0; i <arr.length ; i++) {
            if (arr[i]!=target){
                newArr[j++] =arr[i];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static void Delete_element(int arr[],int indextoDelete){
        if(indextoDelete<0 || indextoDelete>arr.length-1){
            System.out.println("Invalid index");
        }
        else{
            int newArr[] = new int[arr.length-1];
            for (int i = 0 ,j=0; i <arr.length ; i++) {
                if (i!=indextoDelete){
                    newArr[j++] = arr[i];
                }
            }
            System.out.println(Arrays.toString(newArr));
        }

    }


    public static void main(String[] args) {
        int arr3[]={-1,-2,3,4,-5,-6};
        int arr1[] = {1,2,3,4,5,6};
        int arr[]= {10,20,20,30,40,50};
        int arr2[] = {10,30,0,40,0,80,60,0};
//        System.out.println(Arrays.toString(replacePrimesWithMinusOne(arr1)));
//        System.out.println(Arrays.toString(Double_each_element_in_array(arr1)));
//        System.out.println(Arrays.toString(negative_numbers_with_their_square(arr3)));
//        System.out.println(Arrays.toString(replaceEvenWith0(arr1)));
//        System.out.println(Arrays.toString(ShiftZerotoend(arr2)));
//        Delete_element(arr,2);
//        remove_All_Occurrences_of_An_element(arr,20);
//        replace_an_element_at_given_index(arr,2,60);
//        swapTwoElementsInArray(arr,3,4);
//        System.out.println(removeDuplicates(arr));
//        for (int num : arr){
//            System.out.print(num+" ");
//        }
    }
}
