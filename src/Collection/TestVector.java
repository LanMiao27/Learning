package Collection;

import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        Vector ve=new Vector();
        //基本差不多除了一个扩容和增量 如果有设置增量则扩容为old+incre 如果没有就两倍扩容
        ve.add("a");
        ve.add("b");
        ve.add(2,"c");
        System.out.println(ve);
        ve.add("testRemove");
        System.out.println(ve);
        ve.remove("testRemove");
        ve.remove(1);
        System.out.println(ve);
        ve.set(1,"testSet");
        System.out.println(ve);
        System.out.println(ve.capacity());
        for (int i = 0; i <10 ; i++) {
            ve.add("b"+i);
        }
        System.out.println(ve.capacity());

    }
}
