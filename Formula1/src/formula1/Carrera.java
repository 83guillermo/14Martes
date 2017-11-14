
package formula1;


public class Carrera {
    public Auto[] AutosParticipantes;     
    private String fecha;
    private String pais;
    public Carrera(){
        //constructor
        // no tiene valor de retorno
        // se a llama igual que la clase
        // el por defecto puede estar  o no 
        // siempre se  va  a ejecutar una unica vez
        // se eejcuta solo al crear el objeto "instancia"
        this.fecha ="hoy";
        this.pais="Argentina";
        this.AutosParticipantes = new Auto[20];
        this.CrearAutosTest();
    }
    private void CrearAutosTest(){
        for(int i =0; i<this.AutosParticipantes.length; i ++){
            this.AutosParticipantes[i] = new Auto(i);
                    
        }
    }
    public void CorrerCarrera(int CantidadVuelta){
        for(int vuelta =0; vuelta<CantidadVuelta; vuelta++){
            for(int i=0; i<this.AutosParticipantes.length; i++){
                int random=(int)(Math.random()*100);
                this.AutosParticipantes[i].AgregarTiempoRecorrido(55);
            }
        }
    } 
    public Auto DameElGananador(){
        Auto retorno = new Auto(0);
       int menorRecorrido=0;
       for(int i=0; i<this.AutosParticipantes.length; i++){
           if(i==0){
           menorRecorrido=this.AutosParticipantes[i].dameElTiempoRecorrido();
           retorno = this.AutosParticipantes[i];
           }
           else
               if(menorRecorrido>this.AutosParticipantes[i].dameElTiempoRecorrido()){}
       }
       
       return retorno;
    }
}
