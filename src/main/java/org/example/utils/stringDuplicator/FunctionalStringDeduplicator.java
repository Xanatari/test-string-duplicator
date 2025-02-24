package org.example.utils.stringDuplicator;

import java.util.Objects;
import java.util.stream.Collectors;

public class FunctionalStringDeduplicator implements Deduplicator {

    /**
     * Removes duplicate characters from the input string, preserving
     * the order of first occurrence.
     *
     * @param input The string from which duplicates should be removed
     * @return A new string without any duplicate characters
     * That solution have a Funcional programing
     * Uses Java Streams to remove duplicate characters from the given string.
     * The order of first occurrences is preserved.
     *
     * Time Complexity: O(n), where n is the length of the string.
     */
    @Override
    public String removeDuplicates(String input) {
        if (Objects.isNull(input) || input.isEmpty()) {
            return "";
        }

        return input.chars()
                .distinct()   // keep only the first occurrence of each character
                .mapToObj(ch -> String.valueOf((char) ch))
                .collect(Collectors.joining());
    }
}