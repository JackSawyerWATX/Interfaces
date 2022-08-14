interface BallHandler {
    
    //constant variable. Interfaces are public, static and final by definition.
    //Meaning it can't be changed and it belongs to the interface, therefore the line does NOT need to be written like:
    // public static final String sport = "Basketball";
    // because that exists by default, or it is said to be implicit.

    String sport = "Basketball";

    //concrete methods must be static because the method and variable are part of the interface itself and does not need to be instatiated.
    public static void dropTheBall(){
        System.out.println("The ball bounces a couple of times and rolls out of bounds.");
    }
    //abstract method
    public void dribbleBall();
}
