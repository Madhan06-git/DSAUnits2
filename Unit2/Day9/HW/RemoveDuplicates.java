package Daynine;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String args[]) {
         String[] AllBirds={"parrot","eagle","crow","lovebird","pigeon","peacock","myna","parrot"};
         System.out.println(Arrays.toString(AllBirds));
        Set<String> hs=new HashSet<>();
        for(String temp:AllBirds){
            hs.add(temp);
        }
        System.out.println(hs);
    }

}
