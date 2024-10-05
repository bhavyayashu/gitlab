class Car1 {
    private String modelName;
    private String owner;
    private int regNumber;

    public Car1(String modelName,String owner,int regNumber) {
        this.modelName = modelName;
        this.owner = owner;
        this.regNumber = regNumber;
    }

        //declaration public methods
        public void startEngine(){
            System.out.println("car be started..");
        }
        public void accelerate(){
            System.out.println("car can be accelerated..");
        }
        public void stop(){
            System.out.println("car can be stopped..");
        }

        //print the attributes
        public void showCarInformation(){
            System.out.println("the car is owned by " + owner);
            System.out.println("the car model is " + modelName);
            System.out.println("the regular is " + regNumber);
        }
        //main method
        public static void main(String[] var0) {
            Car1 myCar = new Car1("Suzuki","rohan",1234);
            myCar.startEngine();
            myCar.accelerate();
            myCar.stop();

            myCar.showCarInformation();
            
        }
    
}
