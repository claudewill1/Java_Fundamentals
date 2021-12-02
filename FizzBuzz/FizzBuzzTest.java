public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz test = new FizzBuzz();
        String[] word = {"Fizz","Buzz","FizzBuzz"} ;
        // Normal FizzBuzz method
        System.out.println(test.fizzBuzz(5));
        System.out.println(test.fizzBuzz(2));
        System.out.println(test.fizzBuzz(3));
        System.out.println(test.fizzBuzz(99));
        System.out.println(test.fizzBuzz(15));
        // Overloaded FizzBuzz method
        System.out.println(test.fizzBuzz(5, word[0], word[1], word[2]));
        System.out.println(test.fizzBuzz(4, word[0], word[1], word[2]));
        System.out.println(test.fizzBuzz(3, word[0], word[1], word[2]));
        System.out.println(test.fizzBuzz(15, word[0], word[1], word[2]));
        System.out.println(test.fizzBuzz(90, word[0], word[1], word[2]));
        
    }
}
