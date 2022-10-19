package homework10Objects;

import org.junit.jupiter.api.Test;

public class AllMyObjectsTest {
    @Test
    public void workingWithAllMyObjectsInHomework() {
        BluetoothSpeaker firstBluetoothSpeaker = new BluetoothSpeaker();

        firstBluetoothSpeaker.setBrand("Energy Sistem");
        firstBluetoothSpeaker.setDepth(6.03f);
        firstBluetoothSpeaker.setHeight(5.67f);
        firstBluetoothSpeaker.setWidth(20.00f);
        firstBluetoothSpeaker.setSpeakers(2);
        firstBluetoothSpeaker.setPower("20W");
        firstBluetoothSpeaker.setType("Portable");
        firstBluetoothSpeaker.setSound("2.0 Stereo");
        firstBluetoothSpeaker.setModel("Music Box 5");
        firstBluetoothSpeaker.setConnectivity("Bluetooth Technology 4.1, 3.5 mm audio-in");
        firstBluetoothSpeaker.setExtra("Hands-free function");
        firstBluetoothSpeaker.setColor("Dark blue");

        BluetoothSpeaker secondBluetoothSpeaker = new BluetoothSpeaker();

        secondBluetoothSpeaker.setBrand("Havit");
        secondBluetoothSpeaker.setDepth(5.43f);
        secondBluetoothSpeaker.setHeight(6.98f);
        secondBluetoothSpeaker.setWidth(5.43f);
        secondBluetoothSpeaker.setSpeakers(1);
        secondBluetoothSpeaker.setPower("5");
        secondBluetoothSpeaker.setType("Portable");
        secondBluetoothSpeaker.setSound("Mono");
        secondBluetoothSpeaker.setModel("BK345");
        secondBluetoothSpeaker.setConnectivity("Bluetooth");
        secondBluetoothSpeaker.setExtra("Splash-proof");
        secondBluetoothSpeaker.setColor("Black");

        System.out.println("Bluetooth Speakers");
        System.out.println();
        System.out.println("Brand: " + firstBluetoothSpeaker.getBrand());
        System.out.println("Depth: " + firstBluetoothSpeaker.getDepth());
        System.out.println("Height: " + firstBluetoothSpeaker.getHeight());
        System.out.println("Width: " + firstBluetoothSpeaker.getWidth());
        System.out.println("Speakers: " + firstBluetoothSpeaker.getSpeakers());
        System.out.println("Power: " + firstBluetoothSpeaker.getPower());
        System.out.println("Type: " + firstBluetoothSpeaker.getType());
        System.out.println("Sound: " + firstBluetoothSpeaker.getSound());
        System.out.println("Model: " + firstBluetoothSpeaker.getModel());
        System.out.println("Extra: " + firstBluetoothSpeaker.getExtra());
        System.out.println("Color: " + firstBluetoothSpeaker.getColor());

        System.out.println();
        System.out.println("Brand: " + secondBluetoothSpeaker.getBrand());
        System.out.println("Depth: " + secondBluetoothSpeaker.getDepth());
        System.out.println("Height: " + secondBluetoothSpeaker.getHeight());
        System.out.println("Width: " + secondBluetoothSpeaker.getWidth());
        System.out.println("Speakers: " + secondBluetoothSpeaker.getSpeakers());
        System.out.println("Power: " + secondBluetoothSpeaker.getPower());
        System.out.println("Type: " + secondBluetoothSpeaker.getType());
        System.out.println("Sound: " + secondBluetoothSpeaker.getSound());
        System.out.println("Model: " + secondBluetoothSpeaker.getModel());
        System.out.println("Extra: " + secondBluetoothSpeaker.getExtra());
        System.out.println("Color: " + secondBluetoothSpeaker.getColor());

        BoxWithFlashDrives boxWithFlashDrives = new BoxWithFlashDrives();

        boxWithFlashDrives.setBoxDepth(15.45f);
        boxWithFlashDrives.setBoxHeight(9.32f);
        boxWithFlashDrives.setBoxWidth(14.96f);
        boxWithFlashDrives.setFlashDrivesInside(5);
        boxWithFlashDrives.setFlashDriveSizes("32GB, 128GB, 250GB");
        boxWithFlashDrives.setFlashDriveManufacters("Patriot, Samsung, Sandisk");

        System.out.println();
        System.out.println("Box with flashdrives");
        System.out.println();
        System.out.println("Box Depth: " + boxWithFlashDrives.getBoxDepth());
        System.out.println("Box Height: " + boxWithFlashDrives.getBoxHeight());
        System.out.println("Box Width: " + boxWithFlashDrives.getBoxWidth());
        System.out.println("Flash Drives Inside: " + boxWithFlashDrives.getFlashDrivesInside());
        System.out.println("Flash Drive Sizes: " + boxWithFlashDrives.getFlashDriveSizes());
        System.out.println("Flash Drive Manufacters: " + boxWithFlashDrives.getFlashDriveManufacters());

        ComputerDesk desk = new ComputerDesk();

        desk.setHeight(182.00);
        desk.setWidth(205.36);
        desk.setDepth(70.38);
        desk.setColor("Dark brown");
        desk.setDrawers(4);
        desk.setShelves(12);
        desk.setCountryOfOrigin("Poland");

        System.out.println();
        System.out.println("Computer desk");
        System.out.println();
        System.out.println("Depth: " + desk.getDepth());
        System.out.println("Height: " + desk.getHeight());
        System.out.println("Width: " + desk.getWidth());
        System.out.println("Drawers: " + desk.getDrawers());
        System.out.println("Shelves: " + desk.getShelves());
        System.out.println("Country Of Origin: " + desk.getCountryOfOrigin());

        DeskLamp simpleLamp = new DeskLamp();

        simpleLamp.setWidth(23.54f);
        simpleLamp.setHeight(24.65f);
        simpleLamp.setDepth(15.98f);
        simpleLamp.setColor("Red");
        simpleLamp.setBulbType("E27");
        simpleLamp.setDimmingOption(false);

        System.out.println();
        System.out.println("Desk lamp");
        System.out.println();
        System.out.println("width: " + simpleLamp.getWidth());
        System.out.println("height: " + simpleLamp.getHeight());
        System.out.println("depth: " + simpleLamp.getDepth());
        System.out.println("color: " + simpleLamp.getColor());
        System.out.println("bulbType: " + simpleLamp.getBulbType());

        EliteDesk800G2DesktopMiniPC computer = new EliteDesk800G2DesktopMiniPC();

        computer.setHeight(2.32f);
        computer.setWidth(18.65f);
        computer.setDepth(16.56f);
        computer.setWeight(1.30f);
        computer.setColor("Black");
        computer.setManufacter("HP");

        System.out.println();
        System.out.println("Elite Desk 800 G2 Mini PC");
        System.out.println();
        System.out.println("height: " + computer.getHeight() + " cm");
        System.out.println("width: " + computer.getWidth() + " cm");
        System.out.println("depth: " + computer.getDepth() + " cm");
        System.out.println("weight: " + computer.getWeight());
        System.out.println("color: " + computer.getColor());
        System.out.println("Manufacter: " + computer.getManufacter());

        Keyboard mainkeyboard = new Keyboard();

        mainkeyboard.setWidth(40.45f);
        mainkeyboard.setHeight(3.85f);
        mainkeyboard.setDepth(12.23f);
        mainkeyboard.setTouchpad(false);
        mainkeyboard.setColor("Brand");
        mainkeyboard.setKeyboardLayout("QWERTY");
        mainkeyboard.setBrand("logitech");
        mainkeyboard.setModel("K295");

        System.out.println();
        System.out.println("Keyboard");
        System.out.println();
        System.out.println("width: " + mainkeyboard.getWidth());
        System.out.println("height: " + mainkeyboard.getHeight());
        System.out.println("depth: " + mainkeyboard.getHeight());
        System.out.println("color: " + mainkeyboard.getColor());
        System.out.println("keyboardLayout: " + mainkeyboard.getKeyboardLayout());
        System.out.println("brand: " + mainkeyboard.getBrand());
        System.out.println("model: " + mainkeyboard.getModel());

        Monitor desktopMonitor = new Monitor();

        desktopMonitor.setWidth(65.50f);
        desktopMonitor.setHeight(42.32f);
        desktopMonitor.setDepth(21.20f);
        desktopMonitor.setColor("Black");
        desktopMonitor.setResolution("3480x2160");
        desktopMonitor.setPixelsHorizontally(3480);
        desktopMonitor.setPixelsVertically(2160);
        desktopMonitor.setManufacturer("Hannspree");

        System.out.println();
        System.out.println("Monitor");
        System.out.println();
        System.out.println("width: " + desktopMonitor.getWidth());
        System.out.println("height: " + desktopMonitor.getHeight());
        System.out.println("depth: " + desktopMonitor.getDepth());
        System.out.println("color: " + desktopMonitor.getColor());
        System.out.println("resolution: " + desktopMonitor.getResolution());
        System.out.println("pixels horizontally: " + desktopMonitor.getPixelsHorizontally());
        System.out.println("pixels vertically: " + desktopMonitor.getPixelsVertically());
        System.out.println("manufacturer: " + desktopMonitor.getManufacturer());

        PhotoFrame glassFrame = new PhotoFrame();

        glassFrame.setHeight(22.30f);
        glassFrame.setWidth(13.32f);
        glassFrame.setDepth(1.25f);

        System.out.println();
        System.out.println("Photo frame");
        System.out.println();
        System.out.println("width: " + glassFrame.getWidth());
        System.out.println("height: " + glassFrame.getHeight());
        System.out.println("depth: " + glassFrame.getDepth());

        PowerSocket whitePS = new PowerSocket();

        whitePS.setWidth(34.54f);
        whitePS.setHeight(3.54f);
        whitePS.setDepth(6.12f);
        whitePS.setCableLength(3.00f);
        whitePS.setSockets(5);
        whitePS.setUsbPlugs(0);
        whitePS.setPlugType("EU");
        whitePS.setColor("White");

        System.out.println();
        System.out.println("Power Socket");
        System.out.println();
        System.out.println("width: " + whitePS.getWidth());
        System.out.println("height: " + whitePS.getHeight());
        System.out.println("depth: " + whitePS.getDepth());
        System.out.println("cableLength: " + whitePS.getCableLength());
        System.out.println("sockets: " + whitePS.getSockets());
        System.out.println("usbPlugs: " + whitePS.getUsbPlugs());
        System.out.println("plugType: " + whitePS.getPlugType());
        System.out.println("color: " + whitePS.getColor());

        WirelessMouse m220Mouse = new WirelessMouse();

        WirelessMouse m190Mouse = new WirelessMouse();

        m220Mouse.setBrand("Logitech");
        m220Mouse.setModel("M220");
        m220Mouse.setWidth(66.00f);
        m220Mouse.setHeight(99.00f);
        m220Mouse.setDepth(39.00f);
        m220Mouse.setColor("Dark grey");

        m190Mouse.setBrand("Logitech");
        m190Mouse.setModel("M190");
        m190Mouse.setWidth(76.00f);
        m190Mouse.setHeight(123.00f);
        m190Mouse.setDepth(50.00f);
        m190Mouse.setColor("Dark blue black");

        System.out.println();
        System.out.println("Wireless mouse");
        System.out.println();
        System.out.println("Brand: " + m220Mouse.getBrand());
        System.out.println("Model: " + m220Mouse.getModel());
        System.out.println("Width: " + m220Mouse.getWidth());
        System.out.println("Heigh: " + m220Mouse.getHeight());
        System.out.println("Depth: " + m220Mouse.getDepth());
        System.out.println("Color: " + m220Mouse.getColor());
        System.out.println();
        System.out.println("Brand: " + m190Mouse.getBrand());
        System.out.println("Model: " + m190Mouse.getModel());
        System.out.println("Width: " + m190Mouse.getWidth());
        System.out.println("Heigh: " + m190Mouse.getHeight());
        System.out.println("Depth: " + m190Mouse.getDepth());
        System.out.println("Color: " + m190Mouse.getColor());


    }
}
