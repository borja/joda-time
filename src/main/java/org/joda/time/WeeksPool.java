package org.joda.time;

public class WeeksPool extends MiniPool<Weeks> {

  private static WeeksPool myInstance;

  private WeeksPool() {}

  public static WeeksPool getInstance() {
    if (myInstance == null) {
      myInstance = new WeeksPool();
    }

    return myInstance;
  }

  @Override protected Weeks create(int numeral) {
    return new Weeks(numeral);
  }
}
