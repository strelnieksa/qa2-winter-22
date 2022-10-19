package homework10Objects;

public class ComputerDesk {

   private double width;
   private double height;
   private double depth;
   private String color;
   private String countryOfOrigin;
   private int shelves;
   private int drawers;

   //---------------GETTERS/SETTERS----------------


   public double getWidth() {
      return width;
   }

   public void setWidth(double width) {
      this.width = width;
   }

   public double getHeight() {
      return height;
   }

   public void setHeight(double height) {
      this.height = height;
   }

   public double getDepth() {
      return depth;
   }

   public void setDepth(double depth) {
      this.depth = depth;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public String getCountryOfOrigin() {
      return countryOfOrigin;
   }

   public void setCountryOfOrigin(String countryOfOrigin) {
      this.countryOfOrigin = countryOfOrigin;
   }

   public int getShelves() {
      return shelves;
   }

   public void setShelves(int shelves) {
      this.shelves = shelves;
   }

   public int getDrawers() {
      return drawers;
   }

   public void setDrawers(int drawers) {
      this.drawers = drawers;
   }
}
