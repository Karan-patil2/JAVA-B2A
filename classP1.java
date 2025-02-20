public class classP1 {
 public static void main(String[] args) {


  Car car = new Car(); // we have created a object of car here in this file through which we can access the objects of the other file.
  car.setMake("Porsche");
  car.setDoors(2);
  car.setConvertible(true);
  car.setColor("black");
  System.out.println(car.getMake()+  " - car is of  " + car.getColor() + "color");

  car.describeCar();


 }
}