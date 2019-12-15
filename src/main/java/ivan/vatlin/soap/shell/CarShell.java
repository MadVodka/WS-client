package ivan.vatlin.soap.shell;

import ivan.vatlin.soap.SoapConnector;
import ivan.vatlin.soap.cars.Car;
import ivan.vatlin.soap.cars.CarDetailsRequest;
import ivan.vatlin.soap.cars.CarDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.List;

@ShellComponent
public class CarShell {
    private static final String SOAP_URL = "http://localhost:8080/soap";

    @Autowired
    private SoapConnector soapConnector;

    @ShellMethod(value = "Show cars.")
    public String show(@ShellOption({"-a", "--all"}) String all) {
        CarDetailsRequest carDetailsRequest = new CarDetailsRequest();
        CarDetailsResponse carDetailsResponse = (CarDetailsResponse) soapConnector.callSoapService(SOAP_URL, carDetailsRequest);
        List<Car> cars = carDetailsResponse.getCars();

        StringBuilder stringBuilder = new StringBuilder();
        for (Car car : cars) {
            stringBuilder.append(car).append("\n");
        }

        return stringBuilder.toString();
    }
}
