/*
    The Moons gravity is about 17 percent that of Earths, write a program
    to calculate your effective weight on the Moon.
 */
class MoonWeight {
    public static void main(String[] args) {
        double earthWeight;
        double moonWeight;

        earthWeight = 82.5;
        moonWeight = earthWeight * 0.17;

        System.out.println("Your weight of " + earthWeight + "kg on Earth would effectively be "
                + moonWeight + "kg on the Moon!");
    }
}