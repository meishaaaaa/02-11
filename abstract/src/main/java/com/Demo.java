package com;

public class Demo {

  public static void main(String[] args) {
    Cock cock = new Cock();
    Hen hen = new Hen();
    ChildChicken childChicken = new ChildChicken();

    cock.print(cock.getType(), cock.getPrice());
    hen.print(hen.getType(), hen.getPrice());
    childChicken.print(childChicken.getType(), childChicken.getPrice());


  }
}
