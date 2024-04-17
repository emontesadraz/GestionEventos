import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operaciones extends JFrame {
    JButton sumar;
    JButton restar;
    JTextField primerNumero;
    JTextField segundoNumero;
    JTextArea resultado;

    public Operaciones(){
        super("Calculadora Básica");
        setLayout(new FlowLayout());

        primerNumero = new JTextField(10);
        add(primerNumero);

        segundoNumero = new JTextField(10);
        add(segundoNumero);

        sumar = new JButton("Sumar");
        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(primerNumero.getText());
                float num2 = Float.parseFloat(segundoNumero.getText());
                float res = num1 + num2;
                resultado.append(res + "\n");
                primerNumero.setText("");
                segundoNumero.setText("");
            }
        });
        add(sumar);

        restar = new JButton("Restar");
        restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(primerNumero.getText());
                float num2 = Float.parseFloat(segundoNumero.getText());
                float res = num1 - num2;
                resultado.append(res + "\n");
                primerNumero.setText("");
                segundoNumero.setText("");
            }
        });
        add(restar);

        resultado = new JTextArea(5,20);
        add(new JScrollPane(resultado));

        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
