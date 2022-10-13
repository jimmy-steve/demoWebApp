package modeles.module;

public class Temperature {


    private double celcsius;
    private double fahr;

    public Temperature() {
    }

    public Temperature(double celcsius, double fahr) {
        this.celcsius = celcsius;
        this.fahr = fahr;
    }

    public double getCelcsius() {
        return celcsius;
    }

    public void setCelcsius(double celcsius) {
        this.celcsius = celcsius;
    }

    public double getFahr() {
        return fahr;
    }

    public void setFahr(double fahr) {
        this.fahr = fahr;
    }

    @Override
    public String toString() {
        return "Temperature{" + "celcsius=" + celcsius + ", fahr=" + fahr + '}';
    }

    // Fahrenheit to Celcius
    public double Fahrenheit_to_Celcius(double Fahrenheit){
        double Celcius = (Fahrenheit - 32) * 5/9;
        return Celcius;
    }


    // Celcius to Fahrenheit
    public double Celcius_to_Fahrenheit(double Celcius){
        double Fahrenheit = (Celcius * 9/5) + 32;
        return Fahrenheit;
    }
}
