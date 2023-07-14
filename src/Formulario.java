import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class Formulario {
    private JPanel rootPanel;
    private JTextField inputCod;
    private JTextField inputId;
    private JTextField inputNom;
    private JComboBox comboBoxSigno;
    private JTextField inputApel;
    private JComboBox comboBoxAnio;
    private JComboBox comboBoxMes;
    private JComboBox comboBoxDia;
    private JCheckBox rojoCheckBox;
    private JCheckBox verdeCheckBox;
    private JCheckBox ningunoCheckBox;
    private JRadioButton siRadioButton;
    private JRadioButton noRadioButton;
    private JButton cargarDatosDesdeElButton;
    private JButton guardarDatosEnDiscoButton;
    private JButton button1;
    private JButton button2;
    ArrayList<Estudiante>estudiantes=new ArrayList<Estudiante>();
    String filepath="datosEst.dat";




    public Formulario() {
        guardarDatosEnDiscoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se define un objeto de la clase estudiante y se le mandan sus atributos
                String cod=inputCod.getText();
                String cedula=inputId.getText();
                String nombre=inputNom.getText();
                String apellidos=inputApel.getText();
                String signo=(String.valueOf(comboBoxSigno.getSelectedItem()));
                String anio=(String.valueOf(comboBoxAnio.getSelectedItem()));
                String mes=(String.valueOf(comboBoxMes.getSelectedItem()));
                int dia=(Integer.parseInt(String.valueOf(comboBoxDia.getSelectedItem())));
                boolean colorRojo=rojoCheckBox.isSelected();
                boolean colorVerde=verdeCheckBox.isSelected();
                boolean colornone=ningunoCheckBox.isSelected();

                Estudiante est=new Estudiante(cod,cedula,nombre,apellidos,signo,anio,mes,dia,colorRojo,colorVerde,colornone);

                //se añade el objeto al Arraylist
                estudiantes.add(est);

                //Try-Catch: para la escritura en el .dat
                try (
                        FileOutputStream fileOutputStream = new FileOutputStream(filepath);
                        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)
                        )
                {
                    /*Escritura de los atributos de cada uno de los objetos en el arraylist en el .dat*/
                    for (int i=0; i<estudiantes.size(); i++){
                        outputStream.writeObject(estudiantes.get(i).getCodigo());
                        outputStream.writeObject(estudiantes.get(i).getCedula());
                        outputStream.writeObject(estudiantes.get(i).getNombres());
                        outputStream.writeObject(estudiantes.get(i).getApellidos());
                        outputStream.writeObject(estudiantes.get(i).getSigno());
                        outputStream.writeObject(estudiantes.get(i).getAnio());
                        outputStream.writeObject(estudiantes.get(i).getMes());
                        outputStream.writeObject(estudiantes.get(i).getDia());
                        outputStream.writeObject(estudiantes.get(i).isColorRojo());
                        outputStream.writeObject(estudiantes.get(i).isColorVerde());
                        outputStream.writeObject(estudiantes.get(i).isColornone());
                    }
                }catch (IOException exception){
                    throw new RuntimeException(new Exception(exception));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("Estudiantes");
        frame.setContentPane(new Formulario().rootPanel);
        frame.setLocationRelativeTo(null);
        frame.setSize(1000,900);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
