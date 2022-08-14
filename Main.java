public class Main{
    public static void main(String[] args) {

        //Creating BasketballPlayer and PointGuard methods
        BasketballPlayer hakeem = new BasketballPlayer("Hakeem");
        PointGuard kenny = new PointGuard("Kenny");

        //calling the dribbleBall() method implemented from the BallHandler Interface
        kenny.dribbleBall();
        hakeem.dribbleBall();
        //calling the takeShot() method implemented from the Shooter Interface

        System.out.println(hakeem.takeShot("Slam Dunk!"));

        //Printing out the sport variable from the BallHandeler Interface
        System.out.println(BallHandler.sport);

        //Calling the BallHandler Interfaces, concrete method directly from the interface
        BallHandler.dropTheBall();
    }
}
