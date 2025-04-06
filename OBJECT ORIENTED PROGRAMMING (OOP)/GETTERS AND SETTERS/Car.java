public class Car {

    private String make = "tesla" ;
    private  int doors = 2;
    private boolean convertible = true;
    private String color = "red";

    public String getMake() {
        return make;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getColor() {
        return color;
    }


    public void setMake(String make) {
        this.make = make;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void describeCar(){
        System.out.println(doors+ "Door " +color+ "  " +convertible+ "  " +make+ "  " );
    }
}
