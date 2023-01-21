package Class11Homework;

public class CarsArray {
    public static void main(String[] args) {
        String[][] cars = {{"American", "Korean", "Italian", "German"},
                {"Ford", "Kia", "Lamborghini", "BMW"}
        };

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }

        System.out.println("***********");

        for(String[] car:cars){
            for (String x:car){
                System.out.println(x);
            }

        }

    }

}
