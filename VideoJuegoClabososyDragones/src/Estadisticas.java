public class Estadisticas {
    private int salud;
    private int mana;
    private int nivel;
    private Clase clase;
    private Raza raza;
    

    public Estadisticas(int salud, int mana, int nivel, Clase clase, Raza raza) {
        this.salud = salud;
        this.mana = mana;
        this.nivel = nivel;
        this.clase = clase;
        this.raza = raza;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }
}
