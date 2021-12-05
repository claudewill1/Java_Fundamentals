import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> numberList = new ArrayList<>();
        for(int i = 0; i < 11; i++){
            numberList.add((int)(Math.random()*20));
        }
        return numberList;
    }

    public char getRandomLetter() {
        Random ran = new Random();
        
        return (char)(ran.nextInt(26)+'a');
    }

    public String generatePassword() {
        char[] charArr = new char[8];
        Random ran = new Random();
        for(int i = 0; i < 8; i++) {
            charArr[i] = (char)(ran.nextInt(26)+'a');
        }
        return String.valueOf(charArr);
        
    }

    public ArrayList<String> getNewPasswordSet(int n) {
        Random ran = new Random();
        ArrayList<String> passwords = new ArrayList<>();
        int l = 8;
        for(int i = 0; i < n; i++){
            
            char[] pass = new char[l];
            // run inner loop length times
            // generate password of l length password
            for(int j = 0; j < l; j++) {
                pass[j] = (char)(ran.nextInt(26)+'a');
            }
            String pWord = String.valueOf(pass);
            passwords.add(pWord);
        }
        return passwords;

    }

    // Sensei bonus
    // overloading method for each datatype
    public Integer[] shuffleArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr) {
            list.add(i);
        }
        Collections.shuffle(list);
        Integer[] res = new Integer[list.size()];
        res = list.toArray(res);
        return res;
    }
    public Double[] shuffleArray(double[] arr) {
        List<Double> list = new ArrayList<>();
        for(double i : arr) {
            list.add(i);
        }
        Collections.shuffle(list);
        Double[] res = new Double[list.size()];
        res = list.toArray(res);
        return res;
    }
    public String[] shuffleArray(String[] arr) {
        List<String> list = new ArrayList<>();
        for(String s : arr) {
            list.add(s);
        }
        Collections.shuffle(list);
        String[] res = new String[list.size()];
        res = list.toArray(res);
        return res;
    }
}
