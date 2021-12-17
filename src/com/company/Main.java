package com.company;

import com.company.model.Guitar;
import com.company.model.GuitarBuilder;

public class Main {

    public static void main(String[] args) {
	// write your code here
       final Guitar guitar1 = new GuitarBuilder()
               .manufacturer("Fender")
               .model("Stratocaster")
               .type("Electric")
               .numberOfStrings(6)
               .build();

        final Guitar guitar2 = new GuitarBuilder()
                .manufacturer("Gibson")
                .model("Thunderbird")
                .type("Electric bass")
                .numberOfStrings(4)
                .build();
    }
}