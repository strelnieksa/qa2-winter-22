package homework1;

public class PowerSocket {

    private float width;
    private float height;
    private float depth;
    private float cableLength;
    private int sockets;
    private int usbPlugs;
    private String plugType;
    private String color;

    //---------------GETTERS/SETTERS----------------


    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getCableLength() {
        return cableLength;
    }

    public void setCableLength(float cableLength) {
        this.cableLength = cableLength;
    }

    public int getSockets() {
        return sockets;
    }

    public void setSockets(int sockets) {
        this.sockets = sockets;
    }

    public int getUsbPlugs() {
        return usbPlugs;
    }

    public void setUsbPlugs(int usbPlugs) {
        this.usbPlugs = usbPlugs;
    }

    public String getPlugType() {
        return plugType;
    }

    public void setPlugType(String plugType) {
        this.plugType = plugType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
