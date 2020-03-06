package com.demo.comtro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program: demo
 * @description:
 * @author: cxy
 * @create: 2020-01-07 16:57
 */
@RestController
@RequestMapping("/test/v1/")
public class testController {
  @PostMapping ("/ser")
  public String getAS( A a){
    System.out.println(a.getArrtibute());
    return "你好";
  }
}
