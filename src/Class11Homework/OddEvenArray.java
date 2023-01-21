package Class11Homework;

public class OddEvenArray {
    public static void main(String[] args) {
        int[][] num=    {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };


        for(int row=0; row<num.length;    row++){
            for(int col=0;  col<num[row].length;   col++){
                if((num[row][col]%2)==0){
                    System.out.println(num[row][col]);
                }


            }

        }


    }
}
