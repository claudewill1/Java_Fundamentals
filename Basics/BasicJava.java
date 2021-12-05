import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.lang.Math;
import java.lang.reflect.Array;
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
    public int[] arrOfOdds() {
        return IntStream.iterate(1, i -> i + 2)
        .takeWhile(i -> i < 256)
        .toArray();
    }
    public int[] arrOfOdds(int n) {
        int[] arr = new int[((n+1)/2)];
        for(int i = 0, e = 1; i < arr.length; e += 2, i++){
            arr[i] = e;
        }
        return arr;
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
       
        int sum = 0;
        for (int i : arr) {
            if(i > y) sum += i;
        }
        return sum;
        
    }
    // square values of array
    public int[] squareValues(int[] arr){
        int[] squared = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            squared[i] = (int)Math.pow(arr[i],2);
        }
        return squared;
    }
    // Eliminate Negative Numbers from Array
    public int[] eliminateNegative(int[] arr) {
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            newArr[i] += i;
        }
        return newArr;
    }

    // Sensei Bonuses:
    // Max, Min, and Average
    public Integer[] maxMinAvg(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(arr);
        int sum = 0;
        res.add(arr[arr.length-1]);
        res.add(arr[0]);
        for (int integer : arr) {
            sum += integer;
        }
        res.add(sum/arr.length);
        Integer[] a = new Integer[res.size()];
        a = res.toArray(a);
        return a;

    }

    // Shifting the Values in the Array
    public int[] shiftArrayLeft(int[] arr) {
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            res[i] = arr[(1+i)%arr.length];
            
        }
        return res;
    }
}
