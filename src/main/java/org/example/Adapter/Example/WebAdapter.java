package org.example.Adapter.Example;

/**
 * Adapter Class
 * Provides the methods that will take the client class's object and convert into a JSON object
 * Convert any instance of a class that the client can create and send that in a request
 * Transfer the translated request to the adapter
 * **/

public class WebAdapter implements WebRequester {
    private WebService service;

    public void connect (WebService service) {
        this.service = service;
    }

    public int request (Object request) {
        Json result = this.toJson(request);
        Json response = service.request(result);
        if (response != null) {
            return 200; // OK status code
        }
        return 500; // Server error status code
    }

    private Json toJson(Object input) {
        return null;
    }
}
