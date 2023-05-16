import web.hotchop.models.Enemy;
import web.hotchop.models.Player;
import web.hotchop.models.enums.CombatOptions;
import web.hotchop.models.enums.EnemyStatus;
import web.hotchop.models.enums.PlayerStatus;

import javax.swing.*;
import java.util.Random;

public abstract class Game {
    public static boolean encounter(Player player, Enemy enemy){
        Random rng = new Random();
        CombatOptions choise;
        CombatOptions enemyChoise = null;
        CombatOptions[] options = CombatOptions.values();
        int defenseMod;
        while(player.getStatus().compareTo(PlayerStatus.DEAD) != 0 && enemy.getStatus().compareTo(EnemyStatus.DEAD)!=0){
            defenseMod = 0;
            enemyChoise = options[rng.nextInt(options.length-1)];
            ///Crear intefaz de combate (botones de ataque, esquive, defensa, inventario)
            int choiseNum = JOptionPane.showOptionDialog(null,"You are engaged in combat with "+enemy.getName()+"\n-------------\nHP\n"+player.getHp()+"/"+ player.MAX_HP,"Blade of Sol",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
            choise = options[choiseNum];
            ///Crear reaccion random enemigo (ataque, otros)
            switch (choise){
                case ATTACK -> playerAttaking(player,enemy);
                case DEFEND -> defenseMod = 2;
                case INVENTORY -> inventory();
            }
            if(enemy.getStatus().compareTo(EnemyStatus.DEAD)!= 0) {
                switch (enemyChoise) {
                    case ATTACK -> enemyAttaking(enemy, player, defenseMod);
                    ///case DEFEND -> ; Mensaje Neutral
                }
                if(player.getStatus().compareTo(PlayerStatus.DEAD)==0){
                    return false;
                }
            }
            else{
                return true;
            }
        }
        if(player.getStatus().compareTo(PlayerStatus.DEAD) == 0){
            return false;
        }
        else{
            return true;
        }
    }

    private static void playerAttaking(Player player,Enemy enemy){
        if(player.attack() >= enemy.getDefense()){
            enemy.getHit(player.damage());
            ///Mensaje de golpe
        }
        else{
            ///Mensaje de fallo
        }
    }
    private static void enemyAttaking(Enemy enemy,Player player,int defenseMod){
        if(enemy.attack() >= player.getArmorE().getResistance() + defenseMod){
            player.getHit(enemy.damage());
            ///Mensaje de golpe
        }
        else{
            ///Mensaje de Fallo
        }
    }

    public static void inventory(){

    }
}
