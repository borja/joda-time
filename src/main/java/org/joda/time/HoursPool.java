package org.joda.time;

public class HoursPool extends MiniPool<Hours> {

  private static HoursPool myInstance;

  private HoursPool() {}

  public static HoursPool getInstance() {
    if (myInstance == null) {
      myInstance = new HoursPool();
    }

    return myInstance;
  }

  @Override protected Hours create(int numeral) {
    return new Hours(numeral);
  }
}
