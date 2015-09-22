package org.joda.time;

public class DaysPool extends MiniPool<Days> {

  private static DaysPool myInstance;

  private DaysPool() {}

  public static DaysPool getInstance() {
    if (myInstance == null) {
      myInstance = new DaysPool();
    }

    return myInstance;
  }

  @Override protected Days create(int numeral) {
    return new Days(numeral);
  }
}
