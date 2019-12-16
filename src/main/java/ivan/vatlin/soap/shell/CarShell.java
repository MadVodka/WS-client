package ivan.vatlin.soap.shell;

import ivan.vatlin.soap.SoapConnector;
import ivan.vatlin.soap.cars.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.List;

@ShellComponent
public class CarShell {
    private static final String SOAP_URL = "http://localhost:8080/soap";
    private static final Logger LOGGER = LoggerFactory.getLogger(CarShell.class);

    @Autowired
    private SoapConnector soapConnector;

    @ShellMethod(value = "Show cars.")
    public String show(@ShellOption({"-a", "--all"}) String all) {
        CarDetailsRequest carDetailsRequest = new CarDetailsRequest();
        CarDetailsResponse carDetailsResponse = (CarDetailsResponse) soapConnector.callSoapService(SOAP_URL, carDetailsRequest);
        List<Car> cars = carDetailsResponse.getCars();

        LOGGER.info("Response {}", cars);

        StringBuilder stringBuilder = new StringBuilder();
        for (Car car : cars) {
            stringBuilder.append(car).append("\n");
        }

        return stringBuilder.toString();
    }

    @ShellMethod(value = "Search by params: brand, model, yearMade.")
    public String search(@ShellOption({"-p", "--param"}) String param, @ShellOption({"-q", "--query"}) String query) {
        CarDetailsRequest carDetailsRequest = new CarDetailsRequest();
        Search search = new Search();
        search.setBy(SearchBy.fromValue(param));
        search.setValue(query);
        carDetailsRequest.setSearch(search);

        CarDetailsResponse carDetailsResponse = (CarDetailsResponse) soapConnector.callSoapService(SOAP_URL, carDetailsRequest);
        List<Car> cars = carDetailsResponse.getCars();

        LOGGER.info("Response {}", cars);

        StringBuilder stringBuilder = new StringBuilder();
        for (Car car : cars) {
            stringBuilder.append(car).append("\n");
        }

        return stringBuilder.toString();
    }
}
