package mx.utng.s24.reto01;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Declaramos una clase que servirá de ventana
public class Reto01 extends JFrame{
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JLabel lblResultado;

    public Reto01(){
        //Invocando al constructor de la clase padre
        super("Suma de Números");
        //Dimensiones de la ventana
        setSize(300, 200);
        //Cuando de clic en el botón x se cierre
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Coloca un contenedor de componentes de GUI
        JPanel panel = new JPanel(new GridBagLayout());
        //Coloca restricciones para la rejilla (Grid)
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        //Etiquetas para los campos
        JLabel lblNumero1 = new JLabel("Número 1: ");
        JLabel lblNumero2 = new JLabel("Número 2: ");
        lblResultado = new JLabel("Resultado: ");

        //Inicio las cajas de texto
        txtNumero1 = new JTextField(15);
        txtNumero2 = new JTextField(15);

        //Botón de Suma
        JButton btnSumar = new JButton("Sumar");
        //La acción del botón
        btnSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int numero1 = Integer.parseInt(txtNumero1.getText());
                    int numero2 = Integer.parseInt(txtNumero2.getText());
                    int suma = numero1 + numero2;
                    lblResultado.setText("Resultado: " + suma);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Reto01.this, "Por favor ingrese números válidos");
                }
            }
        });

        //Colocando en cada celda de la rejilla (0,0)
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(lblNumero1, gbc);
        //Colocando en la celda (1,0) la caja de texto
        gbc.gridx = 1;
        panel.add(txtNumero1, gbc);

        //Colocando en la celda (0,1) la etiqueta
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(lblNumero2, gbc);
        //Colocando en la celda (1,1) la caja de texto
        gbc.gridy = 1;
        gbc.gridx = 1;
        panel.add(txtNumero2, gbc);

        //Colocando en la celda (0,2) el boton
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // Este botón debe ocupar dos columnas
        panel.add(btnSumar, gbc);

        // Colocando en la celda (0,3) la etiqueta del resultado
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2; // Esta etiqueta debe ocupar dos columnas
        panel.add(lblResultado, gbc);

        //Añade el panel a la ventana
        this.add(panel);

        //Ventana centrada
        setLocationRelativeTo(null);

        //Hace visible la ventana, por defecto está en false
        setVisible(true);

    }
    public static void main(String[] args) {
        new Reto01();
    }
}


