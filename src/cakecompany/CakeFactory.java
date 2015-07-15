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
public class CakeFactory {

    public Cake create(int month) {
        Cake cake;
        switch (month) {
            case 0:
            case 1:
                cake = new TetCake();
                break;
            case 8:
            case 9:
                cake = new MoonCake();
                break;
            default:
                cake = new BLCake();
                break;
        }
        return cake;
    }
}
