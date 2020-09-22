import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorhw{
   public static void main(String[] args){
      List<Integer> numbers = new ArrayList<Integer>(){
         {  add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
            add(10);
            add(11);
            add(12);
         }
      };
      
      Iterator<Integer> iter = numbers.iterator();
      while (iter.hasNext()){
         int number = iter.next();
         if (number % 2 != 1){ //Only prints out the number where remainder is 1 when divided by 2 which is an odd number
            iter.remove();
         }
         System.out.println("Number: " + number);
      }
      System.out.println("You may think it didn't remove the values based on the output. Check again.");
      iter = numbers.iterator();
      while (iter.hasNext()){
         int number = iter.next();
         System.out.println("Number: " + number);
      }
   }
}
   