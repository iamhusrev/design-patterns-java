package com.iamhusrev._3_iterator;

public interface Iterator<T> {
    boolean hasNext();

    void next();

    T currentItem();
}
