package com.ksnote.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Question819Test {

    @ParameterizedTest
    @MethodSource("paragraphProvider")
    void mostCommonWord(String paragraph, String[] banned, String expected) {
        Question819 q = new Question819();
        assertThat(q.mostCommonWord(paragraph, banned)).isEqualTo(expected);
    }

    static Stream<Arguments> paragraphProvider() {
        return Stream.of(
                arguments("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}, "ball"),
                arguments("a.", new String[]{}, "a"),
                arguments("Bob!", new String[]{"hit"}, "bob")
        );
    }

}