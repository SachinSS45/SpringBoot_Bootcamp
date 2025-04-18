public interface Car {
    public int noOfWheels(); //public abstract method

    //Default method

    default void engineMake(){
        System.out.println("Get it done from :: TATA");
    }

//    default String toString(){
//        return "Hey default method from interface";
//    } // we can't bring Object class method through default methods



}
