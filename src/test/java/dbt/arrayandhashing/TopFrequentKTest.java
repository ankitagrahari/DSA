package dbt.arrayandhashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TopFrequentKTest {

    TopFrequentK topFrequentK;

    @BeforeEach
    void setUp() {
        topFrequentK = new TopFrequentK();
    }

    @Test
    void topKFrequent1() {
        int[] result = topFrequentK.topKFrequent(new int[]{1, 2, 2, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5}, 3);
        assertEquals(3, result.length);
    }

    @Test
    void topKFrequent2() {
        int[] result = topFrequentK.topKFrequent(new int[]{1, 2, 3, 4, 5}, 2);
        assertEquals(2, result.length);
    }

    @Test
    void topKFrequent3() {
        int[] result = topFrequentK.topKFrequent(new int[]{1,2,2,3,3,3}, 2);
        assertEquals(2, result.length);
    }

    @Test
    void topKFrequent4() {
        int[] result = topFrequentK.topKFrequent(new int[]{7, 7}, 1);
        assertEquals(1, result.length);
    }

    @Test
    void topKFrequent5() {
        int[] result = topFrequentK.topKFrequent(new int[]{}, 0);
        assertEquals(0, result.length);
    }
}