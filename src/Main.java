public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println("PrintOneAsterisk");
        triangle.PrintOneAsterisk();

        System.out.println("DrawAHorizontalLine");
        triangle.DrawAHorizontalLine(8);

        System.out.println("DrawAVerticalLine");
        triangle.DrawAVerticalLine(3);

        System.out.println("DrawRightTriangle");
        triangle.DrawRightTriangle(3);

        System.out.println("PrintIsoscelesTriangle");
        triangle.PrintIsoscelesTriangle(3);

        System.out.println("DrawDiamond");
        triangle.DrawDiamond(3);

        System.out.println("DrawDiamondWithName");
        triangle.DrawDiamondWithName(3,"Bill");

        System.out.println("print FizzBuzz number");
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printFizzBuzzNumber();

        System.out.println("print prime factors");
        PrimeFactors primeFactors = new PrimeFactors();
        primeFactors.printPrimeFactors(30);
    }
}
