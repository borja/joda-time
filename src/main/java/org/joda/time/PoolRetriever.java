package org.joda.time;

public interface PoolRetriever<T> {

  T retrieve(int numeral);
}
