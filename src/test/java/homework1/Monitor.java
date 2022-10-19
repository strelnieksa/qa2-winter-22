package homework1;

public class Monitor {

    private float width;
    private float height;
    private float depth;
    private String color;
    private String resolution;
    private int pixelsHorizontally;
    private int pixelsVertically;
    private String manufacturer;
    private boolean isWarranty;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPixelsHorizontally() {
        return pixelsHorizontally;
    }

    public void setPixelsHorizontally(int pixelsHorizontally) {
        this.pixelsHorizontally = pixelsHorizontally;
    }

    public int getPixelsVertically() {
        return pixelsVertically;
    }

    public void setPixelsVertically(int pixelsVertically) {
        this.pixelsVertically = pixelsVertically;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isWarranty() {
        return isWarranty;
    }

    public void setWarranty(boolean warranty) {
        isWarranty = warranty;
    }
}
