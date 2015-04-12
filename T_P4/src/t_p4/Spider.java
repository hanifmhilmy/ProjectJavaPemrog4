/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_p4;

/**
 *
 * @author calutak
 */
public class Spider extends Animal {

    public Spider() {
        super();
        System.out.println("Spider it's so epic!");
    }
    
    @Override
    public void eat()
    {
        System.out.println("Spider can eat");
    }
}
