package dbt.arrayandhashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductArrayItselfTest {

    ProductArrayItself obj;

    @BeforeEach
    void setUp() {
        obj = new ProductArrayItself();
    }

    @Test
    void productExceptSelf() {
        assertArrayEquals(new int[]{48,24,12,8},  obj.productExceptSelf(new int[]{1,2,4,6}));
        assertArrayEquals(new int[]{0,-6,0,0,0},  obj.productExceptSelf(new int[]{-1,0,1,2,3}));
        assertArrayEquals(new int[]{},   obj.productExceptSelf(new int[]{}));
        assertArrayEquals(new int[]{0,0,0},   obj.productExceptSelf(new int[]{0,0,0}));
    }
}