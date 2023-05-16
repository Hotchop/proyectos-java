import web.hotchop.models.Enemy;
import web.hotchop.models.Player;
import web.hotchop.models.items.Armor;
import web.hotchop.models.items.Weapon;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Weapon knife = new Weapon("A rusty old knife given to you by your father. You can no longer see your reflection on it","Rusty Knife",3,0);
        Armor rags = new Armor("Some rags that hang on your shoulders. They don't offer much protection","Old Rags",10);
        Player player = new Player(knife,rags);
        Enemy golem = new Enemy("Golem",10,5,2,3,null,null);

        if(Game.encounter(player,golem)){
            JOptionPane.showMessageDialog(null,"Victory!!");
        }else{
            JOptionPane.showMessageDialog(null,"YOU DIED");
        }
    }
}