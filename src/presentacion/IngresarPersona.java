package presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame{
    private JPanel plnPirncipal;
    private JLabel lblCodigo;
    private JTextField txtCodigo;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JLabel lblApellido;
    private JButton btnGuardar;
    private JLabel lblIdioma;
    private JComboBox cmbIdioma;
    private JCheckBox chbTerminos;
    private JLabel lblGenero;
    private JRadioButton rbtMasculino;
    private JRadioButton rbtFemenino;
    private JRadioButton rbtNobinario;
    private JRadioButton rbtPrefieronodecir;
    private JComboBox Idiomas;

    public IngresarPersona () {
        this.setTitle("Ventana Ingresar Persona");
        this.setContentPane(plnPirncipal);
        this.setVisible(true);
        this.setSize(700,500);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String idioma = cmbIdioma.getSelectedItem().toString();
                String aceptoTerminos = (chbTerminos.isSelected()) ? "Si" : "No";
                String genero = (rbtMasculino.isSelected()) ? "No indicado" : "";
                String mensaje = "Tus datos son: \n" +
                                 " Codigo: " + codigo + "\n" +
                                 "Nombre: " + nombre + "\n" +
                                 "Apelldio: " + apellido + "\n" +
                                 "Idioma: " + idioma + "\n" +
                                 "Genero: " + genero + "\n" +
                                 "Acepto Terminos: " + aceptoTerminos;
                JOptionPane.showMessageDialog(btnGuardar, mensaje);
            }
        });
    }
}