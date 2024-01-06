package org.example;
abstract class BaseConverter {
    protected double temperature;

    public BaseConverter(double temperature) {
        this.temperature = temperature;
    }

    public abstract double convert();
}

class CelsiusToFahrenheit extends BaseConverter {
    public CelsiusToFahrenheit(double temperature) {
        super(temperature);
    }

    public double convert() {
        return (temperature * 9/5) + 32;
    }
}

class CelsiusToKelvin extends BaseConverter {
    public CelsiusToKelvin(double temperature) {
        super(temperature);
    }

    public double convert() {
        return temperature + 273.15;
    }
}

