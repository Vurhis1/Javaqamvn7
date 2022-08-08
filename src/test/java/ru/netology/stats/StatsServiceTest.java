package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindAmountAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmount = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actualAmount = service.sum(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindAverageAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long avg = 180 / 12;
        long expectedAverage = 15;
        long actualAverage = service.average(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxDay = 8;
        long actualMaxDay = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxDay, actualMaxDay);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinDay = 9;
        long actualMinDay = service.minSales(sales);

        Assertions.assertEquals(expectedMinDay, actualMinDay);
    }

    @Test
    public void shouldFindCountAboveAvg() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAboveAvg = 5;
        long actualAboveAvg = service.countAboveAvg(sales);

        Assertions.assertEquals(expectedAboveAvg, actualAboveAvg);
    }

    @Test
    public void shouldFindCountBelowAvg() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedBelowAvg = 5;
        long actualBelowAvg = service.countBelowAvg(sales);

        Assertions.assertEquals(expectedBelowAvg, actualBelowAvg);
    }
}
