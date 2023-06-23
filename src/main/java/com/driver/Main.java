package com.driver;

import java.util.Scanner;

public class Main {
    public class Product{

        public int product(int x, int y){
          return x*y;
        }
        public int product(int x,int y,int z){
          return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
public void main(String[] args){
    Product p=new Product();
    int result1=p.product(2,3);
    System.out.println(result1);
    int result2=p.product(2,3,4);
    System.out.println(result2);
    double result3=p.product(2.5,3.5);
    System.out.println(result3);
}
}