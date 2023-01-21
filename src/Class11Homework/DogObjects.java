package Class11Homework;

public class DogObjects {
    public static void main(String[] args) {

        Dog Husky    =   new Dog();

        Husky.name   =   "Rover";
        Husky.breed  =   "Siberian";
        Husky.color  =   "Black";
        Husky.age    =   10;
        Husky.puppy =   false;

        Husky.speak();
        Husky.sleep();


        Dog Bulldog =   new Dog();

        Bulldog.name    =   "Sparky";
        Bulldog.breed   =   "French";
        Bulldog.color   =   "Beige";
        Bulldog.age     =    9;
        Bulldog.puppy   =   false;

        Bulldog.speak();
        Bulldog.sleep();

        Dog Labrador    =   new Dog();

        Labrador.name    =   "Sparky";
        Labrador.breed   =   "Retriever";
        Labrador.color   =   "Golden";
        Labrador.age     =    3;
        Labrador.puppy   =   true;

        Labrador.speak();
        Labrador.sleep();

    }
}
