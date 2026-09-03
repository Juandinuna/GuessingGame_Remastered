public class Jugadores {
    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 16);
        System.out.println("Mi numero es el:  " + number);

    }
}