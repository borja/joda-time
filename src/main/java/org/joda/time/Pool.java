package org.joda.time;

public abstract class Pool {

    public abstract Object retrieve(int numeral);

    public static Years retrieveYears(int numeral) {
        YearsPool pool = YearsPool.getInstance();
        return pool.retrieve(numeral);
    }

    public static Months retrieveMonths(int numeral) {
        MonthsPool pool = MonthsPool.getInstance();
        return pool.retrieve(numeral);
    }

    public static Weeks retrieveWeeks(int numeral) {
        WeeksPool pool = WeeksPool.getInstance();
        return pool.retrieve(numeral);
    }

    public static Days retrieveDays(int numeral) {
        DaysPool pool = DaysPool.getInstance();
        return pool.retrieve(numeral);
    }

    public static Hours retrieveHours(int numeral) {
        HoursPool pool = HoursPool.getInstance();
        return pool.retrieve(numeral);
    }

    public static Minutes retrieveMinutes(int numeral) {
        MinutesPool pool = MinutesPool.getInstance();
        return pool.retrieve(numeral);
    }

    public static Seconds retrieveSeconds(int numeral) {
        SecondsPool pool = SecondsPool.getInstance();
        return pool.retrieve(numeral);
    }
}
