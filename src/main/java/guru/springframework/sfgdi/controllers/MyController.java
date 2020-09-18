package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Component;

@Component
public class MyController {

    public String sayHallo() {
        System.out.println("Hello World!");

        return "Hi Folks!";
    }
}
