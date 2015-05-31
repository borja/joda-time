package org.joda.time;

public class YearsPool extends MiniPool<Years> {

  private static YearsPool myInstance;

  private YearsPool() {}

  public static YearsPool getInstance() {
    if (myInstance == null) {
      myInstance = new YearsPool();
    }

    return myInstance;
  }

  @Override protected Years create(int numeral) {
    return new Years(numeral);
  }
}
