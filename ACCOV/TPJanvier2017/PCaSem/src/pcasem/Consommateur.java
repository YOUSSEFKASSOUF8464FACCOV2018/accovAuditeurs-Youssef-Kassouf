/*
 * Copyright © <Pascal Fares @ ISSAE - Cnam Liban>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), 
 * to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, 
 * and to permit persons to whom the Software is furnished to do so, subject to the following conditions: 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * The Software is provided “as is”, without warranty of any kind, express or implied, including but not limited to the warranties of merchantability, 
 * fitness for a particular purpose and noninfringement. In no event shall the authors or copyright holders be liable for any claim, damages or other liability, 
 * whether in an action of contract, tort or otherwise, arising from, out of or in connection with the software or the use or other dealings in the Software. »
 */
package pcasem;

/**
 *
 * @author pascalfares
 */
public class Consommateur extends Thread {
    private TampCirc Tampon;
    private Integer Valeur_Lue;
    
    public Consommateur(TampCirc Tampon) {
        this.Tampon = Tampon;
    }
    //////////////////////////////////////////////////////////
    public void run() {
        while (true) {
	    Valeur_Lue = ((Integer)Tampon.Consommer());
	    // System.out.println(" --- Consommateur "  + Thread.currentThread().getName() + " lit " +((Integer)Tampon.Consommer()).toString() );
	    System.out.println(" --- Consommateur "  + Thread.currentThread().getName() + " lit " + Valeur_Lue);
	    // verifier le timeout
	    //if (Valeur_Lue == null) break;
            try {
                Thread.sleep((int)(Math.random()*200));    // sleep : en ms
            } catch (InterruptedException e) {}
        }
    }
    
}
