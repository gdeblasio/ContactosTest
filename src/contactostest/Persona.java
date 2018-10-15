package contactostest;

public class Persona implements Component {
    private final String nombrePersona;
    private final long telefono;

    public Persona(String nombre, long telefono) {
        this.nombrePersona = nombre;
        this.telefono = telefono;
    }

    public String getName() {
        return nombrePersona;
    }

    public long getTelefono() {
        return telefono;
    }
    
    @Override
    public void mensaje(String texto) {
        System.out.println("MENSAJE A: " + nombrePersona + "(" + telefono + ")");
        System.out.println(texto);
    }
}
