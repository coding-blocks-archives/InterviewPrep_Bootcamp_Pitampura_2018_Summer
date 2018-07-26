class Fluent {
  
  class Vehicle {
    int wheels;
    String color;
    boolean automatic;
    
    Vehicle setWheels(int wheels) {
      this.wheels = wheels;
      return this;
    }
    Vehicle setColor(String color) {
      this.color = color;
      return this;
    }
    Vehicle setAutomatic(boolean automatic) {
      this.automatic = automatic;
      return this;
    }
  }
  
  public static void main (String[] argv) {
    Vehicle v = new Vehicle().setWheels(4).setColor("green").setAutomatic(false);
  }
}
