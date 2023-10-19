package com.zenika.test.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumServiceTest {

    @Test
    @DisplayName("1 + 1 = 2")
    void addOneAndOne() {
        var sumService = new SumService();
        assertEquals(2, sumService.sum(1, 1));
    }

    @Test
    @DisplayName("9 + 3 = 12")
    void addNineAndThree() {
        var sumService = new SumService();
        assertEquals(12, sumService.sum(9, 3));
    }
    
}
