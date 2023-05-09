package stanislav.danylenko.solid.interfacesegregation.bad;

public interface FatInterface {

    String getValue();
    void printValue();
    void updateValueFromApi();
    void writeValueToDb();
    String findViewToDisplayValue();

}
