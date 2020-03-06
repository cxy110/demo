package com.demo;

import com.demo.DIdemo.runningDIvalue.RunningDITest1;
import com.demo.DIdemo.runningDIvalue.RunningDITest2;
import com.demo.DIdemo.runningDIvalue.SpELTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
  @Autowired
  private RunningDITest1 runningDITest1;
  @Autowired
  private RunningDITest2 runningDITest2;
  @Autowired
  private SpELTest spELTest;
  @Test
  public void getAge() {
    int  info = runningDITest1.getInfo();
    System.out.println(info);
  }

  @Test
  public void getInfo2() {
    String s = runningDITest2.getanimalInfo();
    System.out.println(s);
  }
  @Test
  public void getInfo3(){
    System.out.println(spELTest.getValue());
  }
}
