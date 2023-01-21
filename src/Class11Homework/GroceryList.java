package Class11Homework;

public class GroceryList {
    public static void main(String[] args) {
        String[][] groceryList = {{"Apples", "Bananas", "Grapes", "Oranges"},
                {"Brocolli", "Peas", "Onions", "Parsley"},
                {"Milk", "Ice Cream", "Cheese",},
                {"Candy", "Chocolate", "Sugar", "Cookies"}
        };

        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.println(groceryList[i][j]);
            }
        }

        System.out.println();
        System.out.println("***********");
        System.out.println();

        for(String[] groceries:groceryList){
            for (String x:groceries){
                System.out.println(x);
            }

        }

    }
}
