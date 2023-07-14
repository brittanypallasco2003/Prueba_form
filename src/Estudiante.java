public class Estudiante {

    private String codigo;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String signo;
    private String anio;
    private String mes;
    private int dia;
    private boolean colorRojo;
    private boolean colorVerde;
    private boolean colornone;

    public Estudiante(String codigo,
                      String cedula,
                      String nombres,
                      String apellidos,
                      String signo,
                      String anio,
                      String mes,
                      int dia,
                      boolean colorRojo,
                      boolean colorVerde,
                      boolean colornone) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.signo = signo;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.colorRojo = colorRojo;
        this.colorVerde = colorVerde;
        this.colornone = colornone;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public boolean isColorRojo() {
        return colorRojo;
    }

    public void setColorRojo(boolean colorRojo) {
        this.colorRojo = colorRojo;
    }

    public boolean isColorVerde() {
        return colorVerde;
    }

    public void setColorVerde(boolean colorVerde) {
        this.colorVerde = colorVerde;
    }

    public boolean isColornone() {
        return colornone;
    }

    public void setColornone(boolean colornone) {
        this.colornone = colornone;
    }
}
