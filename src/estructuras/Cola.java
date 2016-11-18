
package estructuras;


public class Cola<T> implements ICola<T> {
    protected ListaDoblementeEnlazada<T> lista = new ListaDoblementeEnlazada<>();
    
    @Override
    public void encolar(T t) {
        lista.insertarFinal(t);
    }

    @Override
    public T desencolar() {
        if(lista.estaVacio()){
            throw new IllegalArgumentException("La cola está vacia");
        }
        T valor = lista.obtenerValor(0);
        lista.eliminarPosicion(0);
        return valor;
    }

    @Override
    public T frente() {
        if(lista.estaVacio()){
            throw new IllegalArgumentException("La cola está vacia");
        }
        T valor = lista.obtenerValor(0);
        return valor;
    }

    @Override
    public int getTamano() {
        return lista.getTamanio();
    }

    @Override
    public boolean estaVacio() {
        return lista.estaVacio();
    }
    
}
