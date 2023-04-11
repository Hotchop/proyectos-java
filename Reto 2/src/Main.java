import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        leetAlfabet abc = new leetAlfabet();
        String text = JOptionPane.showInputDialog(null,"Ingrese Texto a Convertir");
        JOptionPane.showMessageDialog(null,abc.leet(text));
    }
}