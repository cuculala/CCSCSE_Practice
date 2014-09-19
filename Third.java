import java.util.Scanner;
import java.util.Arrays;

//Intended for redirect Input

public class Third {

        /**
         * @param args
         */
        public static void main(String[] args) {
                // TODO Auto-generated method stub
                Scanner input = new Scanner (System.in);
                System.out.println("Enter the size of the length for square.");
                while(input.hasNext()){
		
                String [] numbers = input.next().split("\\s");
                Arrays.sort(numbers);
                System.out.println(numbers[numbers.length-3]);
                }

                }
        }

~                                                                                                                
~                                                                                                                
~                                                                                                                
~                                                                                                                
~                                                                                                                
~                                                                                                                
~                                                                                                                
~                                                                                                                

