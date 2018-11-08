package com.junfeng.strokesort.model;

import java.util.HashMap;

public class StrokeMap extends HashMap<Integer, Integer> {

    private static final long serialVersionUID = -860722737778643665L;

    public void put(Stroke stroke) {
        if (stroke != null) {
            this.put(stroke.getCode(), stroke.getOrder());
        }
    }
}
