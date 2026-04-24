package Bloque4.Interface;

public interface DiccionarioSimpleTDAgenerico<K, V> {
    void InicializarDiccionario();
    void Agregar(K clave, V valor);
    void Eliminar(K clave);
    K[] Claves();
}