package StarHomeWork;

import org.junit.jupiter.api.Test;

public class StarResult {
    @Test
    public void workingWithStarredHomeWork() {

        Transport car = new Transport();

        car.setTypeOfTransport("Car");
        car.setFuelTankCapacity(52.00);
        car.setFuelConsumptionOn100km(8.20);

        Transport train = new Transport();

        train.setTypeOfTransport("Train");
        train.setFuelTankCapacity(5300);
        train.setFuelConsumptionOn100km(94.16);

        Transport plane = new Transport();

        plane.setTypeOfTransport("Plane");
        plane.setFuelTankCapacity(26020);
        plane.setFuelConsumptionOn100km(415.41);

        Route riga = new Route();

        Route sigulda = new Route();

        Route berlin = new Route();

        Route madrid = new Route();

        riga.setStartPoint("Riga");
        sigulda.setEndPoint("Sigulda");
        berlin.setEndPoint("Berlin");
        madrid.setEndPoint("Madrid");

        Route rigaSigulda = new Route();
        Route rigaBerlin = new Route();
        Route rigaMadrid = new Route();

        rigaSigulda.setDistance(65.05);
        rigaBerlin.setDistance(1249.00);
        rigaMadrid.setDistance(6000);

        double aRoute = rigaSigulda.getDistance();
        double bRoute = rigaBerlin.getDistance();
        double cRoute = rigaMadrid.getDistance();

        double carKm = car.getFuelTankCapacity() / car.getFuelConsumptionOn100km() * 100;
        double trainKm = train.getFuelTankCapacity() / train.getFuelConsumptionOn100km() * 100;
        double plainKm = plane.getFuelTankCapacity() / plane.getFuelConsumptionOn100km() * 100;


        System.out.println("Car");
        if (carKm <= aRoute) {
            System.out.println(riga.getStartPoint() + " to " + sigulda.getEndPoint() + " Not enough fuel to take a ride");
        } else {
            System.out.println(riga.getStartPoint() + " to " + sigulda.getEndPoint() + " Enjoy Your journey!");
        }

        if (carKm <= bRoute) {
            System.out.println(riga.getStartPoint() + " to " + berlin.getEndPoint() + " Not enough fuel to take a ride");
        } else {
            System.out.println(riga.getStartPoint() + " to " + berlin.getEndPoint() + " Enjoy Your journey!");
        }

        if (carKm <= cRoute) {
            System.out.println(riga.getStartPoint() + " to " + madrid.getEndPoint() + " Not enough fuel to take a ride");
        } else {
            System.out.println(riga.getStartPoint() + " to " + madrid.getEndPoint() + " Enjoy Your journey!");
        }

        System.out.println("Train");
        if (trainKm <= aRoute) {
            System.out.println(riga.getStartPoint() + " to " + sigulda.getEndPoint() + " Not enough fuel to take a ride");
        } else {
            System.out.println(riga.getStartPoint() + " to " + sigulda.getEndPoint() + " Enjoy Your journey!");
        }

        if (trainKm <= bRoute) {
            System.out.println(riga.getStartPoint() + " to " + berlin.getEndPoint() + " Not enough fuel to take a ride");
        } else {
            System.out.println(riga.getStartPoint() + " to " + berlin.getEndPoint() + " Enjoy Your journey!");
        }

        if (trainKm <= cRoute) {
            System.out.println(riga.getStartPoint() + " to " + madrid.getEndPoint() + " Not enough fuel to take a ride");
        } else {
            System.out.println(riga.getStartPoint() + " to " + madrid.getEndPoint() + " Enjoy Your journey!");
        }

        System.out.println("Plane");
        if (plainKm <= aRoute) {
            System.out.println(riga.getStartPoint() + " to " + sigulda.getEndPoint() + " Not enough fuel to take a ride");
        } else {
            System.out.println(riga.getStartPoint() + " to " + sigulda.getEndPoint() + " Enjoy Your journey!");
        }

        if (plainKm <= bRoute) {
            System.out.println(riga.getStartPoint() + " to " + berlin.getEndPoint() + " Not enough fuel to take a ride");
        } else {
            System.out.println(riga.getStartPoint() + " to " + berlin.getEndPoint() + " Enjoy Your journey!");
        }

        if (plainKm <= cRoute) {
            System.out.println(riga.getStartPoint() + " to " + madrid.getEndPoint() + " Not enough fuel to take a ride");
        } else {
            System.out.println(riga.getStartPoint() + " to " + madrid.getEndPoint() + " Enjoy Your journey!");
        }





        System.out.println(carKm);
        System.out.println(trainKm);
        System.out.println(plainKm);
        System.out.println(aRoute);
        System.out.println(bRoute);
        System.out.println(cRoute);

    }

}

