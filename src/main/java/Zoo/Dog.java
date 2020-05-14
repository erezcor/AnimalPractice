package Zoo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dog extends Animal {
    @Override
    public void printYourName() {
        log.info("Dog");
    }

    @Override
    public void printYourSound() {
        log.info("How");
    }
}
