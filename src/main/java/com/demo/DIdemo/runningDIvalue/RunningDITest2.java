package com.demo.DIdemo.runningDIvalue;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @program: demo
 * @description: 通过配置文件给属性赋值的方法(占位符)2
 * @author: cxy
 * @create: 2020-03-03 16:26
 */
@Configuration
@ConfigurationProperties(prefix = "dog")
@PropertySource("classpath:application-1.properties")
/**
 *
 @Data注解可以省略写get/set方法,会默认生成
 */
@Data
public class RunningDITest2 {
  private String name;
  private String variety;
  private int[] number={1,2,3,4,5,6};
  public String getanimalInfo(){
    return "名字是"+name+"品种是"+variety;
  }
}
