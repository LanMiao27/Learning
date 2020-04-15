package Collection.Set;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add("aa");
        lhs.add("bb");
        lhs.add("zhangsan");
        lhs.add("cc");
        System.out.println(lhs);
        System.out.println(lhs.size());
    }
}
