package dev.secondsun.dashiell;

import picocli.CommandLine.Command;

@Command(name="build", description = "Builds your site using dashiell")
public class DashiellBuild implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello Build!");
    }

}
