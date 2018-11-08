package com.oyp.csdn.test;

public class CountryOrRegion {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 国家或地区名
     */
    private String name;

    @Override
    public String toString() {
        return "CountryOrRegion{" +
                "name='" + name + '\'' +
                '}';
    }
}
