package ru.netology.sqr;

public class SQRService {
    public int calcSqrs(int lowerValue, int highestValue) {
        int result = 0;

        for (int i = 10; i <= 99; i++) {

            int sqr = i * i;
            if (sqr >= lowerValue) {
                if (sqr <= highestValue) {

                    result++;

                }
            }

        }
        return result;

    }
}
