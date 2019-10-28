/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Precision
 */
public class NewClass {
    public static String repeatfunc(String s) {
        String[] words = s.split("\\s");
        ArrayList<String> words2 = new ArrayList<>();
        String result = "";
        int k = 0;
        for (String w : words) {
            words2.add(w);
        }
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < words2.size(); i++) {
            for (int j = i + 1; j < words2.size(); j++) {
                if (words2.get(i).equals(words2.get(j))) { 
                    index.add(j);
                    words2.set(i,"REPEAT");
                }   
                else{
                    break;
                }
            } 
        }
        for (Integer integer : index) {
            words2.set(integer, "");
        }
        for (String string : words2) {
            if(!string.equals("")){
                result += string+" ";
            }
        }
        result=result.replace("\\s+","");
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); 
//        System.out.print("Input : "); 
//        String s = inp.nextLine(); 
//        System.out.println(repeatfunc("I want to to go to the the the zoo"));
//        System.out.println(repeatfunc(s));
        
        //Case 1:
        System.out.println("Case 1: I want to go to to the zoo");
        System.out.println("Expect out : I want to go REPEAT the zoo ");
        System.out.println("Release output: " + repeatfunc("I want to go to to the zoo"));
        System.out.println("======================================================================");
        //Case 2:
        System.out.println("Case 2: I want to go to to to the zoo");
        System.out.println("Expect out : I want to go REPEAT the zoo ");
        System.out.println("Release output: " + repeatfunc("I want to go to to to  the zoo"));
        System.out.println("======================================================================");
        //Case 3: 
        System.out.println("Case 3: I I  want to go to the zoo ");
        System.out.println("Expect out : REPEAT want to go to the zoo ");
        System.out.println("Release output: " + repeatfunc("I I  want to go to the zoo"));
        System.out.println("======================================================================");
        //Case 4: 
        System.out.println("Case 4: I want to go to the zoo zoo zoo");
        System.out.println("Expect output : I want to go REPEAT the zoo ");
        System.out.println("Release output: " + repeatfunc("I I  want to go to the zoo"));
        System.out.println("======================================================================");
        //Case 5: 
        System.out.println("Case 5: I want to go GO to the zoo ");
        System.out.println("Expect output : I want to  REPEAT to the zoo ");
        System.out.println("Release output: " + repeatfunc("I want to go GO to the zoo "));
        System.out.println("======================================================================");
        //Case 6: 
        System.out.println("Case 6: Input : "); 
        String s = inp.nextLine(); 
        System.out.println(repeatfunc(s));
        


    }
}
