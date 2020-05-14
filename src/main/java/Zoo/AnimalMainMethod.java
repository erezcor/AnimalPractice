package Zoo;

import Exceptions.ZooException;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static Utils.StringUtils.scanWordStringsFromTextFile;
import static Zoo.AnimalFactory.getAnimal;

@Slf4j
public class AnimalMainMethod {
    public static void main(String[] args) throws IOException {
        Scanner inputScanner = new Scanner(System.in);
        String fileName;
        List<String> animalNames;

        log.info("Enter the file name of animal names:");
        fileName = inputScanner.nextLine();
        log.debug("fileName input: '{}'", fileName);

        animalNames = scanWordStringsFromTextFile(fileName);

        for (String animalName : animalNames) {
            try {
                Animal animal = getAnimal(animalName);
                animal.printYourName();
                animal.printYourSound();
            }
            catch (ZooException zooException) {
                log.error("Error during animal printing loop", zooException);
            }
        }
    }
}