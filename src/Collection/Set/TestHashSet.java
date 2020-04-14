package Collection.Set;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        //HashSet底层是HashMap Key值是hash出来的值
        hs.add("a");
        hs.add("b");
        hs.add("abc");

        System.out.println(hs);
        hs.add("a");
        System.out.println(hs);
        hs.remove("b");
        System.out.println(hs);
        System.out.println(hs.contains("abc"));
        hs.clear();
        System.out.println(hs.size());


    }
}
