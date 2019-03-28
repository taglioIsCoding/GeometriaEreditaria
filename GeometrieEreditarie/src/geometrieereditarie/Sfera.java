/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrieereditarie;

/**
 *
 * @author 72873486
 */
public class Sfera extends Cerchio {
    
    public double costante = 4/3;

    public Sfera(double diametro) {
        super(diametro);
    }
    
    @Override
    public void calcolaSup()
    {
        double sup = 4*Math.pow(diametro/2,2);
        System.out.println(sup);
        
    }
    
    public void calcolaVol()
    {
        double vol = costante*pgreco*Math.pow(diametro/2, 3);
        System.out.println(vol);
    }
}
