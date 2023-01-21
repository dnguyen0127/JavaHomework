package Class11Homework;

public class Countries2DArray {
    public static void main(String[] args) {
        String[][] countries = {{"Lousiana", "Michigan", "California", "Texas"},
                {"Brazil", "Guinea", "Venezuela", "Panama"},
                {"Romania", "Scotland", "England", "Italy"},
                {"Vietnam", "China", "Mongolia", "Korea"},
                {"Egypt", "Sudan", "Nigeria", "Wakanda"}
        };

        int sum=0;

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.println(countries[i][j]);
                sum++;
            }

        }
        System.out.println("There are "+sum+" countries.");
        System.out.println();
        System.out.println("***********");
        System.out.println();

        for(String[] country:countries){
            for (String x:country){
                System.out.println(x);
            }

        }
        System.out.println("There are "+sum+" countries.");

    }

}
