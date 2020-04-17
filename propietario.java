public class propietario {

private String nombre;
private String situacioncasa;
private String espera; // cuanto tiempo a esperado para que su casa sea comprada o puesta en arriendo
private String tiempotrabajo; //el tiempo con el que se ha trabajado con la casa
private inmobiliaria casa;


    public propietario( String nombre , String situacioncasa , String espera , String tiempotrabajo, inmobiliaria casa){

        this.nombre = nombre;
        this.situacioncasa = situacioncasa;
        this.espera = espera;
        this.tiempotrabajo = tiempotrabajo;
        this.casa = casa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSituacioncasa() {
        return situacioncasa;
    }

    public void setSituacioncasa(String situacioncasa) {
        this.situacioncasa = situacioncasa;
    }

    public String getEspera() {
        return espera;
    }

    public void setEspera(String espera) {
        this.espera = espera;
    }

    public String getTiempotrabajo() {
        return tiempotrabajo;
    }

    public void setTiempotrabajo(String tiempotrabajo) {
        this.tiempotrabajo = tiempotrabajo;
    }

    public inmobiliaria getCasa() {
        return casa;
    }

    public void setCasa(inmobiliaria casa) {
        this.casa = casa;
    }

}
