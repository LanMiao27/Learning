package Collection.Set;

import java.util.BitSet;

public class TestBitSet {
    public static void main(String[] args) {
        BitSet bs=new BitSet();

        System.out.println(bs.length());
        System.out.println(bs.size());
        System.out.println(bs.hashCode());

        //两个用法示例  去重、排序
        containChars("abvacdfab");

        int[] array = new int[]{423, 700, 9999, 2323, 356, 6400, 1, 2, 3, 2, 2, 2,
                2};
        sortArray(array);


    }
    public static void containChars(String str) {
        BitSet used = new BitSet();
        for (int i = 0; i < str.length(); i++)
            used.set(str.charAt(i)); // set bit for char
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int size = used.size();
        for (int i = 0; i < size; i++) {
            if (used.get(i)) {
                sb.append((char) i);
            }
        } sb.append("]");
        System.out.println(sb.toString());
    }

    public static void sortArray(int[] array) {
        BitSet bitSet = new BitSet(2 << 13);
        // 虽然可以自动扩容， 但尽量在构造时指定估算大小,默认为 64
        System.out.println("BitSet size: " + bitSet.size());
        for (int i = 0; i < array.length; i++) {
            bitSet.set(array[i]);
        } //剔除重复数字后的元素个数
        int bitLen = bitSet.cardinality();
        //进行排序， 即把 bit 为 true 的元素复制到另一个数组
        int[] orderedArray = new int[bitLen];
        int k = 0;
        for (int i = bitSet.nextSetBit(0); i >= 0; i = bitSet.nextSetBit(i + 1))
        {
            orderedArray[k++] = i;
        } System.out.println("After ordering: ");
        for (int i = 0; i < bitLen; i++) {
            System.out.print(orderedArray[i] + "\t");
        }
    }
}
