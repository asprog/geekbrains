package ru.gb_cource2.lesson2;

public class Matrix {
    public static void main(String[] args)  {
        try {
            System.out.printf("Сумма: %d",printMatrix(new String[][]{{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}}));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

  private static int printMatrix(final String[][] matrix) throws MyArraySizeException, MyArrayDataException {
   int sum = 0;
   int _x = -1,_y = -1;
   if(matrix.length == 4 && matrix[3].length == 4){
     try {
       for (int x = 0; x < matrix.length; x++) {
           for (int y = 0; y < matrix[3].length; y++) {
               _x = x;
               _y = y;
               sum += Integer.parseInt(matrix[x][y]);
           }
       }
     }catch (NumberFormatException ex){
       System.out.printf("Error: %s, found in element: [%d][%d]",ex,_x,_y);
       throw new MyArrayDataException();
     }
   }else throw new MyArraySizeException();
   return sum;
  }
}
