package com.example.demo.shild_book.IOStream.Task;

import lombok.SneakyThrows;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MentorSumIoTest {

    @SneakyThrows
    @ParameterizedTest
    @MethodSource("dataProvider")
    void sumOfStream(int expectedResult, byte[] input) {
        MentorSumIo mentorSumIo = new MentorSumIo();

        InputStream inputStream = new ByteArrayInputStream(input);
        int actualResult = mentorSumIo.sumOfStream(inputStream);

        assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(16, new byte[]{1, 2, 4, 10, -1}),
                Arguments.arguments(17, new byte[]{1, 2, 4, 10})
        );

    }
}
