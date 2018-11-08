package com.junfeng.strokesort.comparator;

import java.lang.reflect.Method;
import java.util.Comparator;

import com.junfeng.strokesort.util.MapperFactory;

public class SubObjectStrokeComparator implements Comparator<Object> {

    private MapperFactory factory = MapperFactory.newInstance();
    private String[] fileds = null;

    public SubObjectStrokeComparator(String filed) {
        initFileds(filed);
    }

    private void initFileds(String filed) {
        if (filed == null || !filed.contains("."))
            throw new RuntimeException("输入的字段有误！");
        fileds = filed.split("\\.");
        if (fileds.length < 2)
            throw new RuntimeException("输入的字段有误！");
    }

    @Override
    public int compare(Object o1, Object o2) {
        String v1 = getValue(o1);
        String v2 = getValue(o2);
        if (v1 == null || v2 == null) {
            return 0;
        }
        return compareString(v1, v2);
    }

    private String getValue(Object o) {
        return getValue(o, 0);
    }

    private String getValue(Object o, int i) {
        if (o == null) {
            return null;
        }
        if (i == fileds.length) {
            if (o instanceof String) {
                return (String) o;
            } else {
                throw new RuntimeException("要比较的必须是String类型的中文！");
            }
        }
        Class<?> clazz = o.getClass();
        Method method = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int j = 0; j < methods.length; j++) {
            if (methods[j].getName().equalsIgnoreCase("get" + fileds[i])) {
                method = methods[j];
                break;
            }
        }
        if (method == null) {
            throw new RuntimeException(clazz.getName() + "未找到" + fileds[i] + "的get方法！");
        }
        Object value = null;
        try {
            value = method.invoke(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i < fileds.length) {
            return getValue(value, ++i);
        }
        return (String) value;
    }

    private int compareString(String s1, String s2) {
        int point1 = 0;
        int point2 = 0;
        int length1 = s1.length();
        int length2 = s2.length();
        for (int i = 0; i < length1 && i < length2; i++) {
            point1 = s1.codePointAt(i);
            point2 = s2.codePointAt(i);
            if (point1 != point2) {
                return factory.stroke(point1) - factory.stroke(point2);
            }
        }
        // 当完全相同时，长度较长的放在后面
        return (length1 - length2);
    }
}
