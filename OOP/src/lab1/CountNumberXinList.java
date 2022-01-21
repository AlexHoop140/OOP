package lab1;

import java.util.Scanner;

public class CountNumberXinList {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many elements there are in the list: ");
        n  = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter list of number: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter element you want to count in the list: ");
        int x = scanner.nextInt();
        int cnt = 0;
        for (int k : array) {
            if (x == k)
                cnt++;
        }
        System.out.println("There are " + cnt + " number " + x + " in the list");

//        Arrays.sort(array);
        CountNumberXinList myObj = new CountNumberXinList();
        myObj.mergeSort(array);
        System.out.println("Sorted list: ");
        for (int j : array) {
            System.out.println(j);
        }
    }
    public void mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1) return; //base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //left array
        int j = 0; //right array

        for(; i < length; i++) {
            if(i < middle) {
                leftArray[i] = array[i];
            }
            else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; //indices

        //check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
