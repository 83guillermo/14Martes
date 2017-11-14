
package formula1;


public class Auto {
    private int tiempoRecorrido;
    private int numero;
    private String escuderia;
    private String modelo;
    private Pilotos elPiloto; 
     
    public Auto(int numero){
       this.elPiloto = new Pilotos();
       this.modelo="Ford";
       this.numero= numero;
       this.escuderia ="ninguna";
    }
      public int dameElTiempoRecorrido(){
    return this.tiempoRecorrido;
    }
    public void AgregarTiempoRecorrido(int tiempo){
        this.tiempoRecorrido= this.tiempoRecorrido+tiempo;
    }
private void  CargarPilotoRandom(){
    int  Mirandom = (int)(Math.random()*10);
}
private void  NombreRandom(){
    int  Mirandom = (int)(Math.random()*10);
    switch(Mirandom){
        case 0:
        this.elPiloto.setNombre("rogelio");
        break;
         case 1:
        this.elPiloto.setNombre("pedro");
        break;
         case 2:
        this.elPiloto.setNombre("juan");
        break;
         case 3:
        this.elPiloto.setNombre("victor");
        break;
         case 4:
        this.elPiloto.setNombre("angel");
        break;
         case 5:
        this.elPiloto.setNombre("nacho");
        break;
         case 6:
        this.elPiloto.setNombre("roberto");
        break;
         case 7:
        this.elPiloto.setNombre("miguel");
        break;
         case 8:
        this.elPiloto.setNombre("ciro");
        break;
         case 9:
        this.elPiloto.setNombre("nahuel");
        break;
        default:
        this.elPiloto.setNombre("martin");
        break;
    }
} 
private void  ApellidoRandom(){
    int  Mirandom = (int)(Math.random()*10);
     switch(Mirandom){
        case 0:
        this.elPiloto.setApellido("rau");
        break;
         case 1:
        this.elPiloto.setApellido("jerez");
        break;
         case 2:
        this.elPiloto.setApellido("juares");
        break;
         case 3:
        this.elPiloto.setApellido("villamil");
        break;
         case 4:
        this.elPiloto.setApellido("rocci");
        break;
         case 5:
        this.elPiloto.setApellido("noya");
        break;
         case 6:
        this.elPiloto.setApellido("royer");
        break;
         case 7:
        this.elPiloto.setApellido("tan");
        break;
         case 8:
        this.elPiloto.setApellido("lee");
        break;
         case 9:
        this.elPiloto.setApellido("nite");
        break;
        default:
        this.elPiloto.setApellido("muse");
        break;
     }
} 
  
}    
    

