package org.joda.time;

import java.util.HashMap;

public abstract class MiniPool<T> extends Pool {

  private HashMap<Integer, T> pool;

  public MiniPool() {
    this.pool = new HashMap<Integer, T>();
  }

  protected abstract T create(int numeral);

  @Override public T retrieve(int numeral) {
    T result = obtain(numeral);

    if (result == null) {
      result =  create(numeral);
      add(numeral, result);
    }

    return result;
  }

  private void add(int numeral, T type) {
    pool.put(new Integer(numeral), type);
  }

  private T obtain(int numeral){
    T instance = pool.get(new Integer(numeral));

    return instance;
  }
}
