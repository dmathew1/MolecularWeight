import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Denzel on 5/22/2016.
 */
public class MolecularWeight {

    public static void main(String[] args) {

        //Regex compiler
        Pattern regex;

        //create PeriodicTable Object
        PeriodicTable periodicTable = new PeriodicTable();

        //HashMap of the periodic Elements to their symbols
        HashMap map = periodicTable.map;

        //read in user input
        Scanner in = new Scanner(System.in);

        //Store users input
        String input = in.nextLine();

        //separate the elements with their coefficient
        String regexSeparator = "[A-Z][a-z]*)";


        String[] elements = input.split(regexSeparator);

        for(String element: elements){
            System.out.println(element);
        }

    }
}

