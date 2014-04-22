package example;

import java.net.URL;

import org.cloudfoundry.client.lib.CloudCredentials;
import org.cloudfoundry.client.lib.CloudFoundryClient;
import org.cloudfoundry.client.lib.StreamingLogToken;

public class Main {

    public static void main(String[] args) throws Exception {
        String email = "";
        String password = "";
        String org = "";
        String space = "development";
        String app = "";
        
        CloudFoundryClient client = 
                new CloudFoundryClient(new CloudCredentials(email, password),
                                       new URL("https://api.run.pivotal.io"), org, space);

        client.login();

        StreamingLogToken token = client.streamRecentLogs(app, new PrintingApplicationLogListener());
        
    }
}
