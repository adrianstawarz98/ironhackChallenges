import java.util.Arrays;
import java.util.Collections;
public class Maximum {
    public Integer maximum(Integer[] numList) {
        Arrays.sort(numList, Collections.reverseOrder());
        return numList[0];
    }
}