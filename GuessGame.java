public class GuessGame {
    
    Jugadores jugador1;
    Jugadores jugador2;
    Jugadores jugador3;
    Jugadores jugador4;
    Jugadores jugador5;


    public void startGame() {
        jugador1 = new Jugadores();
        jugador2 = new Jugadores();
        jugador3 = new Jugadores();
        jugador4 = new Jugadores();
        jugador5 = new Jugadores();

        int targetNumber = (int) (Math.random() * 16);
        System.out.println("Estoy pensando en un numero entre 0 y 15...");
        
        boolean ganador = false;

        while (!ganador) {
            System.out.println("El numero a adivinar es: " + targetNumber);

            jugador1.guess();
            jugador2.guess();
            jugador3.guess();
            jugador4.guess();
            jugador5.guess();

            if (jugador1.number == targetNumber) {
                System.out.println("Jugador 1 ha adivinado el numero!");
                ganador = true;
            } if (jugador2.number == targetNumber) {
                System.out.println("Jugador 2 ha adivinado el numero!");
                ganador = true;
            } if (jugador3.number == targetNumber) {
                System.out.println("Jugador 3 ha adivinado el numero!");
                ganador = true;
            } if (jugador4.number == targetNumber) {
                System.out.println("Jugador 4 ha adivinado el numero!");
                ganador = true;
            } if (jugador5.number == targetNumber) {
                System.out.println("Jugador 5 ha adivinado el numero!");
                ganador = true;
            } else {
                System.out.println("Ningun jugador ha adivinado el numero. Intenten de nuevo.");
            }
        }
    }
    
}
