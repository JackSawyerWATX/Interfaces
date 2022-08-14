class PointGuard implements BallHandler {
    
    String name;

    PointGuard(String name) {
        this.name = name;
    }

    // methid from BallHandler interface
    public void dribbleBall() {
        System.out.println(name + " dribbles behind back, between legs, crosses over, and blows past defender!");
    }
}
