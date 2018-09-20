/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

/**
 *
 * @author Laurentiu
 */
public class Autoservice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Instantiating the objects
        Car car1 = new Car(Car._Car.Ferrari, Car.Color.Black, 360, 50, 370000);
        Car car2 = new Car(Car._Car.Jaguar, Car.Color.Brown, 340, 70, 420000);
        Car car3 = new Car(Car._Car.Porche, Car.Color.White, 370, 90, 500000);

        Autoservice as = new Autoservice();
        as.displayAutoservice(car1, car2, car3);
         
        //Modified values 
        car1.increaseSpeed(10);
        car2.decreaseSpeed(10);
        car3.increaseRentPrice(15);
        car3.decreaseSalePrice(1200);

    }

    //Displaying the information
    private void displayAutoservice(Car a, Car b, Car c) {
        System.out.println("Initial Values");
        System.out.println("\nCar name: " + a.getName());
        System.out.println("Car color: " + a.getColor());
        System.out.println("Car speed: " + a.getSpeed() + "km/h");
        System.out.println("Car renting price: " + a.getRentPrice() + "€/h");
        System.out.println("Car sale price: " + a.getSalePrice() + "€");
       
        System.out.println("\nCar name: " + b.getName());
        System.out.println("Car color: " + b.getColor());
        System.out.println("Car speed: " + b.getSpeed() + "km/h");
        System.out.println("Car renting price: " + b.getRentPrice() + "€/h");
        System.out.println("Car sale price: " + b.getSalePrice() + "€");
        
        System.out.println("\nCar name: " + c.getName());
        System.out.println("Car color: " + c.getColor());
        System.out.println("Car speed: " + c.getSpeed() + "km/h");
        System.out.println("Car renting price: " + c.getRentPrice() + "€/h");
        System.out.println("Car sale price: " + c.getSalePrice() + "€");

        System.out.println("\nModified Values");
        
        System.out.println("\nCar name: " + a.getName());
        System.out.println("Car color: " + a.getColor());
        System.out.println("Car speed: " + a.increaseSpeed(10) + "km/h");
        System.out.println("Car renting price: " + a.getRentPrice() + "€/h");
        System.out.println("Car sale price: " + a.getSalePrice() + "€");
        
        System.out.println("\nCar name: " + b.getName());
        System.out.println("Car color: " + b.getColor());
        System.out.println("Car speed: " + b.decreaseSpeed(10) + "km/h");
        System.out.println("Car renting price: " + b.getRentPrice() + "€/h");
        System.out.println("Car sale price: " + b.getSalePrice() + "€");
        
        System.out.println("\nCar name: " + c.getName());
        System.out.println("Car color: " + c.getColor());
        System.out.println("Car speed: " + c.getSpeed() + "km/h");
        System.out.println("Car renting price: " + c.increaseRentPrice(15)+ "€/h");
        System.out.println("Car sale price: " + c.decreaseSalePrice(1200) + "€");
    }

}
