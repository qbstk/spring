package com.ellden.spring.ioc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean {

    public String[] arr ;
    public List<String> list ;
    public Set<String> set ;
    public Map<String, String> map ;

    @Override
    public String toString() {
        return "CollectionBean{" +
                "arr=" + Arrays.toString( arr ) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

}
