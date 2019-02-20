/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ncc
 */
// example of inhertiance 
public class GrassBlock extends Block{
    
    public GrassBlock(int x, int y, int z){
        super(true); //calling the parent constructor and in the argument you put ever in the argument of the constuctor
        this.x = x;
        this.y = y;
        this.z = z;
        // you can write it like this mX = pX its the same 
    }

    @Override
    public void draw() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
