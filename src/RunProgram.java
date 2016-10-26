import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Jakob on 26-10-2016.
 */
public class RunProgram {

    public static void main(String[] args) {

        HashIntSet set1 = new HashIntSet();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(7);
        set1.add(8);

        HashSet set2 = new HashSet();

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        System.out.println(set1.equals(set2));



    }
}
