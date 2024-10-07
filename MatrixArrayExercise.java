public class MatrixArrayExercise {

    public static void main(String[] args) {
        
     int [][] matrix = {

        {1,2,3},
        {4,5,6,7},
        {8,9}
        };
        
        for(int row=0; row<matrix.length;row++){

            System.out.println("Matrix "+ row + " contains " + matrix[row].length + " data.");

            for(int column=0;column<matrix[row].length;column++){

                System.out.println(matrix[row][column]);

        }

        System.out.println("\nAnother Exercise\n");

        }

        int[] integerArray = new int[5];
        double[] doubleArray = new double[5];
        char[] charArray = new char[5];
        boolean[] boolArray = new boolean[5];
        String[] stringArray = new String[5];

        System.out.println("Default value for integer array");
        for(int intValue : integerArray){
            System.out.print(intValue + " ");
        }
        System.out.println("\nDefault value for double array");
        for(double doubleValue : doubleArray){
            System.out.print(doubleValue+ " ");
        }
        System.out.println("\nDefault value for char array");
        for(char charValue : charArray){
            System.out.print(charValue + " ");
        }
        System.out.println("\nDefault value for boolean array");
        for(boolean boolValue : boolArray){
            System.out.print(boolValue + " ");
        }
        System.out.println("\nDefault value for String array");
        for(String stringValue : stringArray){
            System.out.print(stringValue + " ");
        }

        System.out.println("\n---------------------------------------");
        System.out.println("\nInserting data inside array example");

        integerArray = new int[]{10,20,30,40,50};
        doubleArray = new double[]{1.0,2.0,3.0,4.0,5.0};
        charArray = new char[]{'A','B','C','D','E'};
        boolArray = new boolean[]{false,true,true,false,false};
        stringArray = new String[]{"Amin", "Alim", "Ikmal", "Apan", "Anas"};

        System.out.println("\nData inside integer: ");
        for (int i=0;i<integerArray.length;i++){

            System.out.println(integerArray[i]);
        }
        System.out.println("\nData inside double: ");
        for (int i=0;i<doubleArray.length;i++){

            System.out.println(doubleArray[i]);
        }
        System.out.println("\nData inside character: ");
        for (int i=0;i<charArray.length;i++){

            System.out.println(charArray[i]);
        }
        System.out.println("\nData inside boolean: ");
        for (int i=0;i<boolArray.length;i++){

            System.out.println(boolArray[i]);
        }
        System.out.println("\nData inside String: ");
        for (int i=0;i<stringArray.length;i++){

            System.out.println(stringArray[i]);
        }

        
        // System.out.println("\nError example of Array out of bounds: \n");
        // for(int i=0; i<6;i++){
        //     System.out.println(integerArray[i]);
        // }

       System.out.println("\nExample of catching an error of an array\n");
        try{
            System.out.println(integerArray[6]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught array error " + e.getMessage());
        }

    }

}
