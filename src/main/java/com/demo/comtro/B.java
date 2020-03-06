package com.demo.comtro;
import java.util.List;
public class B {
  private List<A> RecVo;

  public List<A> getRecVo() {
    return RecVo;
  }

  public void setRecVo(List<A> recVo) {
    RecVo = recVo;
  }

  @Override
  public String toString() {
    return "B{" +
        "RecVo=" + RecVo +
        '}';
  }
}
