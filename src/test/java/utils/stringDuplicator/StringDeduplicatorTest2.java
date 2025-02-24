package utils.stringDuplicator;

import org.example.utils.stringDuplicator.Deduplicator;
import org.example.utils.stringDuplicator.FunctionalStringDeduplicator;
import org.example.utils.stringDuplicator.RemoveDuplicates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringDeduplicatorTest {

    private final Deduplicator deduplicator = new RemoveDuplicates();
    @Test
    void testRemoveDuplicates_typicalCase() {
        String input = "AABBCCD112233";
        String expected = "ABCD123";
        String actual = deduplicator.removeDuplicates(input);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicates_allSameCharacter() {
        String input = "AAAAAA";
        String expected = "A";
        String actual = deduplicator.removeDuplicates(input);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicates_repeatedPattern() {
        String input = "abababab";
        String expected = "ab";
        String actual = deduplicator.removeDuplicates(input);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicates_emptyString() {
        String input = "";
        String expected = "";
        String actual = deduplicator.removeDuplicates(input);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicates_nullInput() {
        String input = null;
        String expected = "";
        String actual = deduplicator.removeDuplicates(input);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicates_noDuplicates() {
        String input = "ABC123";
        String expected = "ABC123";
        String actual = deduplicator.removeDuplicates(input);
        assertEquals(expected, actual);
    }
}