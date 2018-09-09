import java.util.stream.IntStream;

public class Triangle {

    private int count;

    Triangle(int count) {
        this.count = count;
    }

    Triangle() {

    }

    public void PrintOneAsterisk() {
        System.out.println("*");
    }

    public void DrawAHorizontalLine(int count) {
        String asterisks = "";
        for (int i = 0; i < count; i++) {
            asterisks += "*";
        }
        System.out.println(asterisks);
    }

    public void DrawAVerticalLine(int count) {
        String asterisks = "";
        for (int i = 0; i < count; i++) {
            asterisks += "*\n";
        }
        System.out.print(asterisks);
    }

    public void DrawRightTriangle(int count) {
        String asterisks = "";
        for (int i = 1; i <= count; i++) {
            String line = "";
            for (int j = 0; j < i; j++) {
                line += "*";
            }
            asterisks += line + "\n";
        }
        System.out.print(asterisks);
    }

    public String[] DrawIsoscelesTriangle(int count) {
        String[] asterisksArr = new String[count];
        String result = "";
        for (int i = 0; i < count; i++) {
            String line = "";
            for (int j = 0; j < 2 * i + 1; j++) {
                line += "*";
            }
            String space = "";
            for (int k = count - 1 - i; k > 0; k--) {
                space += " ";
            }
            String asterisks = space + line + space+"\n";
            result += space + line + space + "\n";
            asterisksArr[i] = asterisks;
        }
        return asterisksArr;

    }

    public void PrintIsoscelesTriangle(int count) {
        String[] asterisksArr = DrawIsoscelesTriangle(count);
        for (int i = 0; i < count; i++) {
            System.out.print(asterisksArr[i]);
        }
    }


    public void DrawDiamond(int count) {
        PrintIsoscelesTriangle(count);
        String[] asterisksArr = DrawIsoscelesTriangle(count);
        for (int i = count-2; i >= 0; i--) {
            System.out.print(asterisksArr[i]);
        }
    }

    public void DrawDiamondWithName(int count,String name) {
        String[] asterisksArr = DrawIsoscelesTriangle(count);
        for (int i = 0; i < count-1; i++) {
            System.out.print(asterisksArr[i]);
        }
        System.out.println(name);
        for (int i = count-2; i >= 0; i--) {
            System.out.print(asterisksArr[i]);
        }
    }
}
