package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Virag> viragok = new ArrayList<>();
        try{
            Scanner sc = new Scanner(new File("virag.txt"));
            int i = 0;
            while(sc.hasNextLine()){
                String[] lineSplit = sc.next().split(">");
                if(i != 0){
                    Virag v = new Virag(lineSplit[0], Integer.parseInt(lineSplit[1]), LocalDate.parse(lineSplit[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                            lineSplit[3], Integer.parseInt(lineSplit[4]));
                    viragok.add(v);
                }
                i++;
            }
        }
        catch (FileNotFoundException e){
            System.out.print(e.getMessage());
        }

        /*for(Virag x : viragok){
            System.out.println(x);
        }*/

        viragok.stream()
                .filter(k -> Objects.equals(k.getBesorolas(), "kozepes") && k.getRaktaronLevoMennyiseg() >= 15)
                .forEach(System.out::println);

        Double atlag = viragok.stream()
                .mapToDouble(k -> k.getAr())
                .average()
                .getAsDouble();
        System.out.println("\n" + atlag);


        Map<String, List<Virag>> myMap = viragok.stream()
                .collect(Collectors.groupingBy(Virag::getBesorolas));

        for(Map.Entry<String, List<Virag>> x : myMap.entrySet()){
            System.out.println(x);
        }
    }
}