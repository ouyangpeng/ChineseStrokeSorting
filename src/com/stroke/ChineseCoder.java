package com.stroke;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 1、用java程序生成一个文本文件(Chinese.csv)。包括所有的从U9FA6-U9FBF的字符的编码和文字。
 * 2、利用excel的按笔画排序功能，对Chinese.csv文件中的内容排序。
 */
public class ChineseCoder {

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter("Chinese.csv");
        // 基本汉字
        for(char c = 0x4E00; c <= 0x9FA5; c++) {
            out.println((int)c + "," + c);
        }
        out.flush();
        out.close();
    }
}
