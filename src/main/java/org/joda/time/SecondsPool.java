package org.joda.time;

public class SecondsPool extends MiniPool<Seconds> {

  private static SecondsPool myInstance;

  private SecondsPool() {}

  public static SecondsPool getInstance() {
    if (myInstance == null) {
      myInstance = new SecondsPool();
    }

    return myInstance;
  }

  @Override protected Seconds create(int numeral) {
    return new Seconds(numeral);
  }
}
