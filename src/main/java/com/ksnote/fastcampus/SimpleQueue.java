package com.ksnote.fastcampus;

import java.util.ArrayList;
import java.util.List;

public class SimpleQueue<T> {
    private List<T> list;

    public SimpleQueue() {
        this.list = new ArrayList<>();
    }

    public boolean enqueue(T value) {
        return list.add(value);
    }

    public T dequeue() {
        if (list.isEmpty()) {
            return null;
        }

        return list.remove(0);
    }

}
