import model.Cronometro;
import model.Orden;

public class Main {

    public static void main(String[] args){

        Cronometro cronometro = new Cronometro();
        Orden orden = new Orden();

        int temp, length=100000;
        int vector_a[] = new int[length];
        int vector_b[] = new int[length];
        for(int i=length-1; i>0; i--) {
            //temp = (int) (Math.random() * length) + 1;
            vector_a[i] = i;
            vector_b[i] = i;
        }

        cronometro.iniciar();
        vector_a = orden.insercion(vector_a);
        cronometro.parar();

        System.out.println("Algoritmo de inserción");
        System.out.println(cronometro.getDuracionNs());

        cronometro.iniciar();
        vector_b = orden.seleccion(vector_b);
        cronometro.parar();

        System.out.println("Algoritmo de selección");
        System.out.println(cronometro.getDuracionNs());

    }

}
