package com.pp;


import com.test.Test1;

import java.util.Arrays;

public class Templates {
//    alt+enter 万能解决问题快捷键如导包、增加依赖。例如
//    例如本例手写test1会爆红，alt+enter会在对应的iml文件生成一个依赖标签
//    prsf   private static final
    private static final Test1 test=new Test1();
//    psvm生成main函数
    public static void main(String[] args) {
//        sout
        System.out.println(33);
        /*soutp soutv  soutm   xxx.sout*/
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Templates.main");
        int a=10;

        System.out.println("a = " + a);
        for (int i = 0; i <9 ; i++) {

        }
//        iter
        for (String arg : args) {

        }
    }
}
