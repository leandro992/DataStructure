package com.company;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {


    public static void main(String[] args) {

        List<Integer> alice = new ArrayList<>();
        List<Integer> bob = new ArrayList<>();

        alice.add(17);
        alice.add(28);
        alice.add(30);

        bob.add(99);
        bob.add(16);
        bob.add(8);

        System.out.println(compareTriplets(alice,bob));
    }

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> response = new ArrayList<>();

        Integer alice = 0, bob = 0;

        for(int i = 0; i <= a.size() -1 ; i++){
            if (a.get(i) > b.get(i)){
                alice++;
            }else if (a.get(i) == a.get(i)){

            } if (a.get(i) < b.get(i)){
                bob++;
            }
        }
        response.add(alice);
        response.add(bob);
        return response;
    }


}
