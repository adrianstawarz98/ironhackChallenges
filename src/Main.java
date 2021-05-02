import java.lang.Integer;
public class Main {
    public static void main(String[] args) {
        // Maximum number
        Maximum maxx = new Maximum();
        Integer[] numList = {22, 100, 41, -5, 555, -22222, 33};
        System.out.println(maxx.maximum(numList));
        // Print number in word
        NumberInWord numberInWord = new NumberInWord();
        System.out.println(numberInWord.printNumberInWord(9));
        System.out.println(numberInWord.printNumberInWord(8));
        System.out.println(numberInWord.printNumberInWord(7));
        // Check Odd/Even
        CheckOddEven checkOddEven = new CheckOddEven();
        checkOddEven.checkOddEven(9);
        checkOddEven.checkOddEven(8);
        checkOddEven.checkOddEven(22);
        checkOddEven.checkOddEven(444);
        checkOddEven.checkOddEven(333);
        // Calculate the average
        Integer[] arr1 = {4,5,7,444,111,3333,555,333,111,666,555333};
        Integer[] arr2 = {-3,-4,66,1,-200};
        Integer[] arr3 = {55,34,11,22,33,55,44,33,11,22,33,44,55};
        Integer[] arr4 = {2,2,2,2,2,2,2,2,2,2,2};
        Average average = new Average();
        System.out.println(average.average(arr1));
        System.out.println(average.average(arr2));
        System.out.println(average.average(arr3));
        System.out.println(average.average(arr4));

    }
}