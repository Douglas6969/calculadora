import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {

        calculadora form = new calculadora();

        form.setContentPane(form.calculadora);
        form.setVisible(true);
        form.setTitle("Calculadora");
        form.setSize(300,500);




    }



}