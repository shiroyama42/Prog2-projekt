package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) throws IOException {
        ArrayList<Auto> autok = new ArrayList<>();
        String[] line = new String[]{"ABC-123~Croma~Chevrolet~2023/11/20~200",
                                                    "UIM-110~Agile~Chevrolet~2020/10/25~120",
                                                    "KSK-110~Accent~Hyundai~2014/07/10~200",
                                                    "HKL-008~Accelo~Mercedes~2019/05/22~240",
                                                    "SMA-503~ZZZZ~Porsche~2025/02/04~300"};
        for (int i = 0; i < 5; i++){
            String[] lineVals = line[i].split("~");
            Auto a = new Auto(lineVals[0], lineVals[1], lineVals[2],
                    LocalDate.parse(lineVals[3], DateTimeFormatter.ofPattern("yyyy/MM/dd")),
                    Integer.parseInt(lineVals[4]));
            autok.add(a);
        }

        /*for(Auto x : autok){
            System.out.print(x + "\n");
        }*/

        ArrayList<Auto> autoSorted = new ArrayList<>();
        autok.stream()
                .sorted(Comparator.comparing(Auto::getMarka).thenComparing(Auto::getTipus).thenComparing(Auto::getRendszam))
                .collect(Collectors.toCollection(() -> autoSorted));

        try{
            FileWriter writer = new FileWriter("autok.txt");
            for(Auto x : autoSorted){
                writer.write(x + "\n");
                System.out.print(x + "\n");
            }
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

}