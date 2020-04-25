package wooteco.helloworld.core;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;


@Component
public class SpringCoreService {
    private String name;

    public String sayName(String name) throws InterruptedException {
        this.name = name;

        doHeavyWork();

        return "My name is " + this.name;
    }

    private void doHeavyWork() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
    }
}
