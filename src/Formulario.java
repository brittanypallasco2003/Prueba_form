import javax.swing.*;

public class Formulario {
    private JPanel rootPanel;
    private JTextField inputCod;
    private JTextField inputId;
    private JTextField inputNom;
    private JComboBox comboBoxSigno;
    private JTextField inputApel;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JCheckBox rojoCheckBox;
    private JCheckBox verdeCheckBox;
    private JCheckBox ningunoCheckBox;
    private JRadioButton siRadioButton;
    private JRadioButton noRadioButton;
    private JButton cargarDatosDesdeElButton;
    private JButton guardarDatosEnDiscoButton;
    private JButton button1;
    private JButton button2;



    public static void main(String[] args) {
        JFrame frame=new JFrame("Estudiantes");
        frame.setContentPane(new Formulario().rootPanel);
        frame.setLocationRelativeTo(null);
        frame.setSize(1000,900);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
