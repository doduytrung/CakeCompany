/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakecompany;

/**
 *
 * @author test
 */
public class CakeCompany {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        CakeFactory f=new CakeFactory();
        for (int i = 0; i < 1000; i++) {
            int m=i%12;
            Thread.sleep(1000);
            Cake cake=f.create(m);
            cake.printName();
        }
    }
    
}
