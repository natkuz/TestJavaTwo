package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

//    public Car car;
//    public Motorcycle motorcycle;
//
//    @BeforeEach
//    void setup() {
//        Car car = new Car("ABC", "MOD", 2023);
//        Motorcycle motorcycle = new Motorcycle("QWE", "MOD", 2020);
//    }

    /**
     * Проверить, что экземпляр объекта Car также является экземпляром транспортного средства
     * (используя оператор instanceof).
     */

    @Test
    void carIsVehicle() {
        Car car = new Car("ABC", "MOD", 2023);
        assertTrue(car instanceof Vehicle);
    }

    /** Проверить, что объект Car создается с 4-мя колесами.*/

    @Test
    void carNumWheels() {
        Car car = new Car("ABC", "MOD", 2023);
        assertEquals(car.getNumWheels(), 4);
    }

    /** Проверить, что объект Motorcycle создается с 2-мя колесами.*/

    @Test
    void motorcycleNumWheels() {
        Motorcycle motorcycle = new Motorcycle("QWE", "MOD", 2020);
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    /**
     * Проверить, что объект Car развивает скорость 60 в режиме тестового вождения
     * (используя метод testDrive())
     */

    @Test
    void carSpeed() {
        Car car = new Car("ABC", "MOD", 2023);
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    /**
     * Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения
     * (используя метод testDrive())
     */

    @Test
    void motorcycleSpeed() {
        Motorcycle motorcycle = new Motorcycle("QWE", "MOD", 2020);
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
     * машина останавливается (speed = 0)
     */

    @Test
    void carSpeedOnPark() {
        Car car = new Car("ABC", "MOD", 2023);
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
     * мотоцикл останавливается (speed = 0)
     */

    @Test
    void motorcycleSpeedOnPark() {
        Motorcycle motorcycle = new Motorcycle("QWE", "MOD", 2020);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}