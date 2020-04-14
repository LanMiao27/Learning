package Collection;


import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList LL1=new LinkedList();
        //插入
        LL1.addFirst("First");
        LL1.addLast("Last");
        LL1.add(1,"TestAdd");//不加index会在队尾插入～
        System.out.println(LL1);

        //删除
        LL1.remove("TestAdd");//删除第一个出现的元素
        //LL1.removeFirst();  //removeLast remove(index)
        System.out.println(LL1);

        //get
        LL1.add(1,"next");
        LL1.add(2,"another");
        System.out.println(LL1);
        System.out.println(LL1.getFirst());
        System.out.println(LL1.getLast());

        //遍历  迭代器、for foreach
        for (Iterator iter=LL1.iterator();iter.hasNext();) {
            System.out.print(iter.next()+"  ");

        }
        System.out.println("");
        for(int i=0;i<LL1.size();i++)
            System.out.print(LL1.get(i)+"  ");

        System.out.println("");
        for (Object o:LL1
             ) {
            System.out.print(o+"  ");

        }


    }
}
