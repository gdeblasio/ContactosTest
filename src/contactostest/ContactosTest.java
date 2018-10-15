package contactostest;

public class ContactosTest {

    public static void main(String[] args) {
        Persona p0 = new Persona("Pepe", 666000000);
        Persona p1 = new Persona("Rosa", 666111222);
        Persona p2 = new Persona("Sara", 666333444);
        Persona p3 = new Persona("Rita", 666555666);
        String texto = "Fiesta en mi casa este viernes!";
        
        Grupo infancia = new Grupo("Infancia");
        Grupo salesianos = new Grupo("Salesianos");
        infancia.add(p1);
        salesianos.add(p2);
        salesianos.add(p3);
        infancia.add(salesianos);
        
        p0.mensaje(texto);
        infancia.mensaje(texto);
    }
    
}
