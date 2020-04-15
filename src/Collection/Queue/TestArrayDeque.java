package Collection.Queue;

import java.util.ArrayDeque;

public class TestArrayDeque {
    public static void main(String[] args) {
        ArrayDeque ad=new ArrayDeque();
        System.out.println(ad.size());
        for (int i = 0; i < 10; i++) {
            ad.add((char)('a'+i));
        }
        System.out.println(ad);
        ad.addFirst("First");
        ad.addLast("Last");
        System.out.println(ad);
        ad.remove();
        ad.add("add");
        ad.addFirst("addFirst");
        System.out.println(ad);

        //失败返回特殊值offer poll peek + First/Last
        //失败抛出异常  add remove get  + First/Last
        //不够就双倍扩容
        //初始化构造默认16 最小要求是8 一定是2的幂次方 最大是2^30次  负数会变成最大值

    }
}
