package com.demo.DIdemo.runningDIvalue;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import sun.dc.pr.PRError;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo
 * @description: SpEL表达式为属性赋值
 * @author: cxy
 * @create: 2020-03-03 16:58
 */
@Component
public class SpELTest {
  /**
   * 这个值是将一个bean引入属性中
   */
 // @Value("#{runningDITest2}")

  /**
   * 这个值是将一个bean中的方法引入
   */
  @Value("#{runningDITest2.getanimalInfo()}")
  private String value2;
  /**
   * 这是将一个bean中的属性值引入
   */
  @Value("#{runningDITest2.variety}")
  private String value3;
  /**
   * 对一个bean中的方法的值进行处理(变大写)后注入
   */
  @Value("#{runningDITest1.name.toUpperCase()}")
  private String value4;
  /**
   * 判断方法的返回值不为空时在操作,避免报错
   */
  @Value("#{runningDITest1.getSex()?.toUpperCase()}")
  private String value5;
  /**
   * 使用类型来赋值,T(类型).方法
   */
  @Value("#{T(java.lang.Math).random()}")
  private String  value6;
  /**
   * 还可以赋值,包括常量值,浮点数,string类型等,string类型要用''如"#{'hello world'}"
   */
  @Value("#{true}")
  private Boolean value7;
  /**
   * 此外,还可以放运算符,构成的运算表达式和正则表达式
   *
   */
  @Value("#{runningDITest1.age>30 ? 'old' :'young'}")
  private String value8;
  /**
   * 这个三目运算符是为了检查值为null时,给一个默认值
   */
  @Value("#{runningDITest1.sex ?: 'womem'}")
  private String value9;
  /**
   * 还可以从集合,数组中取值,
   * 比如有一个数组,获取指定的值,下面就是获取数组中的第四个值
   */
  @Value("#{runningDITest2.number[3]}")
  private  int value10;
  /**
   * 还可以从string中获取一个字符,下面的结果就是"h"
   */
  @Value("#{'this is a egg'[1]}")
  private String value11;


  /**
   * 还有各种的筛选查询运算符,
   * ("#{class1.student.?[name eq 'tom']}")  查询出1班学生中名字是tom的人
   * ("#{class1.student.^[name eq 'tom'}")   查询出1班学生中第一个名字是tom的人
   * ("#{class1.student.$[name eq 'tom']}")   查询出1班学生中最后一个名字是tom的人
   * ("#{class1.student.?[name eq 'tom'].![score]}") 询出1班学生中名字是tom的人的成绩
   */


 public String getValue(){
  return value11;
 }
}
