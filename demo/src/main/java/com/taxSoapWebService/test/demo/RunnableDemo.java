package com.taxSoapWebService.test.demo;

/**
 * Created by mshaik on 5/11/18.
 */
public class RunnableDemo {

  public static void main(String s[]){

    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("This is my first anonymous inner class");
      }
    }).start();

    Runnable runnable = () -> System.out.println("Hi..This is declaration");
    new Thread(runnable).start();

    new Thread(()->System.out.println("Hi...This is inside expression")).start();

    new Thread(()->{
      System.out.println("Hi...This is inside expression");
    }).start();

  }


}
