package dbt.arrayandhashing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EncodeDecodeTest {

    private static EncodeDecode obj;

    @BeforeAll
    static void setUpBeforeClass() {
        obj = new EncodeDecode();
    }

    @Test
    void testEncode() {
        List<String> input = List.of("lint", "code", "love", "you");
        String encoded = obj.encode(input);
        System.out.println(encoded);
        assertEquals("4#lint4#code4#love3#you", encoded);
    }

    @Test
    void testDecode() {
        List<String> input = List.of("lint", "code", "love", "you");
        String encoded = obj.encode(input);
        System.out.println(encoded);
        assertArrayEquals(input.toArray(), obj.decode(encoded).toArray());
    }
}