import javafx.scene.control.Tab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


/**
 * Created by Denzel on 5/22/2016.
 */
public class PeriodicTable {

    //container of PeriodicElements
    HashMap<String,PeriodicElement> map = new HashMap();

    //Constructor
    public PeriodicTable(){

        //Path to the CSV
        String path = "src/periodictable.csv";

        //number of lines to skip
        int skip = 1;

        //read in the csv file and buffer them
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String element;

            //skip lines
            for(int i = 0; i < skip; i++){
                bufferedReader.readLine();
            }

            while ((element = bufferedReader.readLine()) != null) {
                String[] elements = element.split(",");

                //get number
                Integer number = Integer.parseInt(elements[0]);

                //get name
                String name = elements[1];

                //get symbol
                String symbol = elements[2];

                //get weight
                Double weight = Double.parseDouble(elements[3]);

                //create element object
                PeriodicElement periodicElement = new PeriodicElement(number,name,symbol,weight);

                //add into the ArrayList
                map.put(symbol,periodicElement);

                //System.out.println(symbol + " is in the map: " + map.containsKey(symbol));

            }
        }catch(IOException e){
            e.printStackTrace();
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
    }

}
