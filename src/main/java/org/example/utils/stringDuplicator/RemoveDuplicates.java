package org.example.utils.stringDuplicator;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates implements Deduplicator {
    /**
     * Removes duplicate characters from the input string, preserving
     * the order of the first occurrence of each character.
     *
     * @param input The string from which duplicates should be removed
     * @return A new string without any duplicate characters
     */
    @Override
    public String removeDuplicates(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        Set<Character> seenCharacters = new HashSet<>();
        StringBuilder resultBuilder = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!seenCharacters.contains(c)) {
                seenCharacters.add(c);
                resultBuilder.append(c);
            }
        }

        return resultBuilder.toString();}
}
