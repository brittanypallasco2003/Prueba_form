public class Estudiante {

    private String codigo;
    private String cedula;
    private String nombres;
    private String signo;
    private String anio;
    private String mes;
    private int dia;

    public Estudiante(String codigo,
                      String cedula,
                      String nombres,
                      String signo,
                      String anio,
                      String mes,
                      int dia) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombres = nombres;
        this.signo = signo;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
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
}
