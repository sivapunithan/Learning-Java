package Collections_Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionEg {

    public static void main(String[] args) {
        List<String> s1 = new ArrayList<>();
        s1.add("SivaPunithan");
        s1.add(new String("SivaPunithan"));
        s1.add("SivaPunithan");

        System.out.println(s1);

        System.out.println(s1.get(0).equals(s1.get(2)));
    }
}
