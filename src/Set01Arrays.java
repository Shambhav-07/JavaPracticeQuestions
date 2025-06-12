//Array Problems ( Basic problems - Set 01 )
//        1.Declare and initialize an array


import java.util.*;

//        class Question1 {
//    public static void main(String[] args) {
//        int nums [] = {10,20,30,40,50};
//        for(int num:nums){
//            System.out.print(num+",");
//        }
//    }
//}

//        2.Take input and store in array
//class Question2{
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the size of an array");
//        int n = in.nextInt();
//
//        int nums[] = new int[n];
//
//        System.out.println("Enter " +n+ " integers: ");
//        for (int i = 0; i < n; i++) {
//             nums[i]= in.nextInt();
//        }
//        //print
//        for (int num:nums) {
//            System.out.print(num+",");
//
//        }
//    }
//}

//        3.Print all elements of an array
//class Question3{
//    public static void main(String[] args) {
//        int arr[] = {10,20,30,40,50};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+",");
//        }
//    }
//}

//        4.Find the length of an array
//class Question4{
//    public static void main(String[] args) {
//        int arr[] ={10,20,30,40,50};
//        System.out.println("Length of an array = "+arr.length);
//    }
//}

//        5.Access specific index
//class Question5{
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int arr[] = {10,20,30,40,50};
//        System.out.println("Enter the index number: ");
//        int i = in.nextInt();
//        System.out.println("Array element in "+i+" index = "+arr[i]);
//
//    }
//}

//        6.Sum of all elements

//class Question6{
//    public static void main(String[] args) {
//        int nums[]={10,20,30,40,50};
//        int sum =0;
//        for(int num:nums){
//            sum += num;
//        }
//        System.out.println("Sum of given array ="+sum);
//    }
//}

//        7.Average of array elements
//class Question7{
//    public static void main(String[] args) {
//        int nums[]={10,20,30,40,50};
//        int n = nums.length;
//        int sum=0;
//        double average=0;
//        for(int num:nums){
//            sum+= num;
//            average = sum/n;
//        }
//        System.out.println("Average of an array = "+average);
//
//    }
//}

//        8.Find maximum element
//class Question8{
//    public static void main(String[] args) {
//        int nums[]={30,20,60,40,12};
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]>max){
//                max = nums[i];
//            }
//        }
//        System.out.println("Maxmium element is array = " +max);
//    }
//}

//        9.Find minimum element

//class Question9{
//    public static void main(String[] args) {
//        int nums[]={30,20,60,40,12};
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]<min){
//                min = nums[i];
//            }
//        }
//        System.out.println("Minimum element is array = " +min);
//    }
//}

//        10.Count even and odd elements
//class Question10{
//    public static void main(String[] args) {
//        int arr[] ={1,2,3,4,5};
//        int oddCount=0;
//        int evenCount=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]%2==0){
//                evenCount++;
//            }else {
//                oddCount++;
//            }
//        }
//        System.out.println("Total number of odd elements in array = "+oddCount);
//        System.out.println("Total number of even elements in array = "+evenCount);
//    }
//}

//        11.Reverse the array
//class Question11{
//    public static void main(String[] args) {
//        int arr[] = {10,20,30,40,50};
//        int start=0;
//        int end = arr.length-1;
//        for (int i = start; i < end; i++) {
//            int temp = arr[start];
//            arr[start]=arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//            System.out.println("Reversed Array: "+Arrays.toString(arr));
//    }
//}

//        12.Copy one array into another
//class Question12{
//    public static void main(String[] args) {
//        int orginalArray[] ={10,20,30,40,50};
//        System.out.print("Orginal array: ");
//        for(int num:orginalArray){
//            System.out.print(num+",");
//        }
//        System.out.println();
//        int copyArray[] =new int[orginalArray.length];
//        int index=0;
//        for (int num: orginalArray){
//            copyArray[index++] = num;
//        }
//        System.out.print("Copied array: ");
//        for(int num:copyArray){
//            System.out.print(num+",");
//        }
//        System.out.println();
//    }
//}

//        13.Search for an element (Linear Search)

//class Question13 {
//    public static void main(String[] args) {
//        int arr[] = {20, 10, 50, 40, 30};
//        int target = 50;
//        boolean found = false;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                System.out.println("Target element " + target + " found at index " + i);
//                found = true;
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println("Target element " + target + " is not found in the given array.");
//        }
//    }
//}

//        14.Check if array contains a value
//class Question14{
//    public static void main(String[] args) {  // using binary search
//        int arr[] = {10, 20, 30, 40, 50};
//        int key = 50;
//        int start = 0;
//        int end = arr.length-1;
//        boolean found = false;
//        while (start<=end){
//            int mid =start+(end-start)/2;
//
//            if (key==arr[mid]){
//                System.out.println("Element "+key+" found in given array");
//                found =true;
//                break;
//            }
//            else if(arr[mid]<key){
//                start =mid+1;
//            }
//            else {
//                end = mid-1;
//            }
//        }
//        if (!found){
//            System.out.println("Element "+key+" not found in given array");
//        }
//    }
//}

//        15.Count occurrences of an element
//class Question15{
//    public static void main(String[] args) {
//        int arr[] = {10,20,30,10,50,10,70};
//        int key = 10;
//        int count =0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==key){
//                count++;
//            }
//        }
//        if (count > 0) {
//            System.out.println("Element " + key + " occurs " + count + " times.");
//        } else {
//            System.out.println("Element " + key + " does not exist in the array.");
//        }
//    }
//}
