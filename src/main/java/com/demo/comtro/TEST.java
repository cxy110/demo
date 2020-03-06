package com.demo.comtro;

import com.alibaba.fastjson.JSON;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class TEST {
  public static void main(String[] args) {


    A a=new A();
    B b=new B();
    a.setId("qwe");
    a.setArrtibute(2);
    a.setSort(3);
    A aa=new A();
    aa.setSort(4);
    aa.setArrtibute(5);
    aa.setId("jdo");
    List<A>list =new ArrayList<>();
    list.add(a);
    list.add(aa);

    b.setRecVo(list);
    System.out.println(list.toString());
    System.out.println("------");
    System.out.println(b.toString());
    System.out.println("---你好--");
    String s = JSON.toJSONString(b);
    System.out.println("s的值是："+s);
    B b1 = JSON.parseObject(s, B.class);
    System.out.println("---好-");
    System.out.println(b1.getRecVo().get(0));
  }



}
