
package estructuras;


public interface ListaEnlazada<T> {
    public abstract void insertarFinal(T t);
    public abstract void insertarInicio(T t);
    public abstract void insertarLista(ListaEnlazada<T> lista);
    public abstract void insertarPosicion(T t,int posicion);
    public abstract boolean estaVacio();
    public abstract boolean eliminar(T t);
    public abstract boolean eliminarPosicion(int posicion);
    public abstract int buscarPosicion(T t);
    public abstract T obtenerValor(int posicion);
    public abstract int getTamanio();
    public abstract T obtenerUltimo();
}
