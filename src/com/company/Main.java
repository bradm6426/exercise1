package com.company;

public class Main {

    public static void main(String[] args) {
        String cityName = "New York";
        int zipCode = 43209;
        int[] highTemps = {32,25,27,40,45};
        double average = (highTemps[0] + highTemps[1] + highTemps[2] + highTemps[3]+highTemps[4])/ 5f;
        System.out.println("City:" + cityName);
        System.out.println("zip code:" + zipCode);
        System.out.println("average high:" + average);
    }
}
