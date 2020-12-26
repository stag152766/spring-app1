package ru.alishev.springcourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my init");
    }

    @Override
    public String getSong() {
        return "Hung sing";
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destroy");
    }
}
