import mylib.MyLib;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ваня on 20.09.2017.
 */
public class TestMyLib {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(145);
        list.add(186);
        list.add(90);
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(88);
        list.add(68);
        list.add(69);
        list.add(37);
        list.add(234);

        MyLib.getEvenNumbers(list);
        MyLib.getOddNumbers(list);
    }
}
