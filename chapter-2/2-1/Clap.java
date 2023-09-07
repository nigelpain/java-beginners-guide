/*
    Extra Challenge 2-1
    This program calculates the distance an object is away
    by measuring the time it take for the echo of a clap to be heard
 */
class Clap {
    public static void main(String[] args) {
        double clapTime;
        double speedOfSound;
        double dist;

        clapTime = 4.3;
        speedOfSound = 1100;

        dist = (clapTime / 2) * speedOfSound;

        System.out.println("The object is " + dist + " feet away.");
    }
}