
package ejercicio1;

import java.util.Date;

public class Reserva {
   private Date fechaReserva;
   private Equipo equipo1,equipo2;
   
 public Reserva (Date fechaReserva, Equipo equipo1, Equipo equipo2){
     
     this.fechaReserva=fechaReserva;
     this.equipo1=equipo1;
     this.equipo2=equipo2;
     
 }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }
  
 
}
