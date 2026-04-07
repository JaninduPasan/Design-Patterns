package org.example.Adapter.Example;

/**
 * The web client normally returns an object back to the client
 * **/

public class WebClient {

    private WebRequester webRequester;

    public WebClient (WebRequester webRequester) {
        this.webRequester = webRequester;
    }

    private Object makeObject() {
        return null;
    }

    public void doWork() {
        Object object = makeObject();
        int status = webRequester.request(object);

        if (status == 200) {
            System.out.println("OK");
        }  else {
            System.out.println("NOT OK");
        }
        return;
    }
}
