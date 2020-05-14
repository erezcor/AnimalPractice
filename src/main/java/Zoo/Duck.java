package Zoo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Duck extends Animal {
    @Override
    public void printYourName() {
        log.info("Duck");
    }

    @Override
    public void printYourSound() {
        log.info("Ga ga");
    }
}
