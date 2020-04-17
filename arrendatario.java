public class arrendatario {

    private String nombre;
    private Integer identificacion;
    private inmobiliaria casa;

    public arrendatario (String nombre, Integer identificacion , inmobiliaria casa){

        this.nombre= nombre;
        this.identificacion = identificacion;
        this.casa = casa;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public inmobiliaria getCasa() {
        return casa;
    }

    public void setCasa(inmobiliaria casa) {
        this.casa = casa;
    }
    public void validar(Integer valor_casa) throws excepcion {

        if(valor_casa > 0){

            System.out.println("El valor de la casa está bien registrado.");

        }else{

            throw new excepcion("La casa esta mal registrada.");

        }

    }

}

