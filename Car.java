public class Car {
    //public void Display(String name){
    //    System.out.println("Name: " + name);
    //}
    //public static int square(int number){
    //    return number * number;
    //}

    String brand;
    int year;

    //constructor
    public Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    public void DisplayCarInfo(){
        System.out.println("car brand: " + brand);
        System.out.println("manufacture: " + year);
    }
    public static void main(String[] args) {
        //InstanceMethod a = new InstanceMethod();
        //a.Display("hi");
        //int result = InstanceMethod1.square(5);
        //System.out.println("square of 5 is : " + result);
        Car myCar = new Car("BMW",1995);
        myCar.DisplayCarInfo();
    }
}