/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

/**
 *
 * @author doutedasolla
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato objGato = new Gato();
        objGato.nadar();
        objGato.camiñar();

        Mamifero objMam = new Mamifero();
        objMam.camiñar();

        Papagaio objPapag = new Papagaio();
        objPapag.camiñar();
    }

}
