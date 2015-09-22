package org.joda.time;

public class MinutesPool extends MiniPool<Minutes> {

  private static MinutesPool myInstance;

  private MinutesPool() {}

  public static MinutesPool getInstance() {
    if (myInstance == null) {
      myInstance = new MinutesPool();
    }

    return myInstance;
  }

  @Override protected Minutes create(int numeral) {
    return new Minutes(numeral);
  }
}
