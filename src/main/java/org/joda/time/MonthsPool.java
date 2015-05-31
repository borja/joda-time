package org.joda.time;

public class MonthsPool extends MiniPool<Months> {

  private static MonthsPool myInstance;

  private MonthsPool() {}

  public static MonthsPool getInstance() {
    if (myInstance == null) {
      myInstance = new MonthsPool();
    }

    return myInstance;
  }

  @Override protected Months create(int numeral) {
    return new Months(numeral);
  }
}
