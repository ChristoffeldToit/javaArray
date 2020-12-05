package arraylistexample;

import java.util.ArrayList;
import java.util.Random;


public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Speaker");
        myList.add("Screen");
        myList.add("Projector");
        
        Random objGenerator = new Random();
        
         for (int iCount = 0; iCount< 2; iCount++){
              int randomNumber = objGenerator.nextInt(10);
              System.out.println("Random No : " + randomNumber); 
             }
        for(int count = 0; count  < myList.size(); count++){
            System.out.println("[ " + count + " ] " + myList.get(count));
        }
        //Removes inddex 1 and moves up the array by 1
        System.out.println("Remove");
        myList.remove(1);
        
        //Removes inddex 1 and moves up the array by 1 again
        for(int count = 0; count  < myList.size(); count++){
            System.out.println("[ " + count + " ] " + myList.get(count));
        }
        System.out.println("Remove");
        myList.remove(1);
    }
}
