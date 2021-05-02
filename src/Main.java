import java.lang.Integer;
public class Main {
    public static void main(String[] args) {
        Maximum maxx = new Maximum();
        Integer[] numList = {22, 100, 41, -5, 555, -22222, 33};
        System.out.println(maxx.maximum(numList));
    }
}