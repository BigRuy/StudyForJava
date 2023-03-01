package com.wly.system_;

import java.io.PrintStream;
import java.util.Arrays;

/**
 * @author 王露夷
 * @version 1.0
 */
public class System_ {
    private static PrintStream out;

    public static void main(String[] args) {
        //退出当前程序
        System_.out.println("System.main");
        java.lang.System.exit(0);
        //拷贝源数组的元素到目标数组
        int[] src = {1,2,3};
        int[] dest = new int[3];
        java.lang.System.arraycopy(src,0,dest,0,3);
        System_.out.println("dest="+ Arrays.toString(dest));
        //返回当前时间到距离1970-1-1的毫秒数
        System_.out.println(java.lang.System.currentTimeMillis());
    }
}
