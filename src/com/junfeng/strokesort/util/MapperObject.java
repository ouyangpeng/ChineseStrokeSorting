package com.junfeng.strokesort.util;

import java.io.IOException;
import java.io.ObjectInputStream;

import com.junfeng.strokesort.model.StrokeMap;

public class MapperObject {
    public StrokeMap getStrokeMapper() {
        StrokeMap mapper = null;
        ObjectInputStream is = null;
        try {
            is = new ObjectInputStream(MapperObject.class.getResourceAsStream("/res/stroke.s"));
            mapper = (StrokeMap) is.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return mapper;
    }
}
