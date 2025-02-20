package com.beyond.di;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        String name = "홍길동";

        assertThat(name).isEqualTo("홍길동");
    }
}
