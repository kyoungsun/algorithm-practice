package com.ksnote.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Question49Test {

    @ParameterizedTest
    @MethodSource("provider")
    void groupAnagrams(String[] strs, List<List<String>> expected) {
        Question49 q = new Question49();
        List<List<String>> groupAnagrams = q.groupAnagrams(strs);
        assertThat(groupAnagrams).isEqualTo(expected);
    }

    static Stream<Arguments> provider() {
        return Stream.of(
                arguments(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"},
                        new ArrayList<>(Arrays.asList(
                                Arrays.asList("bat"),
                                Arrays.asList("nat", "tan"),
                                Arrays.asList("ate", "eat", "tea")))),
                arguments(new String[]{""}, new ArrayList<>(Arrays.asList(Arrays.asList("")))),
                arguments(new String[]{"a"}, new ArrayList<>(Arrays.asList(Arrays.asList("a"))))
        );
    }
}