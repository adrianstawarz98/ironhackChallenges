import java.util.Arrays;

public class Average {
    public double average(Integer[] numList) {
        double sum = 0;
        for (int i=0; i < numList.length;i++) {
            sum = sum + numList[i];
        }
        return sum/numList.length;
    }
}
