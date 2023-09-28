public class Hechizo {
    private String nombre;
    private int costoMana;
    private int poder;

    public Hechizo(String nombre, int costoMana, int poder) {
        this.nombre = nombre;
        this.costoMana = costoMana;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCostoMana() {
        return costoMana;
    }

    public int getPoder() {
        return poder;
    }
}
