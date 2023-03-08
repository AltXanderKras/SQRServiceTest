package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void testSQRfound() {
        SQRService service = new SQRService();

        int actual = service.calcSqrs(300, 700);
        int expected = 9;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSQRlimitValus() {
        SQRService service = new SQRService();

        int actual = service.calcSqrs(200, 800);
        int expected = 14;

        Assertions.assertEquals(expected, actual);

    }


}

