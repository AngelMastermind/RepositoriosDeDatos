import java.util.HashMap;

public class RepositorioEnMemoria implements IRepositorio {

    private HashMap<String, Object> datos = new HashMap<>();
    private int contador = 1;

    @Override
    public void guardar(Object data) {
        String id = "id" + contador;
        datos.put(id, data);
        contador++;
        System.out.println("Guardado en memoria con id: " + id + " = " + data);
    }

    @Override
    public Object leer(String id) {
        Object dato = datos.get(id);
        System.out.println("Leyendo de memoria: " + id + " = " + dato);
        return dato;
    }

    @Override
    public void eliminar(String id) {
        datos.remove(id);
        System.out.println("Eliminado de memoria: " + id);
    }
}
