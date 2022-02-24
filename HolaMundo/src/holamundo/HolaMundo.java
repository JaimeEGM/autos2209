/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;
import poo.conceptos.básicos.Automóvil;

/**
 *
 * @author jaimegm
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Hola mundo Java !!!!");
        Persona per1 = new Persona();
        per1.setNombre("Jaime EGM");
        System.out.println("Nombre: " + per1.getNombre());
        per1.comer("Hamburguesa hawaiana!!");

        Persona per2 = new Persona();
        per2.setNombre("Felipe");
        System.out.println("Nombre per 2: " + per2.getNombre());
        per2.comer("Pizza hawaiana");

        Automóvil bocho = new Automóvil();
        bocho.setMarca("VW");
        System.out.println("Marca:" + bocho.getMarca());
        bocho.setSubmarca("Sedan");
        System.out.println("Submarca: " + bocho.getSubmarca());
        bocho.setModelo(1970);
        System.out.println("Modelo: " + bocho.getModelo());
        bocho.setColor(Color.blue);
        System.out.println("Color: " + bocho.getColor());

        Automóvil akura = new Automóvil();
        akura.setMarca("Akura");
        System.out.println("Marca: " + akura.getMarca());
        akura.setSubmarca("NSX");
        System.out.println("Submarca: " + akura.getSubmarca());
        akura.setModelo(2013);
        System.out.println("Modelo: " + akura.getModelo());
        akura.setColor(Color.gray);
        System.out.println("Color: " + akura.getColor());
        
        Automóvil miMustang = new Automóvil();
        miMustang.setMarca("Ford");
        System.out.println("Marca: " + miMustang.getMarca());
        miMustang.setSubmarca("Mustang");
        System.out.println("Submarca: " + miMustang.getSubmarca());
        miMustang.setModelo(2010);
        System.out.println("Modelo: " + miMustang.getModelo());
        miMustang.setColor(Color.yellow);
        System.out.println("Color: " + miMustang.getColor());
        
    }

}
