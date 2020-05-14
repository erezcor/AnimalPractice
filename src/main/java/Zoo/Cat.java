package Zoo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cat extends Animal {
    @Override
    public void printYourName() {
        log.info("Cat");
    }

    @Override
    public void printYourSound() {
        log.info("Meow");
    }
}
