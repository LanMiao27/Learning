package Collection.Set;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add("aa");
        ts.add("bb");
        ts.add("cc");
        ts.add("ab");
        ts.add("bc");
        System.out.println(ts);
        //remove(o)
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.subSet("a", "b"));//默认含头不含尾
    }
}
