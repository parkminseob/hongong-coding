package com.practiceExample.ArrayList;

import java.util.ArrayList;

public class MyArrayListTest4 {
  public static void main(String[] args) {
    ArrayList arrayList1 = new ArrayList(3);
    arrayList1.add("aaa");
    arrayList1.add("bbb");
    arrayList1.add("ccc");
    arrayList1.add("ddd");
    arrayList1.add("eee");
    print(arrayList1);
    
    System.out.println("----------");
    arrayList1.add(1, "xxx");
    print(arrayList1);
    
    System.out.println("----------");
    arrayList1.set(2, "yyy");
    print(arrayList1);
    
    System.out.println("----------");
    arrayList1.remove(3);
    print(arrayList1);
    
    ArrayList arrayList2 = new ArrayList();
    arrayList2.add("fff");
    arrayList2.add("ggg");
    arrayList2.add("hhh");
    arrayList2.add("iii");
    arrayList2.add("jjj");
    arrayList2.add("kkk");
    arrayList2.add("lll");
    print2(arrayList2);
  }
  
  public static void print(ArrayList arrayList) {
    for(int i = 0; i < arrayList.size(); i++) {
      String str = (String) arrayList.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }
  
  public static void print2(ArrayList arrayList) {
    Object[] arr;
    arr = arrayList.toArray();
    for(Object obj : arr) {
      String str = (String) obj;
      System.out.println(str + " ");
    }
    System.out.println();
  }
}
