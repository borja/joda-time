package org.joda.time;

import java.util.HashMap;

public class Pool {

    private static Pool myInstance;
    private static GenericPool<Years> years;
    private static GenericPool<Months> months;
    private static GenericPool<Weeks> weeks;
    private static GenericPool<Days> days;
    private static GenericPool<Hours> hours;
    private HashMap<Integer, Minutes> minutes;
    private HashMap<Integer, Seconds> seconds;

    private Pool() {
        this.years = new GenericPool<Years>();
        this.months = new GenericPool<Months>();
        this.weeks = new GenericPool<Weeks>();
        this.days = new GenericPool<Days>();
        this.hours = new GenericPool<Hours>();
        this.minutes = new HashMap<Integer, Minutes>();
        this.seconds = new HashMap<Integer, Seconds>();
    }

    public static Pool getInstance() {

        if (myInstance == null) {
            myInstance = new Pool();
        }

        return myInstance;
    }

    public static Years retrieveYears(int numeral) {
        Pool pool = Pool.getInstance();

        Object result = pool.years.obtain(numeral);

        if (result == null) {
            result =  new Years(numeral);
            pool.years.add(numeral, (Years) result);
        }

        return (Years) result;
    }

    public static Months retrieveMonths(int numeral) {
        Pool pool = Pool.getInstance();

        Object result = pool.months.obtain(numeral);

        if (result == null) {
            result =  new Months(numeral);
            pool.months.add(numeral, (Months) result);
        }

        return (Months) result;
    }

    public static Weeks retrieveWeeks(int numeral) {
        Pool pool = Pool.getInstance();

        Object result = pool.weeks.obtain(numeral);

        if (result == null) {
            result =  new Weeks(numeral);
            pool.weeks.add(numeral, (Weeks) result);
        }

        return (Weeks) result;
    }

    public static Days retrieveDays(int numeral) {
        Pool pool = Pool.getInstance();

        Object result = pool.days.obtain(numeral);

        if (result == null) {
            result =  new Days(numeral);
            pool.days.add(numeral, (Days) result);
        }

        return (Days) result;
    }

    public static Hours retrieveHours(int numeral) {

        Pool pool = Pool.getInstance();

        Object result = pool.hours.obtain(numeral);

        if (result == null) {
            result =  new Hours(numeral);
            pool.hours.add(numeral, (Hours) result);
        }

        return (Hours) result;
    }

    public static Minutes retrieveMinutes(int numeral) {

        Pool pool = Pool.getInstance();

        Object result = pool.getMinutes(numeral);

        if (result == null) {
            result =  new Minutes(numeral);
            pool.addMinute(numeral, (Minutes) result);
        }

        return (Minutes) result;
    }

    public static Seconds retrieveSeconds(int numeral) {

        Pool pool = Pool.getInstance();

        Object result = pool.getSeconds(numeral);

        if (result == null) {
            result =  new Seconds(numeral);
            pool.addSecond(numeral, (Seconds) result);
        }

        return (Seconds) result;
    }

    private void addHour(int numeral, Hours hour) {
        hours.add(new Integer(numeral), hour);
    }

    private void addMinute(int numeral, Minutes minute) {
        minutes.put(new Integer(numeral), minute);
    }

    private void addSecond(int numeral, Seconds second) {
        seconds.put(new Integer(numeral), second);
    }

    private Object getHours(int numeral) {
        Object instance = hours.obtain(new Integer(numeral));

        return instance;
    }

    private Object getMinutes(int numeral) {
        Object instance = minutes.get(new Integer(numeral));

        return instance;
    }

    private Object getSeconds(int numeral) {
        Object instance = seconds.get(new Integer(numeral));

        return instance;
    }
}
