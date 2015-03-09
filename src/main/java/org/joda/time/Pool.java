package org.joda.time;

import java.util.HashMap;

public class Pool {

    private static Pool myInstance;
    private HashMap<Integer, Days> days;
    private HashMap<Integer, Minutes> minutes;

    private Pool() {
        this.days = new HashMap<Integer, Days>();
        this.minutes = new HashMap<Integer, Minutes>();
    }

    public static Pool getInstance() {

        if (myInstance == null) {
            myInstance = new Pool();
        }

        return myInstance;
    }

    private void add(int numeral, Days day) {
        days.put(new Integer(numeral), day);
    }

    private void addMinutes(int numeral, Minutes minute) {
        minutes.put(new Integer(numeral), minute);
    }


    public Object getInstance(int numeral){
        Object instance = days.get(new Integer(numeral));

        if (instance == null) {
            return null;
        }

        return instance;

    }

    public static Days retrieveDays(int numeral) {
        Pool pool = Pool.getInstance();

        Object result = pool.getInstance(numeral);

        if (result == null) {
            result =  new Days(numeral);
            pool.add(numeral, (Days) result);
        }

        return (Days) result;
    }


    public static Minutes retrieveMinutes(int numeral) {

        Pool pool = Pool.getInstance();

        Object result = pool.getInstance(numeral);

        if (result == null) {
            result =  new Minutes(numeral);
            pool.add(numeral, (Minutes) result);
        }

        return (Minutes) result;
    }
}
