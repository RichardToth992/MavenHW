package com.progmatic.mvt;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

public class App {

    public String getRandomText(){
        return UUID.randomUUID().toString();
    }

    public static void main(String[] args) throws InterruptedException {
        App app = new App();
        int i = 10;
        while (i > 0){
            i--;
            System.out.println(StringUtils.center(app.getRandomText(), 50, "*"));
            Thread.sleep(1000);
        }
    }
}
