package Discussion.Dis2;

import com.sun.org.apache.xerces.internal.xs.StringList;

/*----------------------------------------------------------------
 *  Author:        Zhang Xuan
 *  Written:       2018/4/9
 *  Last updated:  2018/4/9
 *  Compilation:   javac Pokemon.java
 *  Execution:     java HelloWorld
 *  Description:   Pass by value
 *
 *----------------------------------------------------------------*/
public class Pokemon {
    public String name;
    public int level;

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public static void change(Pokemon poke, int level) {
        poke.level = level;
        level = 50;
        poke = new Pokemon("Gengar",1);
    }

    public static void main(String[] args) {
        Pokemon p = new Pokemon("pikachu", 17);
        int level = 100;
        change(p, level);
        System.out.println("Name:" + p.name + " level :" + p.level + "level: " + level);

    }
}
