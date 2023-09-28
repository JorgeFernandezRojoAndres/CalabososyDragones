import java.util.Scanner;

public class GameLoop {
    private Scanner scanner;
    private int playerHealth;
    private int monsterHealth;
    private D20 d20;
    private Estadisticas jugadorStats;

    public GameLoop() {
        scanner = new Scanner(System.in);
        playerHealth = 100;
        monsterHealth = 100;
        d20 = new D20();
    }

    public void start() {
        System.out.println("¡Bienvenido a la aventura de Calabozos y Dragones!");

        // Menú de selección de raza
        System.out.println("Selecciona tu raza:");
        System.out.println("1. Humano");
        System.out.println("2. Elfo");
        System.out.println("3. Enano");
        int razaChoice = scanner.nextInt();

        Raza jugadorRaza = null;

        switch (razaChoice) {
            case 1:
                jugadorRaza = new Raza("Humano", 10, 5, 8);
                break;
            case 2:
                jugadorRaza = new Raza("Elfo", 5, 10, 7);
                break;
            case 3:
                jugadorRaza = new Raza("Enano", 12, 4, 10);
                break;
            default:
                System.out.println("Opción de raza no válida. Seleccionando Humano por defecto.");
                jugadorRaza = new Raza("Humano", 10, 5, 8);
                break;
        }
        // Menú de selección de clase
    System.out.println("Selecciona tu clase:");
    System.out.println("1. Guerrero");
    System.out.println("2. Mago");
    System.out.println("3. Ladrón");
    int claseChoice = scanner.nextInt();

    Clase jugadorClase = null;

    switch (claseChoice) {
        case 1:
            jugadorClase = new Clase("Guerrero");
            break;
        case 2:
            jugadorClase = new Clase("Mago");
            break;
        case 3:
            jugadorClase = new Clase("Ladrón");
            break;
        default:
            System.out.println("Opción de clase no válida. Seleccionando Guerrero por defecto.");
            jugadorClase = new Clase("Guerrero");
            break;
    }

   

        
        jugadorStats = new Estadisticas(100, 50, 1, jugadorClase, jugadorRaza);

        while (playerHealth > 0 && monsterHealth > 0) {
            
            //blucle principal
            System.out.println("\nTu salud: " + jugadorStats.getSalud());
        System.out.println("Mana: " + jugadorStats.getMana());
        System.out.println("Nivel: " + jugadorStats.getNivel());
        System.out.println("Clase: " + jugadorStats.getClase().getNombre());
        System.out.println("Raza: " + jugadorStats.getRaza().getNombre());
        
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Atacar al monstruo");
        System.out.println("2. Huir del combate");
        System.out.println("3. Lanzar hechizo");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                int playerDamage = d20.roll();
                int monsterDamage = d20.roll();

                monsterHealth -= playerDamage;
                jugadorStats.setSalud(jugadorStats.getSalud() - monsterDamage);

                System.out.println("Has infligido " + playerDamage + " puntos de daño al monstruo.");
                System.out.println("El monstruo te ha infligido " + monsterDamage + " puntos de daño.");
                break;
            case 2:
                System.out.println("Huyes del combate.");
                return;
            default:
                System.out.println("Opción no válida. Elige 1 o 2.");
                break;
                case 3:
            // Lanzar hechizo
                  Hechizo hechizo = null; // Inicializa el hechizo como nulo
                  int costoDelHechizo = 0; // Inicializa el costo del hechizo a 0
                  System.out.println("Selecciona un hechizo:");
                  System.out.println("1. Bola de Fuego");
                  System.out.println("2. Tormenta de Nieves");
                  System.out.println("3. Reflejo");
                  System.out.println("4. Invocación de Muertos");
            int hechizoChoice = scanner.nextInt();

    switch (hechizoChoice) {
        case 1:
            hechizo = new Hechizo("Bola de Fuego", 10, 20);
            break;
        case 2:
            hechizo = new Hechizo("Tormenta de Nieves", 12, 15);
            break;
        case 3:
            hechizo = new Hechizo("Reflejo", 8, 10);
            break;
        case 4:
            hechizo = new Hechizo("Invocación de Muertos", 15, 25);
            break;
        default:
            System.out.println("Opción de hechizo no válida. No se ha lanzado ningún hechizo.");
            break;
    }

    if (hechizo != null) {
        if (jugadorStats.getMana() >= hechizo.getCostoMana()) {
            int hechizoDamage = hechizo.getPoder();
            monsterHealth -= hechizoDamage;
            jugadorStats.setMana(jugadorStats.getMana() - hechizo.getCostoMana());
            System.out.println("Has lanzado el hechizo " + hechizo.getNombre() + " y has infligido " + hechizoDamage + " puntos de daño al monstruo.");
        } else {
            System.out.println("No tienes suficiente maná para lanzar este hechizo.");
        }
    }
    break;
        }
    
        }
        

        if (jugadorStats.getSalud() <= 0) {
            System.out.println("Has sido derrotado. ¡Game Over!");
        } else {
            System.out.println("¡Has derrotado al monstruo! ¡Victoria!");
        }
    }
}
