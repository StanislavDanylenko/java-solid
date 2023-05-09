package stanislav.danylenko.solid.dependencyinversion.good;

public interface HttpRequest {

    void get(String url);

    void post(String url);
}
