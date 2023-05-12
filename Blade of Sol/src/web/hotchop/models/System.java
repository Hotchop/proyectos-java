package web.hotchop.models;

import web.hotchop.models.enums.CombatOptions;
import web.hotchop.models.enums.EnemyStatus;
import web.hotchop.models.enums.PlayerStatus;

import java.util.Random;

public abstract class System {
    public static boolean encounter(Player player,Enemy enemy){
        Random rng = new Random();
        CombatOptions choise = null;
        CombatOptions enemyChoise = null;
        CombatOptions[] options = CombatOptions.values();
        int defenseMod;
        while(player.getStatus().compareTo(PlayerStatus.DEAD) != 0 && enemy.getStatus().compareTo(EnemyStatus.DEAD)!=0){
            defenseMod = 0;
            enemyChoise = options[rng.nextInt(options.length-1)];
            ///Crear intefaz de combate (botones de ataque, esquive, defensa, inventario)
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
