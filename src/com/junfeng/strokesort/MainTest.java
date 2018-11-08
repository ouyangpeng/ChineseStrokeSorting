package com.junfeng.strokesort;

import java.util.*;

import com.junfeng.strokesort.comparator.ObjectStrokeComparator;
import com.junfeng.strokesort.comparator.StringStrokeComparator;
import com.junfeng.strokesort.model.Stroke;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("========================= 测试  ObjectStrokeComparator============================");
        List<Stroke> strokes = new ArrayList<Stroke>();
        Stroke stroke1 = new Stroke();
        stroke1.setName("张三无");
        strokes.add(stroke1);
        stroke1 = new Stroke();
        stroke1.setName("赵明红匠");
        strokes.add(stroke1);
        stroke1 = new Stroke();
        stroke1.setName("李四仨2");
        strokes.add(stroke1);
        stroke1 = new Stroke();
        stroke1.setName("李四仨");
        strokes.add(stroke1);
        stroke1 = new Stroke();
        stroke1.setName("李位");
        strokes.add(stroke1);
        stroke1 = new Stroke();
        stroke1.setName("王东栋");
        strokes.add(stroke1);
        stroke1 = new Stroke();
        strokes.add(stroke1);
        stroke1 = new Stroke();
        stroke1.setName("张三");
        strokes.add(stroke1);
        stroke1 = new Stroke();
        strokes.add(stroke1);

        Collections.sort(strokes, new ObjectStrokeComparator(Stroke.class, "name"));

        for (Stroke stroke : strokes) {
            System.out.println(stroke.getName());
        }

        System.out.println("========================= 测试  StringStrokeComparator============================");
        List<String> name = new ArrayList<String>();
        name.add("李四");
        name.add("张三44");
        name.add("张三是");
        name.add("张三2");
        name.add("张三");
        name.add("赵明");
        name.add("王东西");
//		Collections.sort(name, new ObjectStrokeComparator(String.class, ""));
        Collections.sort(name, new StringStrokeComparator());
        for (String string : name) {
            System.out.println(string);
        }
    }
}
