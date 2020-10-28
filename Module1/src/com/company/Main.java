package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        FlyBusinessClass businessPassenger1 = new FlyBusinessClass("Cофія Макидон", "Київ-Лондон", 3200);
        FlyBusinessClass businessPassenger2 = new FlyBusinessClass("Влад Тодорук", "Львів-Тель-Авів", 4500);
        FlyBusinessClass businessPassenger3 = new FlyBusinessClass("Антон Осіпов", "Київ-Бухарест", 2000);

        FlyEconomyClass economyPassenger1 = new FlyEconomyClass("Христина Репецька", "Київ-Вроцлав", 900, 15, 100);
        FlyEconomyClass economyPassenger2 = new FlyEconomyClass("Ілана Супрович", "Львів-Майорка", 1600, 6, 120);
        FlyEconomyClass economyPassenger3 = new FlyEconomyClass("Влад Томік", "Київ-Париж", 1800, 7, 200);

        List<ICost> list = new ArrayList<>();
        list.add(businessPassenger1);
        list.add(businessPassenger2);
        list.add(businessPassenger3);
        list.add(economyPassenger1);
        list.add(economyPassenger2);
        list.add(economyPassenger3);

        for (ICost passenger : list) {
            System.out.println(passenger.toString());
        }

        float totalSum = (float) list.stream().mapToDouble(item -> item.getCost()).sum();
        System.out.println("Загальна вартість білетів - " + totalSum);
        float min = (float) list.stream().mapToDouble(item -> item.getCost()).min().orElse(0);
        System.out.println("Мінімальна вартість білету - " + min);
        float max = (float) list.stream().mapToDouble(item -> item.getCost()).max().orElse(0);
        System.out.println("Максимальна вартість білету - " + max);
        float average = (float) list.stream().mapToDouble(item -> item.getCost()).average().orElse(0);
        System.out.println("Середня вартість білету - " + String.format("%.1f", average));

        List<FlyBusinessClass> businessPassengers = new ArrayList<>();
        list.add(businessPassenger1);
        list.add(businessPassenger2);
        list.add(businessPassenger3);
        float sumB = (float) businessPassengers.stream().mapToDouble(item -> item.getCost()).sum();

        List<FlyEconomyClass> economyPassengers = new ArrayList<>();
        list.add(economyPassenger1);
        list.add(economyPassenger2);
        list.add(economyPassenger3);
        float sumE = (float) economyPassengers.stream().mapToDouble(item -> item.getCost()).sum();

        String whoIsRicher = sumB > sumE ? "Ціна білетів бізнес класу більша за ціну білетів економ класу " : "Ціна білетів економ класу більша за ціну білетів бізнес класу";
        System.out.println(whoIsRicher);

    }

}
