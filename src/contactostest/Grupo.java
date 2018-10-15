package contactostest;

import java.util.ArrayList;
import java.util.List;

public class Grupo implements Component {
    private final String nombreGrupo;
    List<Component> grupo = new ArrayList<>();

    public Grupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    @Override
    public void mensaje(String texto) {
        for (Component c : grupo) {
             System.out.println("MENSAJE A GRUPO: " + nombreGrupo);
             c.mensaje(texto);
        }
    }
    
    public void add(Component component) {
        grupo.add(component);
    }
    
}
