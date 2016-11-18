
package estructuras;

public class ColaPrioridad<T extends Comparable<T>> extends Cola<T>{

 
    @Override
    public void encolar(T t) {
         if(lista.estaVacio()){
             super.encolar(t);
         }
         else{
             int pos = 0;
             for(T valor : lista){
                 if(valor.compareTo(t)>0){
                     lista.insertarPosicion(t, pos);
                     return;
                 }
                 pos++;
             }
             lista.insertarFinal(t);
         }
    }

}
