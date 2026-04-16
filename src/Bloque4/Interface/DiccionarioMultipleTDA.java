package Bloque4.Interface;

public interface DiccionarioMultipleTDA<K, V> {
    void InicializarDiccionario();
    void Agregar(K clave, V valor);
    void EliminarValor(K clave, V valor);
    void Eliminar(K clave);
    V[] Recuperar(K clave);
    K[] Claves();
}