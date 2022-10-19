package StarHomeWork;

public class Transport {

    private String typeOfTransport;
    private double fuelConsumptionOn100km;
    private double fuelTankCapacity;

    public String getTypeOfTransport() {
        return typeOfTransport;
    }

    public void setTypeOfTransport(String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    public double getFuelConsumptionOn100km() {
        return fuelConsumptionOn100km;
    }

    public void setFuelConsumptionOn100km(double fuelConsumptionOn100km) {
        this.fuelConsumptionOn100km = fuelConsumptionOn100km;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }
}
