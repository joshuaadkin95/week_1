package com.joshuaadkin.week_1;

public class Main {

    public static void main(String[] args) {

        String cityName = "Columbus";
        int cityZip = 43209;

        int[] weekTemps = {10,20,30,40,50,60,70};

        int highestTemp=0, avgTemp =0;

        for(int index = 0; index < weekTemps.length; index+=1) //loops through the week's length to find the highest temp & create the sum
        {
            if (weekTemps[index] > highestTemp)
                highestTemp = weekTemps[index]; //redefines the highest temp if the current index is the new highest

            avgTemp += weekTemps[index]; //adds to sum of temps for the later average
        }

        System.out.print(cityName + " " + cityZip + " has the highest temperature this week of " + highestTemp);
        System.out.println(" degrees with an average temperature of " + avgTemp/weekTemps.length + " degrees.");
        }

    }

