package org.example;

public class Main {
    public static void main(String[] args) {
        double temperatureInCelsius = 30;

        CelsiusToFahrenheit fahrenheitConverter = new CelsiusToFahrenheit(temperatureInCelsius);
        double fahrenheitTemperature = fahrenheitConverter.convert();
        System.out.println(temperatureInCelsius + " Selsiy " + fahrenheitTemperature + " Farengeyt");

        CelsiusToKelvin kelvinConverter = new CelsiusToKelvin(temperatureInCelsius);
        double kelvinTemperature = kelvinConverter.convert();
        System.out.println(temperatureInCelsius + " Selsiy " + kelvinTemperature + " Farengeyt");
    }
}
