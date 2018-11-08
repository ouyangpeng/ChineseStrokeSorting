package com.oyp.csdn.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.junfeng.strokesort.comparator.StringStrokeComparator;

public class TestStringStrokeComparator {

    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        name.add("欧阳鹏");
        name.add("阿森松島");
        name.add("安道爾");
        name.add("阿拉伯聯合大公國");
        name.add("阿富汗");
        name.add("安地卡及巴布達");
        name.add("安圭拉");
        name.add("阿爾巴尼亞");
        name.add("亞美尼亞");
        name.add("安哥拉");
        name.add("南極洲");
        name.add("阿根廷");
        name.add("美屬薩摩亞");
        name.add("奧蘭群島");
        name.add("波士尼亞赫塞哥維納");
        name.add("巴林");
        name.add("聖巴泰勒米");
        name.add("汶萊");
        name.add("玻利維亞");
        name.add("聖克里斯多福及尼維斯");
        name.add("朝鮮");
        name.add("韓國");
        name.add("科威特");
        name.add("開曼群島");
        name.add("哈薩克");
        name.add("寮國");
        name.add("黎巴嫩");
        name.add("聖露西亞");
        name.add("薩爾瓦多");
        name.add("馬約特");
        name.add("台灣（中國）");
        name.add("香港（中國）");
        name.add("澳門（中國）");
        name.add("蘇丹");

        //添加部分 生僻字
        name.add("嘣");
        name.add("嚋");
        name.add("蘇丹");
        name.add("哜");
        name.add("囆");
        name.add("囎");
        name.add("囼");
        name.add("圀");
        name.add("壝");
        name.add("壝");
        name.add("墪");
        name.add("夨");
        name.add("夒");
        name.add("孅");
        name.add("孏");
        name.add("孆");
        name.add("媘");
        name.add("孑");
        name.add("孒");
        name.add("孓");
        name.add("孖");
        name.add("孠");
        name.add("孧");
        name.add("滽");
        name.add("滽");
        name.add("瀶");
        name.add("瀶");
        name.add("犪");
        name.add("犓");
        name.add("犫");

        /** 使用 */
        Collections.sort(name, new StringStrokeComparator());
        for (String string : name) {
            System.out.println(string);
        }
    }
}
