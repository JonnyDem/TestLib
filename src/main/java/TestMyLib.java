import mylib.MyLib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ваня on 20.09.2017.
 */
public class TestMyLib {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(145,186,90,5,1,9,88,68,69,37,234);

        MyLib.getEvenNumbers(list);
        MyLib.getOddNumbers(list);
    }
}
