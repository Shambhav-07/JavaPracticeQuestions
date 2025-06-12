public class Set02Arrays {
    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 1, 9, 7, 5, 3};
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {6, 7, 8};
        int nums[] ={1,2,3,5,6};
//        System.out.println(secondLargest(arr));
//        System.out.println(secondSmallest(arr));
//        decendingSort(arr);
// for removing duplicates we need to sort the array first so we need to call both the function.
//        ascendingSort(arr);
//        removeDuplicate(arr);
//        MergeArarry(arr1,arr2);
//        compareArray(arr1,arr2);
//        LeftRotate(arr,3);
//        RightRotate(arr,3);
//        printEvenPos(arr);
//        printOddPos(arr);
//        SwapFirstLast(arr);
//        evenAndOdd(arr);
//        System.out.println(MissingElement(nums));

    }

    public static void evenAndOdd(int arr[]) {
        System.out.print("Even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.print("\nOdd numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static int MissingElement(int nums[]){
        int xor1=0;
        int xor2=0;
        for (int i = 0; i < nums.length-1; i++) {
            xor1 =xor1^(i+1);
            xor2 = xor2^nums[i];
        }
        xor1=xor1^nums.length;
        return xor1^xor2;
    }

        public static void SwapFirstLast ( int arr[]){
            int start = 0;
            int end = arr.length - 1;
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        public static void printOddPos ( int arr[]){
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        public static void printEvenPos ( int arr[]){
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        public static void RightRotate ( int arr[], int d){
            int n = arr.length;
            d = d % n;
            reverse(arr, d + 1, n - 1);
            reverse(arr, 0, d);
            reverse(arr, 0, n - 1);
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
        public static void LeftRotate ( int arr[], int d){
            int n = arr.length;
            d = d % n;
            reverse(arr, 0, d - 1);
            reverse(arr, d, n - 1);
            reverse(arr, 0, n - 1);
            for (int num : arr) {
                System.out.print(num + " ");
            }


        }
        private static void reverse ( int arr[], int start, int end){
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        public static void compareArray ( int arr1[], int arr2[]){
            boolean isequal = true;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1.length != arr2.length) {
                    isequal = false;
                    break;
                }
                if (arr1[i] != arr2[i]) {
                    isequal = false;
                    break;
                }
            }
            if (isequal) {
                System.out.println("Arrays are equals");
            } else {
                System.out.println("Arrays are not equals");
            }
        }
        public static void MergeArarry ( int arr1[], int arr2[]){
            int merged[] = new int[arr1.length + arr2.length];
            int k = 0;
            for (int i = 0; i < arr1.length; i++) {
                merged[k++] = arr1[i];
            }
            for (int i = 0; i < arr2.length; i++) {
                merged[k++] = arr2[i];
            }
            for (int i = 0; i < merged.length; i++) {
                System.out.print(merged[i] + " ");
            }
        }
        public static void removeDuplicate ( int arr[]){
            int n = arr.length;
            int temp[] = new int[n];
            int j = 0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    temp[j++] = arr[i];
                }
            }
            temp[j++] = arr[n - 1];
            for (int i = 0; i < j; i++) {
                System.out.print(temp[i] + " ");
            }
        }
        public static void decendingSort ( int arr[]){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
        public static void ascendingSort ( int arr[]){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        public static int secondSmallest ( int arr[]){
            int min = Integer.MAX_VALUE;
            int secondMin = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    secondMin = min;
                    min = arr[i];
                } else if (arr[i] < secondMin && arr[i] != min) {
                    secondMin = arr[i];
                }
            }
            return secondMin;
        }

        public static int secondLargest ( int arr[]){
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    secondMax = max;
                    max = arr[i];
                } else if (arr[i] > secondMax && arr[i] != max) {
                    secondMax = arr[i];
                }
            }
            return secondMax;
        }
    }

