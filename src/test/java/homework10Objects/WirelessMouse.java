package homework10Objects;

public class WirelessMouse {

    private float width;
    private float height;
    private float depth;
    private boolean mouseWheel;
    private boolean isSingleColor;
    private String color;
    private String brand;

    private String model;

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

    public boolean isMouseWheel() {
        return mouseWheel;
    }

    public void setMouseWheel(boolean mouseWheel) {
        this.mouseWheel = mouseWheel;
    }

    public boolean isSingleColor() {
        return isSingleColor;
    }

    public void setSingleColor(boolean singleColor) {
        isSingleColor = singleColor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
