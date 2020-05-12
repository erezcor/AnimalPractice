package Zoo;

import Exceptions.ZooException;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

import static Utils.StringUtils.getTextFileAsString;
import static Utils.StringUtils.splitWordsOfString;

@Slf4j
public class AnimalMainMethod {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        String fileName;
        AnimalFactory animalFactory = new AnimalFactory();

        log.trace("Enter file name of animal names");
        log.info("Enter file name of animal names");
        log.debug("Enter file name of animal names");
        log.error("Enter file name of animal names");
        log.warn("Enter file name of animal names");
        fileName = reader.nextLine();

        Scanner fileScanner = new Scanner(Path.of(fileName));

        String textInFile = getTextFileAsString(fileName);
        List<String> animalNames = splitWordsOfString(textInFile);

        for (String animalName : animalNames) {
            try {
                Animal animal = animalFactory.getAnimal(animalName);
                animal.printYourName();
                animal.printYourSound();
            }
            catch (ZooException zooException) {
                zooException.printStackTrace();
            }
        }
    }
}