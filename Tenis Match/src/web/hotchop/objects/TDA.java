package web.hotchop.objects;

import javax.swing.*;

public class TDA {
    Player P1;
    Player P2;
    public void partido(){
        P1 = new Player();
        P2 = new Player();
        JOptionPane.showInternalMessageDialog(null,"Nuevo Partido.\nIngrese Puntos [P1/P2]");
        while(P1.getScore().compareTo("Winner") !=0 && P2.getScore().compareTo("Winner") !=0){
            String message;
            if(P1.getScore().compareTo("Deuce") == 0 && P2.getScore().compareTo("Deuce") == 0){
                message = "Deuce";
            }
            else {
                if(P1.getScore().compareTo("Ventaja") == 0){
                    message = "Ventaja P1";
                }
                else {
                    if(P2.getScore().compareTo("Ventaja") == 0){
                        message = "Ventaja P2";
                    }
                    else {
                        message = P1.getScore() +" - "+ P2.getScore();
                    }
                }
            }
            String punto = JOptionPane.showInputDialog(null,message);
            switch (punto){
                case "P1":increase(P1,P2);
                    break;
                case "P2":increase(P2,P1);
                    break;
                default:JOptionPane.showMessageDialog(null,"Ingrese jugador P1 o P2");
            }
        }
        if(P1.getScore().compareTo("Winner") == 0){
            JOptionPane.showInternalMessageDialog(null,"Ha ganado del P1");
        }
        else {
            JOptionPane.showInternalMessageDialog(null,"Ha ganado del P2");
        }
    }
    public void increase(Player win,Player lose){
        if((win.getScore().compareTo("30") == 0 && lose.getScore().compareTo("40") == 0) || (win.getScore().compareTo("Deuce") == 0 && lose.getScore().compareTo("Ventaja") == 0)){
            win.setScore("Deuce");
            lose.setScore("Deuce");
        }
        else{
            if(win.getScore().compareTo("Deuce") == 0 && lose.getScore().compareTo("Deuce") == 0){
                win.setScore("Ventaja");
            }
            else{
                switch (win.getScore()){
                    case "Love":win.setScore("15");
                        break;
                    case "15":win.setScore("30");
                        break;
                    case "30":win.setScore("40");
                        break;
                    case "40":win.setScore("Winner");
                        break;
                    case "Ventaja":win.setScore("Winner");
                        break;
                }
            }
        }
    }
}
