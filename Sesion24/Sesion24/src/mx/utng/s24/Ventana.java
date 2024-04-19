package mx.utng.s24;
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
public class Ventana extends JFrame{
    private JTextField txtUsuario;
    private JPasswordField txtClave;
    public Ventana(){
        //Invocando al constructor de la clase padre
        super("Autenticación de Usuario");
        //Dimensiones de la ventana
        setSize(300, 200);
        //Cuando de clic en el botón x se cierre
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Coloca un contenedor de componentes de GUI
        JPanel panel = new JPanel(new GridBagLayout());
        //Coloca restricciones para la rejilla (Grid)
        GridBagConstraints gbc= new GridBagConstraints();
        gbc.insets =new Insets(5, 5, 5, 5);

        //Etiquetas para los campos
        JLabel lblUsuario= new JLabel("Usuario: ");
        JLabel lblClave= new JLabel("Clave: ");

        //Inicio las cajas de texto
        txtUsuario= new JTextField(15);
        txtClave= new JPasswordField(15);

        //Botón de Login
        JButton btnLogin= new JButton("Login");
        //La acción del botón
        btnLogin.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String usuario= txtUsuario.getText();
                    char[] charsClave= txtClave.getPassword();
                    String clave= new String(charsClave);

                    if (validarLogin(usuario, clave)) {
                        JOptionPane.showMessageDialog(Ventana.this, "Login Correcto");
                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "Usuario o Clave incorrectos");
                    }
                };
            }

        );
        //Colocando en cada celda de la rejilla (0,0)
        gbc.gridx=0;
        gbc.gridy=0;
        panel.add(lblUsuario, gbc);
        //Colocando en la celda (1,0) la caja de texto
        gbc.gridx=1;
        panel.add(txtUsuario, gbc);

        //Colocando en la celda (0,1) la etiqueta
        gbc.gridx=0;
        gbc.gridy=1;
        panel.add(lblClave, gbc);
        //Colocando en la celda (1,1) la caja de texto
        gbc.gridy=1;
        gbc.gridx=1;
        panel.add(txtClave, gbc);

        //Colocando en la celda (0,2) el boton
        gbc.gridx=0;
        gbc.gridy=2;
        panel.add(btnLogin, gbc);

        //Añade el panel a la ventana
        this.add(panel);
        
        //Ventana centrada
        setLocationRelativeTo(null);
        
        //Hace visible la ventana, por defecto está en false
        setVisible(true);

    }
    public static void main(String[] args) {
        new Ventana();
    }
    private boolean validarLogin(String usuario, String Clave){
        return usuario.equals("utng")&& Clave.equals("1234");
    }
}