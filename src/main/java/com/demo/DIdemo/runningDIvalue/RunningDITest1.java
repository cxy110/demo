package com.demo.DIdemo.runningDIvalue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description: 通过配置文件给属性值赋值方法(占位符)1
 * @author: cxy
 * @create: 2020-03-02 15:44
 */
@Configuration
@PropertySource("classpath:application-1.properties")
public class  RunningDITest1 {
  /**
   按K-V结构,匹配key,获取value
   */
  @Value("${person.name}")
  private String name;
  @Value("${person.sex}")
  private String sex;
  @Value("${person.age}")
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Bean(value = "getAge")
  public int getInfo(){
    return age;
  }
}
