package modelo;

public enum TipoEspecialidad {
    BASICA("Biología"),
    INTERMEDIA("Matemática"),
    AVANZADA("Historia");

    public String nombre;

    TipoEspecialidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
