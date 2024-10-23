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
}