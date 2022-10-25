package com.example.functional_programming;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String text = "Nun, sehen Sie wohl, Fürst: Genua und Lucca sind weiter nichts mehr " +
                "als Apanagen der Familie Bonaparte. Nein, das erkläre ich Ihnen auf das bestimmteste:" +
                " wenn Sie mir nicht sagen, daß der Krieg eine Notwendigkeit ist, wenn Sie sich noch länger" +
                " erlauben, all die Schändlichkeiten und Gewalttaten dieses";

        Function<String, List<String>> makeDictionary = s -> Arrays.stream(s.split(" "))
                .map(m -> m.replaceAll(",", ""))
                .sorted(String::compareToIgnoreCase)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(makeDictionary.apply(text));



    }
}
