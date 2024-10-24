import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DonutFactoryTest {

    @org.junit.jupiter.api.Test
    void getPriceOfDonuts_halfDozen_get_10_percent_discount() {

        // Fixed values for this test
        int halfDozen = 6;
        double costPerHalfDozen = 2.70;
        double unitPricePerDonut = .50;

        // Arrange the test object(s)
        DonutFactory df = new DonutFactory(unitPricePerDonut);

        // Act on the object(s)
        double result = df.getPriceOfDonuts(halfDozen);

        // Assert what SHOULD happen
        assertEquals(costPerHalfDozen, result);

    }

    @Test
    void getPriceOfDonuts_0_to_5_donuts_no_discount() {

        // Fixed values for this test
        int three = 3;
        double costForThreeDonuts = 1.50;
        double unitPricePerDonut = .50;

        // Arrange the test object(s)
        DonutFactory df = new DonutFactory(unitPricePerDonut);

        // Act on the object(s)
        double result = df.getPriceOfDonuts(three);

        // Assert what SHOULD happen
        assertEquals(costForThreeDonuts, result);

    }

    @Test
    void getPriceOfDonuts_multiple_dozens_get_20_percent_discount() {

        // Fixed values for this test
        int twentyFour = 24;
        double costForTwoDozenDonuts = 9.60;
        double unitPricePerDonut = .50;

        // Arrange the test object(s)
        DonutFactory df = new DonutFactory(unitPricePerDonut);

        // Act on the object(s)
        double result = df.getPriceOfDonuts(twentyFour);

        // Assert what SHOULD happen
        assertEquals(costForTwoDozenDonuts, result);

    }
}