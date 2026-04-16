package Bloque4;
public interface DiccionarioTDA<K, V> {

    void InicializarDiccionario();

    void Agregar(K clave, V valor);

    void Eliminar(K clave);

    boolean Pertenece(K clave);

    V Obtener(K clave);

    boolean DiccionarioVacio();
}
