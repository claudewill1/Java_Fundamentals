import java.io.*;
import java.util.*;
import java.lang.Math;
public class BasicJava {
    // Print 1-255
    public void print1To255(){
        for(int i = 1; i < 256; i++){
            System.out.println(i);
        }
    } 
    // Print odd numbers between 1-255 
    public void printOdd1To255() {
        for(int i = 1; i < 256; i++) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
    } 
    // Sigma of 255 AKA Sum to 255
    public int sigmaOf255() {
        int res = 0;
        for(int i = 1; i < 256; i++) {
            res += i;
        }
        return res;
    }
    // Iterating through an array
    public void iterateArray(int[] arr) {
        for(int i : arr){
            System.out.println(i);
        }
    }
    // Find Max in Array
    public int maxInArray(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n - 1];
    }
    // Array with Odd Numbers
    public int[] arrayOfOdds() {
        int n = (255/2);
        int[] y = new int[n];
        for(int i = 0; i < n; i++) {
            if(i % 2 == 1) y[i] += i;
        }
        return y;
    }
    // Ninja Bonuses
    // Get Average
    public void getAvgOfArr(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int avg = 0;
        for(int i : arr) {
            sum += i;
        }
        avg = sum/n;
        System.out.println(avg);
    }
    // Greater than Y
    public int greaterThanY(int[] arr, int y) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        
        int leftGreater = n;
        while(left <= right) {
            int mid = left + (right + left) / 2;
            if(arr[mid] > y) {
                leftGreater = mid;
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return (n - leftGreater);
        
    }
    // square values of array
    public int[] squareValues(int[] arr){
        int[] squared = new int[arr.length];
        for(int i : arr) {
            squared[i] = (int)Math.pow(arr[i],2);
        }
        return squared;
    }
    // Eliminate Negative Numbers from Array
    public int[] eliminateNegative(int[] arr) {
        int[] newArr = new int[arr.length - 1];
        for(int i : arr) {
            if(arr[i] >= 0) newArr[i] += arr[i];
        }
        return newArr;
    }
}
