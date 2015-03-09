package org.joda.time;

import java.util.HashMap;

public class Pool {

    private HashMap<Integer, Object> instances;

    private Pool() {
        this.instances = new HashMap<Integer, Object>();
    }

    public static Pool getInstance() {
        
    }

    public void add(int numeral, Days day) {
        instances.put(new Integer(numeral), day);
    }

    public Object getInstance(int numeral){
        Object instance = instances.get(new Integer(numeral));

        if (instance == null) {
            return null;
        }

        return instance;

    }
}
