package org.joda.time;

public class Pool {

    private static Pool myInstance;
    private static GenericPool<Years> years;
    private static GenericPool<Months> months;
    private static GenericPool<Weeks> weeks;
    private static GenericPool<Days> days;
    private static GenericPool<Hours> hours;
    private static GenericPool<Minutes> minutes;
    private static GenericPool<Seconds> seconds;

    private Pool() {
        this.years = new GenericPool<Years>();
        this.months = new GenericPool<Months>();
        this.weeks = new GenericPool<Weeks>();
        this.days = new GenericPool<Days>();
        this.hours = new GenericPool<Hours>();
        this.minutes = new GenericPool<Minutes>();
        this.seconds = new GenericPool<Seconds>();
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

        Object result = pool.minutes.obtain(numeral);

        if (result == null) {
            result =  new Minutes(numeral);
            pool.minutes.add(numeral, (Minutes) result);
        }

        return (Minutes) result;
    }

    public static Seconds retrieveSeconds(int numeral) {

        Pool pool = Pool.getInstance();

        Object result = pool.seconds.obtain(numeral);

        if (result == null) {
            result =  new Seconds(numeral);
            pool.seconds.add(numeral, (Seconds) result);
        }

        return (Seconds) result;
    }
}
