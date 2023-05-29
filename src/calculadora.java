import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora extends JFrame {
    private JTextField numero1;
    private JTextField numero2;
    private JTextField resultado;
    private JButton somar;
    private JButton subtrair;
    private JButton dividir;
    private JButton multiplicar;
    private JButton limpar;
    public JPanel calculadora;



    public JTextField getValor1() {
        return numero1;
    }

    public void setValor1(JTextField valor1) {
        this.numero1 = valor1;
    }

    public JTextField getValor2() {
        return numero2;
    }

    public void setValor2(JTextField valor2) {
        this.numero2 = valor2;
    }

    public JTextField getResultado() {
        return resultado;
    }

    public void setResultado(JTextField resultado) {
        this.resultado = resultado;
    }

    public JButton getSomar() {
        return somar;
    }

    public void setSomar(JButton somar) {
        this.somar = somar;
    }

    public JButton getSubtrair() {
        return subtrair;
    }

    public void setSubtrair(JButton subtrair) {
        this.subtrair = subtrair;
    }

    public JButton getDividir() {
        return dividir;
    }

    public void setDividir(JButton dividir) {
        this.dividir = dividir;
    }

    public JButton getMultiplicar() {
        return multiplicar;
    }

    public void setMultiplicar(JButton multiplicar) {
        this.multiplicar = multiplicar;
    }

    public JButton getLimpar() {
        return limpar;
    }

    public void setLimpar(JButton limpar) {
        this.limpar = limpar;
    }

    public JPanel getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(JPanel calculadora) {
        this.calculadora = calculadora;
    }
    public calculadora() {
        somar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double valor1 = Double.valueOf(numero1.getText());

                Double valor2 = Double.valueOf(numero2.getText());

                Double soma = valor1 + valor2;

                resultado.setText(soma.toString());

            }
        });
        subtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double valor1 = Double.valueOf(numero1.getText());

                Double valor2 = Double.valueOf(numero2.getText());

                Double soma = valor1 - valor2;

                resultado.setText(soma.toString());


            }
        });
        dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double valor1 = Double.valueOf(numero1.getText());

                Double valor2 = Double.valueOf(numero2.getText());

                Double soma = valor1 / valor2;

                resultado.setText(soma.toString());

            }
        });
        multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double valor1 = Double.valueOf(numero1.getText());

                Double valor2 = Double.valueOf(numero2.getText());

                Double soma = valor1 * valor2;

                resultado.setText(soma.toString());

            }


        });
        limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText("");
                numero1.setText("");
                numero2.setText("");
            }
        });
    }

}
