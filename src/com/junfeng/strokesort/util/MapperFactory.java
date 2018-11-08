package com.junfeng.strokesort.util;

import com.junfeng.strokesort.model.StrokeMap;

public class MapperFactory {

    private MapperFactory() {
    }

    private final static MapperFactory factory = new MapperFactory();

    private static StrokeMap mapper;

    public static MapperFactory newInstance() {
        if (mapper == null) {
            MapperObject mapperObject = new MapperObject();
            mapper = mapperObject.getStrokeMapper();
        }
        return factory;
    }

    /**
     * 根据point计算顺序
     *
     * @param keyPoint
     * @return
     */
    public Integer stroke(Integer keyPoint) {
        if (keyPoint == null) {
            return -1;
        }
        Integer order = mapper.get(keyPoint);
        return order == null ? -1 : order;
    }

}
