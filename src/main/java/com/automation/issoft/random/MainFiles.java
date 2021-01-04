package com.automation.issoft.random;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MainFiles {



    public static void main(String[] args) throws IOException {

        ReadFromFile readFromFile = new ReadFromFile();
//        String[] tempArray;
        Map<String, Integer> calcResults = new HashMap<>();
        List<String> wordsArray = new ArrayList<String>();

        String sourceFile = "C:\\Users\\Mitiayka\\IdeaProjects\\qa_automation\\src\\main\\resources\\RandomText";
        String content = new String(Files.readAllBytes(Paths.get(sourceFile)));
//        System.out.println(content);
        readFromFile.removeSpecials(content);
//        System.out.println(content);

        String splitString[] = content.split("\\s+");
        wordsArray = Arrays.asList(splitString);

        System.out.println(wordsArray.get(1));


//        System.out.println(splitString[1]);
//        wordsArray = Arrays.asList(splitString);




        ArrayList<String> content2 = new ArrayList<>(Files.readAllLines(Paths.get(sourceFile)));






    }
}


//    String[] words = content.split("\\s");