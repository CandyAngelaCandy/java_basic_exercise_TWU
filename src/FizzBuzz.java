public class FizzBuzz {

    public void printFizzBuzzNumber() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(FizzBuzzNumber(i));
        }
    }

    public String FizzBuzzNumber(int number) {
        String result = number+"";

        if (number % 3 ==  0) {
            result = "Fizz";
        }

        if(number % 5 == 0){
            result = "Buzz";
        }

        if(number%3 == 0 && number%5==0){
            result = "FizzBuzz";
        }

       return result;
    }
}
