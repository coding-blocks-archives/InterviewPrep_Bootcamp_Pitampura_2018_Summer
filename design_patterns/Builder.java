class Builder {
  
  class Vehicle {
    private int wheels;
    private String color;
    private boolean automatic;
    private Vehicle() {
      
    }
    
    public static class Builder {
      private Vehicle v;
      public Builder() {v = new Vehicle();}
      
      Vehicle.Builder setWheels(int wheels) {
        v.wheels = wheels;
        return this;
      }
      Vehicle.Builder setColor(String color) {
        v.color = color;
        return this;
      }
      Vehicle.Builder setAutomatic(boolean automatic) {
        v.automatic = automatic;
        return this;
      }
      public Vehicle build() {return v;}
      
    }
    
    
  }
  
  public static void main (String[] argv) {
    Vehicle v = new Vehicle.Builder()
      .setWheels(4)
      .setColor("green")
      .setAutomatic(false)
      .build();
  }
}
