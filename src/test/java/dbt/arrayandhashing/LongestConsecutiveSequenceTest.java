package dbt.arrayandhashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {

    LongestConsecutiveSequence obj;

    @BeforeEach
    void setUp() {
        obj = new LongestConsecutiveSequence();
    }

    @Test
    void longestConsecutive() throws IOException {
//        assertEquals(5, obj.longestConsecutive(new int[]{1, 2, 3, 4, 5}));
//        System.out.println("============");
//        assertEquals(6, obj.longestConsecutive(new int[]{9, 7, 5, 6, 7, 4, 3, 2, 17}));
//        System.out.println("============");
//        assertEquals(4, obj.longestConsecutive(new int[]{2, 4, 6, 8, 9, 1, 3}));
//        System.out.println("============");
        String testData = Files.readString(Path.of("src/test/resources/test-data"));
        int[] array = Arrays.stream(testData.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        long start = System.currentTimeMillis();
        assertEquals(100000, obj.longestConsecutive(array));
        System.out.println("took " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void longestConsecutive2() throws IOException {
//        assertEquals(5, obj.longestConsecutive(new int[]{1, 2, 3, 4, 5}));
//        System.out.println("============");
//        assertEquals(6, obj.longestConsecutive(new int[]{9, 7, 5, 6, 7, 4, 3, 2, 17}));
//        System.out.println("============");
//        assertEquals(4, obj.longestConsecutive(new int[]{2, 4, 6, 8, 9, 1, 3}));
//        System.out.println("============");
        String testData = Files.readString(Path.of("src/test/resources/test-data"));
        int[] array = Arrays.stream(testData.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        long start = System.currentTimeMillis();
        assertEquals(100000, obj.longestConsecutive2(array));
        System.out.println("took " + (System.currentTimeMillis() - start) + " ms");
    }

}