import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Movies {
    public static void main(String[] args) {
        FileInputStream myFile = null;

        try{
            myFile = new FileInputStream("src/moviesDataset.csv");
            Scanner fileReader = new Scanner(myFile);

            int counter=0;
            MovieObjects[] movieArray = new MovieObjects[801]; // I need to store the movie info in an array

            while (fileReader.hasNextLine()){
                MovieObjects movie1 = new MovieObjects();


                String data = fileReader.nextLine();
                //System.out.println(data);

                //This part works. It gives me title type, which is the first piece of data I need. I intended to replicate but take different sections of the lines.
                //That is proving harder than I thought.
                int a = data.indexOf(",");
                int b = data.indexOf(",", data.indexOf(",")+1);
                movie1.setTitleType(data.substring(a+1,b));
                System.out.println(movie1.getTitleType());
                //System.out.println(a);
                //System.out.println(b + " b");

                //int c = data.indexOf(",", b);
                //movie1.setPrimaryTitle();
                //System.out.println(movie1.getPrimaryTitle());
                //System.out.println(c + " c");

                movieArray[counter] = movie1;
                counter++;

            } fileReader.close();

        } catch (FileNotFoundException e1) {
            System.out.println("File Not Found");
        }

    }
}
