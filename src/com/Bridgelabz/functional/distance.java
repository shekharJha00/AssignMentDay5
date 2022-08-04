package com.Bridgelabz.functional;

import org.jetbrains.annotations.NotNull;

public class distance {

            public static void main(String @NotNull [] args) {

            // parse x- and y-coordinates from command-line arguments
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            // compute distance to (0, 0)
            double dist = Math.sqrt(x * x + y * y);

            // output distance
            System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
        }
    }


