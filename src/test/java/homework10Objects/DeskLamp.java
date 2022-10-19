package homework10Objects;

public class DeskLamp {

    private float width;
    private float height;
    private float depth;
    private String color;
    private String bulbType;
    private boolean isDimmingOption;

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

    public String getBulbType() {
        return bulbType;
    }

    public void setBulbType(String bulbType) {
        this.bulbType = bulbType;
    }

    public boolean isDimmingOption() {
        return isDimmingOption;
    }

    public void setDimmingOption(boolean dimmingOption) {
        isDimmingOption = dimmingOption;
    }
}
