/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minecraft.xp.calculator;

/**
 *
 * @author Franz
 */
public class Monster {
    int xp;
    String name;

    public Monster(int xp, String name) {
        this.xp = xp;
        this.name = name;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
