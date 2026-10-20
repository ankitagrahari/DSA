package dbt.arrayandhashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    GroupAnagrams obj;
    @BeforeEach
    void setUp() {
        obj = new GroupAnagrams();
    }

    @Test
    void groupAnagrams() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = obj.groupAnagrams(input);
        System.out.println(result);
        assertEquals(3, result.size());
    }
}