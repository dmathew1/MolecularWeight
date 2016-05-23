import java.lang.reflect.Array;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Denzel on 5/22/2016.
 */
public class MolecularWeight {


    //check number
    private static boolean isNumber(String number){
        String numRegex = "[0-9]";
        if(Pattern.matches(numRegex,number)){
            return true;
        }else{
            return false;
        }
    }


    //check string
    private static boolean isString(String string){
        String stringRegex = "[A-Za-z]";
        if(Pattern.matches(stringRegex,string)){
            return true;
        }else{
            return false;
        }
    }


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
        String regexSeparator = " ";

        //array of split elements and coefficients
        String[] trimmedElements = input.split(regexSeparator);

        //end the final element with a "."
        String[] elements = new String[trimmedElements.length + 1];

        int count = 0;
        for(String element : trimmedElements){
            elements[count] = trimmedElements[count];
            count++;
        }

        //insert the EOF
        elements[elements.length-1] = ".";

        //elementWeight
        ArrayList<Double> elementWeight = new ArrayList<>();

        //coefficient
        ArrayList<Integer> factors = new ArrayList<>();

        //loop through the parsed information
        int factor =1;
        Double weightTotal = 0.0;


        for(int i = 0; i < elements.length; i++){

           //get the element
           if(isString(elements[i])){


               PeriodicElement periodicElement = (PeriodicElement)map.get(elements[i]);
               Double weight = periodicElement.getAtomicWeight();

               //check next one if its a number and not null
               if(elements[i+1]!="." && isNumber(elements[i+1])){
                   factor = Integer.parseInt(elements[i+1]);
               }else{
                   factor = 1;
               }

               weightTotal += weight * factor;

           }
        }

        System.out.println(input + "'s weight is: "  + weightTotal);


    }


}

