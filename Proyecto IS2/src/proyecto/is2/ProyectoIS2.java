/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2;

import proyecto.is2.view.Proyectois2View;
import proyecto.is2.model.Proyectois2Model;
import proyecto.is2.controller.Proyectois2Controller;

/**
 * @author Carlos
 * @author Maria
 */


public class ProyectoIS2 {
    
    public static void main(String[] args) {
       
        Proyectois2View view = new Proyectois2View();
        Proyectois2Model model = new Proyectois2Model();
        view.setVisible(true);
        //Proyectois2Controller controller = new Proyectois2Controller(view,model);
    }
}
