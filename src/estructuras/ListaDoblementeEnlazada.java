
package estructuras;

import java.util.Iterator;
import java.util.Objects;


public class ListaDoblementeEnlazada<T> implements ListaEnlazada<T>,Iterable<T>{
    
    private Nodo<T> cabecera;
    private Nodo<T> ultimo;
    private int tamano;
    
    @Override
    public void insertarFinal(T t) {
        Nodo<T> nuevoNodo = new Nodo<>(t);        
        if(estaVacio()){            
            cabecera = nuevoNodo;
            ultimo = nuevoNodo;
        }
        else{
            ultimo.siguiente = nuevoNodo;
            nuevoNodo.anterior = ultimo;
            ultimo = nuevoNodo;
        }
        tamano++;
    }

    @Override
    public void insertarInicio(T t) {
        Nodo<T> nuevoNodo = new Nodo<>(t);
        if(estaVacio()){
            cabecera = nuevoNodo;
            ultimo = nuevoNodo;
        }
        else{
            nuevoNodo.siguiente = cabecera;
            cabecera.anterior = nuevoNodo;
            cabecera = nuevoNodo;
        }
        tamano++;
    }


    @Override
    public void insertarPosicion(T t, int posicion) {
        if(posicion<0 || posicion>=getTamanio()){
            throw new IllegalArgumentException("La posición está fuera de rango");
        }
        if(posicion == 0){
            insertarInicio(t);
        }
        else {
            Nodo<T> nuevoNodo = new Nodo<>(t);
            Nodo<T> nodoAnterior = obtenerNodo(posicion-1);
            Nodo<T> nodoPosicion = nodoAnterior.siguiente;
            nodoAnterior.siguiente = nuevoNodo;
            nuevoNodo.anterior = nodoAnterior;
            nuevoNodo.siguiente = nodoPosicion;
            nodoPosicion.anterior = nuevoNodo;
            tamano++;
        }
    }
    
    protected Nodo<T> obtenerNodo(int posicion){
        Nodo<T> aux = cabecera;
        for(int i=0;i<posicion;i++){
            aux = aux.siguiente;
        }
        return aux;
    }

    public T obtenerValor(int posicion){
        return obtenerNodo(posicion).valor;
    }
    
    @Override
    public int getTamanio() {
        return tamano;
    }
    
    protected void intercambiar(Nodo<T> nodo1,Nodo<T> nodo2){
        T aux = nodo1.valor;
        nodo1.valor = nodo2.valor;
        nodo2.valor = aux;
    }

    @Override
    public boolean eliminar(T t) {
        int posicion = buscarPosicion(t);
        return eliminarPosicion(posicion);
    }

    @Override
    public boolean eliminarPosicion(int posicion) {
        if(posicion<0 || posicion>=getTamanio()){
            throw new IllegalArgumentException("La posición está fuera de rango");
        }
        if(posicion == 0){
            cabecera = cabecera.siguiente;
            if(cabecera != null)
                cabecera.anterior = null;
        }
        else if(posicion == tamano-1){
            Nodo<T> nodo = obtenerNodo(posicion-1);
            ultimo = nodo;
            nodo.siguiente = null;
        }
        else{
            Nodo<T> nodoAnterior = obtenerNodo(posicion-1);
            Nodo<T> nodo = nodoAnterior.siguiente;
            Nodo<T> nodoSiguiente = nodo.siguiente;
            nodoAnterior.siguiente = nodoSiguiente  ;
            nodoSiguiente.anterior = nodoAnterior;
        }
         tamano--;
         return true;
    }

    @Override
    public boolean estaVacio() {
        return cabecera == null;
    }

    @Override
    public int buscarPosicion(T t) {
        Nodo<T> aux = cabecera;
        int i = 0;
        while(aux!=null){
            if(aux.valor.equals(t)){
                return i;
            }
            aux = aux.siguiente;
            i++;
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListaIterador(cabecera);
    }

    @Override
    public void insertarLista(ListaEnlazada<T> lista) {
        for(int i=0;i<lista.getTamanio();i++){
             insertarFinal(lista.obtenerValor(i));
        }
    }

    @Override
    public T obtenerUltimo() {
        return ultimo.valor;
    }
    
    protected class Nodo<T>{
        private Nodo<T> siguiente;
        private T valor;
        private Nodo<T> anterior;

        Nodo(T valor) {
            this.siguiente = null;
            this.anterior = null;
            this.valor = valor;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 47 * hash + Objects.hashCode(this.valor);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Nodo<?> other = (Nodo<?>) obj;
            if (!Objects.equals(this.valor, other.valor)) {
                return false;
            }
            return true;
        }        

        @Override
        public String toString() {
            return valor+"";
        }
        
        
    }
    
    class ListaIterador implements Iterator<T>{
        private Nodo<T> aux;

        public ListaIterador(Nodo<T> aux) {
            this.aux = aux;
        }
        
        @Override
        public boolean hasNext() {
            return aux!=null;
        }

        @Override
        public T next() {
            Nodo<T> actual  = aux;
            aux = aux.siguiente;
            return actual.valor;
        }
        
    }

    @Override
    public String toString() {
        String s = "[ ";
        Nodo<T> aux = cabecera;
        while(aux != null){
            s+=aux.valor+" ";
            aux = aux.siguiente;
        }
        return s+"]";
    }
    
    public String ordenInverso(){
        String s = "[ ";
        Nodo<T> aux = ultimo;
        while(aux != null){
            s+=aux.valor+" ";
            aux = aux.anterior;
        }
        return s+"]";
    }
    
}
