public class inmobiliaria {

private String direccion;
private String tipo;
private Integer valor;
private String situacion; // situacion en que la casa se encuentre ya sea arrendada o vendida

public inmobiliaria(String direccion, String tipo, Integer valor, String situacion){

this.direccion = direccion;
this.tipo = tipo;
this.valor = valor;
this.situacion = situacion;

}

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }
}
