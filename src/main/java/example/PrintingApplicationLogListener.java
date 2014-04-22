package example;

import org.cloudfoundry.client.lib.ApplicationLogListener;

public class PrintingApplicationLogListener implements ApplicationLogListener {

    @Override
    public void onMessage(ApplicationLog log) {
        System.out.println(log);
    }

    @Override
    public void onError(Throwable exception) {
       System.err.println("Error: " + exception);
    }

    @Override
    public void onComplete() {
        System.out.println("Logging completed");
    }

}
