package com.chuyu.utill;

public class TestDemo {

   public  static void testDemo01(int j){
        //j控制行数
        if (j>0) {
            for (int i = 1; i <= j; i++) {
                for (int k =1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }else {
            System.out.println("请输入一个正整数！！！");
        }

   }

   /* public static void main(String[] args) {

       testDemo01(5);
    }
*/

}
