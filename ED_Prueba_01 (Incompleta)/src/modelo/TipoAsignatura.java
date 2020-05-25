package modelo;

public enum TipoAsignatura {
    BASICA("Biología","1Q2W3E"),
    INTERMEDIA("Matemática", "E3R4T5"),
    AVANZADA("Historia", "8I7U6Y");

    public String nombre;
    public String codigo;

    TipoAsignatura(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }




}
