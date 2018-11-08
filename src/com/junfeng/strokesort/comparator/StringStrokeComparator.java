package com.junfeng.strokesort.comparator;

import java.util.Comparator;

import com.junfeng.strokesort.util.MapperFactory;

public class StringStrokeComparator implements Comparator<String> {

    private MapperFactory factory = MapperFactory.newInstance();

    @Override
    public int compare(String s1, String s2) {
        if (s1 == null || s2 == null)
            return 0;
        int point1 = 0;
        int point2 = 0;
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            point1 = s1.codePointAt(i);
            point2 = s2.codePointAt(i);
            if (point1 != point2)
                return factory.stroke(point1) - factory.stroke(point2);
        }
        return s1.length() - s2.length();
    }

}
