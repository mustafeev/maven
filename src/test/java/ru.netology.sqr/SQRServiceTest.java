package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void shouldCalcInexact() {
        SQRService service = new SQRService();
        int expected = 40;
        int actual = service.calcSqrt(10, 99);


        Assertions.assertEquals(expected, actual);


    }
}
