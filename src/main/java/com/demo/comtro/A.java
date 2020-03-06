package com.demo.comtro;

public class A {
  private String id;
  private int arrtibute;
  private int sort;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public int getArrtibute() {
    return arrtibute;
  }

  public void setArrtibute(int arrtibute) {
    this.arrtibute = arrtibute;
  }

  public int getSort() {
    return sort;
  }

  public void setSort(int sort) {
    this.sort = sort;
  }

  @Override
  public String toString() {
    return "A{" +
        "id='" + id + '\'' +
        ", arrtibute=" + arrtibute +
        ", sort=" + sort +
        '}';
  }
}
