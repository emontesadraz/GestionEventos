import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectorColores extends JFrame {
   private JComboBox<String> comboBox;
   private JPanel comboColores;

   public SelectorColores(){
       super("Selector de Colores");
       setLayout(new FlowLayout());

       // Cargamos el array comboBox con los colores que queremos
       String[] colores = {"Verde","Azul","Rojo"};
       // Aquí vamos a introducir (por asi decirlo) los colores en el array
       comboBox = new JComboBox<>(colores);

       //Ahora vamos a preparar el panel
       comboColores = new JPanel();
       comboColores.setPreferredSize(new Dimension(300,200));

       // Añadimos el comboBox y el comboColores
       add(comboBox);
       add(comboColores);

       comboBox.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               switch (comboBox.getSelectedItem().toString()){
                   case "Rojo":
                       comboColores.setBackground(Color.RED);
                       break;
                   case "Verde":
                       comboColores.setBackground(Color.GREEN);
                       break;
                   case "Azul":
                       comboColores.setBackground(Color.BLUE);
                       break;
               }
           }
       });
       setSize(400,250);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
   }
}
