package com.company;

import java.util.ArrayList;
import java.util.List;

public class TailRecursion {

    public static void main() {
        List<FireCracker> fireCrackers = new ArrayList<>();

        for(int i=0; i< 100; i++) {
            String explosion = "b";
            for (int o=0; o<=i;i++){

            }

        }
    }





    static class FireCracker{
        private String explosion;

        public FireCracker(String explosion) {
            this.explosion = explosion;
        }

        public String light(List<FireCracker> fireCrackers) {
            if (fireCrackers.size() == 0) {
                return explosion;
            } else
                return explosion + fireCrackers.get(0).light(fireCrackers);
        }
    }
}
