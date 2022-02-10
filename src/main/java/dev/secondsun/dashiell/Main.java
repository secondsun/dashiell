//DEPS dev.secondsun.dashiell:dashiell-main:0.0.1

package dev.secondsun.dashiell;

import java.io.IOException;
import java.util.concurrent.Callable;

import picocli.CommandLine;


@CommandLine.Command(name = "dashiell", mixinStandardHelpOptions = true, version = "dashiell 0.0.1",
		description = "Static site builder with jbang", subcommands = {DashiellServe.class, DashiellBuild.class})
public class Main implements Callable<Integer>	 {
	public static void main(String[] args) throws IOException {
		int exitCode = new CommandLine(new Main()).execute(args);
		System.exit(exitCode);
	}

    @Override
    public Integer call() throws Exception {
        return 0;
    }    
}