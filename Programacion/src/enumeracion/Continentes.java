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
public enum Continentes {
    EUROPA(46,1000),
    AMERICA(34,4000),
    AFRICA(53,1000),
    ASIA(44,1000),
    OCEANIA(14,1000);
    
    private final int continentes;
    
    private Continentes(int continentes, int superficie) {
      this.continentes=continentes;
   }
    
    public int getNumPaises(){
        return continentes;
    }
}
