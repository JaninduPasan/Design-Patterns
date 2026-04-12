package Learnings.CreationalAndStructural.Adapter.Example;

public class WebService {

    public WebService(String webHost) {
        System.out.println("Web service created: " + webHost);
    }

    public Json request(Json result) {
        System.out.println("request: " + result);
        return null;
    }
}
