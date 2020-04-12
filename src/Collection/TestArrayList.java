package Collection;

import java.util.ArrayList;
import java.lang.reflect.*;
import java.util.Iterator;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList arrlist = new ArrayList();
        ArrayList arrlist2 = new ArrayList(10);
        arrlist.add("zhangsan");
        arrlist.add(1);
        arrlist.add("lisi");
        System.out.println(arrlist.toString());
        System.out.println(arrlist.size());
        arrlist.set(0,"Graves");
        for(Iterator list=arrlist.iterator();list.hasNext();){
            System.out.print(list.next()+" ");
        }
/*        System.out.println(getArrayListCapacity(arrlist2));
        arrlist2.add("a");
        arrlist2.add("b");
        System.out.println(getArrayListCapacity(arrlist2));
        arrlist2.add("c");
        System.out.println(getArrayListCapacity(arrlist2));
        */

/*        ArrayList arrlist3=new ArrayList();
        for (int i = 0; i < 100; i++) {
            arrlist3.add(i+"");
            if(i%5==0){
                System.out.println(getArrayListCapacity(arrlist3));
            }
        }*/

/*
        ArrayList arrlist4=new ArrayList();
        arrlist4.add(4);
        arrlist4.add(3);
        arrlist4.add(2);
        arrlist4.add(1);
        System.out.println(arrlist4.toString());
        //arrlist4.remove(1);这句是删除index为1的元素
        arrlist4.remove((Integer)1);//删除等于1的int元素
        System.out.println(arrlist4.toString());
*/


    }

//利用反射获得ArrayList的private elementData  capacity
    public static int getArrayListCapacity(ArrayList<?> arrayList) {
        Class<ArrayList> arrayListClass = ArrayList.class;
        try {
            Field field = arrayListClass.getDeclaredField("elementData");
            field.setAccessible(true);
            Object[] objects = (Object[]) field.get(arrayList);
            return objects.length;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return -1;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return -1;
        }
    }
}

