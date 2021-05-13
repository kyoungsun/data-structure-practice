package com.ksnote.fastcampus;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleQueueTest {

    @Test
    public void dequeue() {
        SimpleQueue simpleQueue = new SimpleQueue();
        simpleQueue.enqueue(1);
        simpleQueue.enqueue("2");
        simpleQueue.enqueue(3);
        simpleQueue.enqueue("문자열도 얼마든지 가능해");
        simpleQueue.enqueue(10L);

        assertThat(simpleQueue.dequeue()).isEqualTo(1);
        assertThat(simpleQueue.dequeue()).isEqualTo("2");
        assertThat(simpleQueue.dequeue()).isEqualTo(3);
        assertThat(simpleQueue.dequeue()).isEqualTo("문자열도 얼마든지 가능해");
        assertThat(simpleQueue.dequeue()).isEqualTo(10L);
        assertThat(simpleQueue.dequeue()).isEqualTo(null);
    }
}