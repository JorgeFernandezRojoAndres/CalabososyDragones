import java.util.ArrayList;
import java.util.List;

public class Raza {
    private String nombre;
    private int fuerza;
    private int agilidad;
    private int resistencia;

    public Raza(String nombre, int fuerza, int agilidad, int resistencia) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.resistencia = resistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public int getResistencia() {
        return resistencia;
    }

    // Define algunas razas predefinidas
    public static List<Raza> getRazasDisponibles() {
        List<Raza> razas = new ArrayList<>();
        razas.add(new Raza("Humano", 10, 5, 8));
        razas.add(new Raza("Elfo", 8, 10, 6));
        razas.add(new Raza("Enano", 12, 4, 10));
        // Agrega más razas según tus necesidades
        return razas;
    }
}
