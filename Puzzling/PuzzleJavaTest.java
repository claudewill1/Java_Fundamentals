import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava test = new PuzzleJava();
        // create an ArrayList containing 10 numbers between 1 and 20
        System.out.println(test.getTenRolls());
        // getRandomLetter
        System.out.println(test.getRandomLetter());
        // generatePassword
        System.out.println(test.generatePassword());
        // get list of N - 8 character passwords
        System.out.println(test.getNewPasswordSet(8));

        // Sensei Challenges
        // shuffle an array, this method can take and return an array of any type
        int[] nums = {1,5,6,3,8,9,3,10,15};
        System.out.println(Arrays.toString(test.shuffleArray(nums)));
    }
}
