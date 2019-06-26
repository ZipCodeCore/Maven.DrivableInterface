package Vehicles;

import Driving.Bike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MountainBikeTest {
    Bike mb;

    @Before
    public void setUp() throws Exception {
        this.mb = new MountainBike();
    }

    @Test
    public void getTopSpeed() {
        // Arrange
        Double expected = 28.5;

        // Act
        Double actual = mb.getTopSpeed();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getTopSpeedAfterTransport() {
        // Arrange
        Double expected = 26.5;

        // Act
        mb.transport(2.0);
        Double actual = mb.getTopSpeed();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getTopSpeedAfterTransportThenInflateTires() {
        // Arrange
        Double expected = 28.5;

        // Act
        mb.transport(2.0);
        mb.inflateTires();
        Double actual = mb.getTopSpeed();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void transport() {
        // Arrange
        Integer expected = (60 * 60);

        // Act
        Integer actual = mb.transport(28.5);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void transportTirePressure() {
        // Arrange
        Integer expected = 28;

        // Act
        mb.transport(28.5 * 2);
        Integer actual = mb.getTirePressure();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void transportTirePressure2() {
        // Arrange
        Integer expected = 27;

        // Act
        mb.transport(28.5 * 3);
        Integer actual = mb.getTirePressure();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getTirePressure() {
        // Arrange
        Integer expected = 30;

        // Act
        Integer actual = mb.getTirePressure();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void inflateTires() {
        // Arrange
        Integer expected = 30;

        // Act
        mb.transport(28.5 * 3);
        Integer tirePressureAfterTransport = mb.getTirePressure();

        mb.inflateTires();
        Integer actual = mb.getTirePressure();

        // Assert
        assertNotEquals(expected, tirePressureAfterTransport);
        assertEquals(expected, actual);
    }

    @Test
    public void reccommendedTirePressure() {
        // Arrange
        Integer expected = 30;

        // Act
        Integer actual = mb.reccommendedTirePressure();

        // Assert
        assertEquals(expected, actual);
    }
}