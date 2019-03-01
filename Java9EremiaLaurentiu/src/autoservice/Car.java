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
public class Car implements Saleable, Rentable {

      
    //Making enums so that no one can indirectly add/remove the values
    public enum Color {White,Black,Brown};
    public enum _Car{Jaguar, Ferrari, Porche};
    
    //Defining variables
    private _Car carName;
    private Color color;
    private int speed;
    private int rentPrice;
    private int salePrice;
    
    //Creating the overloaded constructor
    public Car (_Car newCarName, Color newColor, int newSpeed, int newRentPrice, int newSalePrice){
        carName = newCarName;
        color = newColor;
        speed = newSpeed;
        rentPrice = newRentPrice;
        salePrice = newSalePrice;
    }
    
    public _Car getName(){
        return carName;
    }
     public Color getColor(){
        return color;
    }
    public int getSpeed(){
        return speed;
    }
    public int getRentPrice(){
        return rentPrice;
    }
    public int getSalePrice(){
        return salePrice;
    }
    public int increaseSpeed(int value){
        return (speed + value);
    }
    public int decreaseSpeed(int value){
        return (speed - value);
    }
    @Override
    public int increaseRentPrice(int value){
        return (rentPrice + value);
    }
    @Override
    public int decreaseSalePrice(int value){
        return (salePrice - value);
    }

}
