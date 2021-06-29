package com.ksnote.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Question937Test {
    private Question937 q;

    @BeforeEach
    void setUp() {
        q = new Question937();
    }

    @ParameterizedTest
    @MethodSource("logFilesProvider")
    void reorderLogFiles(String[] input, String[] output) {
        assertThat(q.reorderLogFiles(input)).containsExactly(output);
    }

    static Stream<Arguments> logFilesProvider() {
        return Stream.of(
                arguments(new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"},
                        new String[]{"let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"}),
                arguments(new String[]{"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"},
                        new String[]{"g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"})
        );
    }
}