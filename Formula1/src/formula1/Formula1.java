
package formula1;


public class Formula1 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Carrera NuevaCarrera = new Carrera();
        
        NuevaCarrera.CorrerCarrera(5);
        Auto ganador = NuevaCarrera.DameElGananador();
        System.out.println("termino la carrera");
    }
    
}
