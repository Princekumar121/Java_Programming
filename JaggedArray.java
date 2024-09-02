public class JaggedArray {
    public static void main(String[] args) {
         int[][] jaggedArray = new int[3][];
           jaggedArray[0] = new int[3];
           jaggedArray[1] = new int[4];
           jaggedArray[2] = new int[2];
           int value = 1;  
           for (int i = 0; i < jaggedArray.length; i++) {  
               for (int j = 0; j < jaggedArray[i].length; j++) {  
                   jaggedArray[i][j] = value;  
                   value++;  
               } }
           System.out.println("Jagged array elements:");
           for (int i = 0; i < jaggedArray.length; i++) {
               for (int j = 0; j < jaggedArray[i].length; j++) {
                   System.out.print(jaggedArray[i][j] + " " );}
               System.out.println();
           }}}
   
