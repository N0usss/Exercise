import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {

//private static final Exception IOException = null;

public static void main(String[] args){

    try{
        
        //List<Integer> readFile(String fileName) throw IOException;

        File file = new File("input.txt");
        FileReader fr = new FileReader(file);
        Scanner Read = new Scanner(fr);
        FileWriter fw = new FileWriter("Output.txt");

        while(Read.hasNextLine()){

            
            int n = Read.nextInt();
            n=n/2;

            if(n==0){

                fw.write("Division by zero error for number " + n +"\n");
            }
            else{


            fw.write(n+"\n");
            }
        }

        fw.close();
        
    }catch(Exception e){

        System.out.println("Checking exception: " + e.getMessage());
    }

}
    
}
