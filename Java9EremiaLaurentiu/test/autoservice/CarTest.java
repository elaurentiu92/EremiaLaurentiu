/*
 * JUnit testing for Car class
 */
package autoservice;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laurentiu
 */
public class CarTest {
    
    public CarTest() {
    }

    /**
     * Test of getName method, of class Car.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Car instance = new Car(Car._Car.Ferrari, Car.Color.White, 100, 100, 100);
        Car._Car expResult = Car._Car.Ferrari;
        Car._Car result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getColor method, of class Car.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Car instance = new Car(Car._Car.Ferrari, Car.Color.White, 100, 100, 100);
        Car.Color expResult = Car.Color.White;
        Car.Color result = instance.getColor();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getSpeed method, of class Car.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        Car instance = new Car(Car._Car.Ferrari, Car.Color.White, 100, 100, 100);
        int expResult = 100;
        int result = instance.getSpeed();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getRentPrice method, of class Car.
     */
    @Test
    public void testGetRentPrice() {
        System.out.println("getRentPrice");
        Car instance = new Car(Car._Car.Ferrari, Car.Color.White, 100, 100, 100);
        int expResult = 100;
        int result = instance.getRentPrice();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getSalePrice method, of class Car.
     */
    @Test
    public void testGetSalePrice() {
        System.out.println("getSalePrice");
        Car instance = new Car(Car._Car.Ferrari, Car.Color.White, 100, 100, 100);
        int expResult = 100;
        int result = instance.getSalePrice();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of setCarName method, of class Car.
     */
    @Test
    public void testSetCarName() {
        System.out.println("setCarName");
        Car._Car carName = Car._Car.Ferrari;
        Car instance = new Car(Car._Car.Ferrari, Car.Color.White, 100, 100, 100);
        //instance.setCarName(carName);
        
    }

    /**
     * Test of setColor method, of class Car.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Car.Color color = Car.Color.White;
        Car instance = new Car(Car._Car.Ferrari, Car.Color.White, 100, 100, 100);
        //instance.setColor(color);
      
    }

    /**
     * Test of setSpeed method, of class Car.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        int speed = 60;
        Car instance = new Car(Car._Car.Ferrari, Car.Color.White, 100, 100, 100);
        //instance.setSpeed(speed);
        
    }

    /**
     * Test of setRentPrice method, of class Car.
     */
    @Test
    public void testSetRentPrice() {
        System.out.println("setRentPrice");
        int rentPrice = 200;
        Car instance = new Car(Car._Car.Ferrari, Car.Color.White, 100, 100, 100);
        //instance.setRentPrice(rentPrice);
      
    }

    /**
     * Test of setSalePrice method, of class Car.
     */
    @Test
    public void testSetSalePrice() {
        System.out.println("setSalePrice");
        int salePrice = 5000;
        Car instance = new Car(Car._Car.Ferrari, Car.Color.White, 100, 100, 100);
       // instance.setSalePrice(salePrice);
       
    }

    /**
     * Test of increaseSpeed method, of class Car.
     */
    @Test
    public void testIncreaseSpeed() {
        System.out.println("increaseSpeed");
        int value = 70;
        Car instance = new Car(Car._Car.Ferrari, Car.Color.White, 100, 100, 100);
        int expResult = 170;
        int result = instance.increaseSpeed(value);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of decreaseSpeed method, of class Car.
     */
    @Test
    public void testDecreaseSpeed() {
        System.out.println("decreaseSpeed");
        int value = 30;
        Car instance = new Car(Car._Car.Ferrari, Car.Color.White, 100, 100, 100);
        int expResult = 70;
        int result = instance.decreaseSpeed(value);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of increaseRentPrice method, of class Car.
     */
    @Test
    public void testIncreaseRentPrice() {
        System.out.println("increaseRentPrice");
        int value = 200;
        Car instance = new Car(Car._Car.Ferrari, Car.Color.White, 100, 100, 100);
        int expResult = 300;
        int result = instance.increaseRentPrice(value);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of decreaseSalePrice method, of class Car.
     */
    @Test
    public void testDecreaseSalePrice() {
        System.out.println("decreaseSalePrice");
        int value = 10;
        Car instance = new Car(Car._Car.Ferrari, Car.Color.White, 100, 100, 100);
        int expResult = 90;
        int result = instance.decreaseSalePrice(value);
        assertEquals(expResult, result);
       
    }
    
}
