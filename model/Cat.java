package model;

import enums.FurColor;
import enums.Habitat;

public class Cat extends Animal{

    private int lives;
    private FurColor furColor;
    private boolean isIndoor;
    private String favoriteFood;
    private int purringFrequency;
    private boolean isNeutered;

    public Cat(String name, int age, double weight, int lives, FurColor furColor, boolean isIndoor, String favoriteFood, int purringFrequency, boolean isNeutered ){
        super(name, 30, age, weight,isIndoor ? Habitat.DOMESTIC : Habitat.URBAN, false);
        this.lives = 7;
        this.furColor = furColor;
        this.isIndoor = isIndoor;
        this.favoriteFood = favoriteFood;
        this.purringFrequency = purringFrequency;
        this.isNeutered = isNeutered;

    }

    @Override
    public void makeSound(){
        System.out.println(getName() + "Purring: Maow!" + purringFrequency + "Hz" );

    }

    @Override
    public void sleep() {
        System.out.println(getName() + " Sleeping " + "14h");
    }

    public void move(int distance, int speed){
        System.out.println(getName() + " sprinted " + distance + " meters at " + speed + " Km/h ");
    }

    public  void move(int distance, String target){
        System.out.println(getName() + " moved silently " + distance + " meters toward the " + target + " ... " );

    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("lives: " + lives);
        System.out.println("furColor:" + furColor);
        System.out.println("isIndoor:" + (isIndoor ? "Yes": "No"));
        System.out.println("favoriteFood:" +  favoriteFood);
        System.out.println("purringFrequency:" + purringFrequency);
        System.out.println("isNeutered:" + (isNeutered? "Yes": "No"));
    }

    public void purr(){
        System.out.println(getName() + " purrs at " + purringFrequency + " Hz.");
    }

    public void loseLife(){
        if (lives > 0) {
            lives-= 1;
            System.out.println(getName() + " just lost a life! It only has: " + lives + " left.");
        } else {
            System.out.println(getName() + " Died da silva! ");
        }
    }

    //Getters
    public int getLives(){
        return lives;
    }

    public FurColor getFurColor(){
        return furColor;
    }

    public boolean isIndoor(){
        return isIndoor;
    }

    public String geFavoriteFood(){
        return favoriteFood;
    }

    public int getPurringFrequency(){
        return purringFrequency;
    }

    public boolean isNeutered(){
        return isNeutered;
    }
   
}
