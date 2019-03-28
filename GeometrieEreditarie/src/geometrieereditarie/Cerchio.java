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
public class Cerchio {
    double diametro;
    final double pgreco=Math.PI;
    
    public Cerchio(double diametro)
    {
        this.diametro=diametro;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getPgreco() {
        return pgreco;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    public void calcolaPerimetro()
    {
        double perimetro = 2*pgreco*(diametro/2);
        System.out.println(perimetro);
    }
    
    public void calcolaSup()
    {
        double area = (2*pgreco*Math.pow(diametro/2,2));
        System.out.println(area);
    }
    
}
