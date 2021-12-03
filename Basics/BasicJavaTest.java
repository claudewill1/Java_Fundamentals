import java.util.Arrays;
import java.util.List;

public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava test = new BasicJava();
        
        // Print 1-255
        test.print1To255();
        // Print odd 1-255
        test.printOdd1To255();
        // Sigma of 255 AKA Sum to 255
        System.out.println(test.sigmaOf255());
        // Iterate through an array
        int[] arr = {1,3,5,7,9,13};
        test.iterateArray(arr);
        // Find Max
        int[] arr2 = {-3,-5,-7};
        System.out.println(test.maxInArray(arr2));
        // Array with Odd Numbers
        System.out.println(Arrays.toString(test.arrOfOdds()));
        
        // Ninja Bonuses
        // Get Average
        int[] arr3 = {2,10,3};
        test.getAvgOfArr(arr3);
        // Greater than Y
        int y = 3;
        int[] arr4 = {1,3,5,7};
        System.out.println(test.greaterThanY(arr4, y));
        // Square the values
        int[] arr5 = {1,5,10,-2};
        System.out.println(Arrays.toString(test.squareValues(arr5)));
        // eliminate negative numbers
        int[] arr6 = {1,5,10,-2};
        System.out.println(Arrays.toString(test.eliminateNegative(arr6)));

        // Sensei bonus
        // return array of Max, Min, and Avg of an array of integers
        int[] maxMinAvgArr = {1,5,10,-2};
        System.out.println(Arrays.toString(test.maxMinAvg(maxMinAvgArr)));

        // Shift array elements left
        int[] shiftArr = {1,5,10,7,-2};
        System.out.println(Arrays.toString(test.shiftArrayLeft(shiftArr)));
    }    
}
