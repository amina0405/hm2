package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(ageTemperature(25,16));
        System.out.println(ageTemperature(48,28));
        System.out.println(ageTemperature(13, 15));
        System.out.println(ageTemperature(60,30));
        System.out.println(ageTemperature(37,20));
        System.out.println(generateRandomAge()+ageTemperature(generateRandomAge(),26));


    }

    public static String ageTemperature(int age, int temperature) {
        String rec = "можно идти гулять";
        String rec2 = "Оставайтесь дома";

        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return rec;
        }
        if (age <= 20 && temperature >= 0 && temperature <= 28) {
            return rec;
        }
        if (age >= 45 && temperature >= -10 && temperature <= 25) {
            return rec;
        } else return rec2;

    }
    public static int generateRandomAge(){
        Random random = new Random();

        int ageOfPerson = random.nextInt(50); //возраст человека
        return  ageOfPerson;

    }
}

    }


}