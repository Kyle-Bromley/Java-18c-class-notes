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

// abstract means it must have a child class (sub-classs) like the grassblock
public abstract class Block {
    //insance method, instance variable (apply to spefic situations)
    
    public static String shape = "Square";
    
    public int x;
    public int y;
    public int z;
    public boolean n;

            public Block(boolean y){
                this.x = 0;
                this.y = 0;
                this.z = 0;
            }
    public void breakBlock(){
        // do something to break block
    }
    
    // forces the subclasses to have this method
    public abstract void draw();
}
