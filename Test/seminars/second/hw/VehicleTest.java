package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    /*- проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
      - проверка того, объект Car создается с 4-мя колесами
      - проверка того, объект Motorcycle создается с 2-мя колесами
      - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
      - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
      - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта)
      машина останавливается (speed = 0)
      - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта)
      мотоцикл останавливается (speed = 0)*/

    @BeforeEach
    void SetUp(){
        car = new Car("Dodge", "Ram", 2010);
        motorcycle = new Motorcycle("Minsk", "350", 2023);
    }

    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarGotFourWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public void testMotorcycleGotTwoWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    public void carTestDriveSpeed() {
        assertEquals(car.testDrive(),60);
    }

    @Test
    public void motorcycleTestDriveSpeed() {
        assertEquals(motorcycle.testDrive(), 75);
    }

    @Test
    public void carParkSpeed() {
        assertThat(car.park()).isEqualTo(0);
    }

    @Test
    public void motorcycleParkSpeed() {
        assertThat(motorcycle.park()).isEqualTo(0);
    }
}


