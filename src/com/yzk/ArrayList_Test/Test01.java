package com.yzk.ArrayList_Test;

        import java.util.ArrayList;
        import java.util.Iterator;
        import java.util.List;

public class Test01 {
    public static void main(String args[]) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("ddd");
        //普通的for循环遍历
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        //使用Iterator遍历ArrayList
        Iterator<String> iter = arrayList.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
        //使用增强for循环
        for (String s : arrayList)
            System.out.println(s);
    }
}



