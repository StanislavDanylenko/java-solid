package stanislav.danylenko.solid.dependencyinversion.bad;

// top level
// concrete, not abstract
public class HttpRequest {

    private final HttpRequestService httpRequestService;

    public HttpRequest(HttpRequestService httpRequestService) {
        this.httpRequestService = httpRequestService;
    }

    public void get(String url) {
        httpRequestService.execute(url, "GET");
    }

    public void post(String url) {
        httpRequestService.execute(url, "POST");
    }
}
