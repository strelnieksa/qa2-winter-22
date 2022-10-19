package homework10Objects;

public class PhotoFrame {

    private float width;
    private float height;
    private float depth;
    private boolean isPictureInFrame;
    private boolean isStand = true;

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

    public boolean isPictureInFrame() {
        return isPictureInFrame;
    }

    public void setPictureInFrame(boolean pictureInFrame) {
        isPictureInFrame = pictureInFrame;
    }

    public boolean isStand() {
        return isStand;
    }

    public void setStand(boolean stand) {
        isStand = stand;
    }
}
