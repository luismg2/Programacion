/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeracion;

/**
 *
 * @author Alumno Mañana
 */
public enum HereticsCreators {
    Rubiuh(1000000,"watchdogs"),
    MangoRolo(5000,"Far cry"),
    Cathyvipi(75000,"Wow"),//Son cuentas secundarias
    Djlloros(10000,"Fifita"),
    AuronStop(500000,"Maincra"),
    PapiBiga(6000,"Inazuma Eleven");
    
    private final int viewers;
    
    private HereticsCreators(int viewers,String juego){
      this.viewers=viewers;
   }
}
