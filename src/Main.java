import java.lang.Integer;
public class Main {
    public static void main(String[] args) {

        Maximum maxx = new Maximum();
        Integer[] numList = {22, 100, 41, -5, 555, -22222, 33};
        System.out.println(maxx.maximum(numList));

        NumberInWord numberInWord = new NumberInWord();
        System.out.println(numberInWord.printNumberInWord(9));
        System.out.println(numberInWord.printNumberInWord(8));
        System.out.println(numberInWord.printNumberInWord(7));

        CheckOddEven checkOddEven = new CheckOddEven();
        checkOddEven.checkOddEven(9);
        checkOddEven.checkOddEven(8);
        checkOddEven.checkOddEven(22);
        checkOddEven.checkOddEven(444);
        checkOddEven.checkOddEven(333);

    }
}