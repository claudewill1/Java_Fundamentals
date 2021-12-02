public class FizzBuzz {
    public String fizzBuzz(int number) {
        String r = (number%3 == 0 && number % 5 == 0) ? "FizzBuzz" : (number % 5 == 0) ? "Buzz" : (number % 3 == 0) ? "Fizz" : String.valueOf(number);
        return r;
    }

    public String fizzBuzz(int number,String multOf3, String multOf5, String multof3And5){
        return (number % 5 == 0 && number % 3 == 0) ? multof3And5 : (number % 5 == 0) ? multOf5 : (number % 3 == 0) ? multOf3 : String.valueOf(number);
        
    }
}
