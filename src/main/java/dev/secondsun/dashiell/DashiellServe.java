package dev.secondsun.dashiell;

import picocli.CommandLine.Command;

@Command(name="serve", description = "Serves your site using dashiell")
public class DashiellServe implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello Serve!");
    }

}
