public class RepositorioSQL implements IRepositorio {

    private int contador = 1;

    @Override
    public void guardar(Object data) {
        String id = "id" + contador;
        contador++;
        System.out.println("INSERT INTO tabla VALUES ('" + id + "', '" + data + "')");
        System.out.println("Guardado en SQL con id: " + id);
    }

    @Override
    public Object leer(String id) {
        System.out.println("SELECT * FROM tabla WHERE id = '" + id + "'");
        return "Dato desde SQL: " + id;
    }

    @Override
    public void eliminar(String id) {
        System.out.println("DELETE FROM tabla WHERE id = '" + id + "'");
    }
}
