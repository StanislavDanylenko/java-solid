package stanislav.danylenko.solid.dependencyinversion.good.impl;

import stanislav.danylenko.solid.dependencyinversion.good.HttpRequestService;
import stanislav.danylenko.solid.dependencyinversion.good.HttpRequest;

public class HttpRequestImpl implements HttpRequest {

    private final HttpRequestService httpRequestService;

    public HttpRequestImpl(HttpRequestService httpConnection) {
        this.httpRequestService = httpConnection;
    }

    public void get(String url) {
        httpRequestService.execute(url, "GET");
    }

    public void post(String url) {
        httpRequestService.execute(url, "POST");
    }
}
