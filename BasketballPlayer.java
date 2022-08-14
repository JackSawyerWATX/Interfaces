class BasketballPlayer implements BallHandler, Shooter {

    String name;

    public BasketballPlayer(String name) {
        this.name = name;
    }

    //implementing the BallHandler interface's abstract method. This is required.
    @Override
    public void dribbleBall() {
        System.out.println(name + " dribbles ball off someone's shoe and out of bounds.");
    }

    //Implementing the Shooter interface
    @Override
    public String takeShot(String shot) {
        return "The player hits a " + shot + "! The croud goes wild!!";
    }
}
