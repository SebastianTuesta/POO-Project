
package estructuras;


public interface ICola<T> {
    public void encolar(T t);
    public T desencolar();
    public T frente();
    public int getTamano();
    public boolean estaVacio();
}
