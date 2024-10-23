import static org.junit.jupiter.api.Assertions.*;

class DonutFactoryTest {

    @org.junit.jupiter.api.Test
    void getPriceOfDonuts() {

        // Arrange
        DonutFactory df = new DonutFactory(.50);

        int halfDozen = 6;
        double costPerHalfDozen = 2.70;

        // Act
        double result = df.getPriceOfDonuts(halfDozen);

        // Assert
        assertEquals(costPerHalfDozen, result);

    }
}