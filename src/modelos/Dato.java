/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;

/**
 *
 * @author Josar
 */
public class Dato {
    // General
    private int id;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String cedula;
    private String sexo;
    private String fNacimiento;
    private String telefono;
    private String tipoSangre;
    private String peso; // Se decidió pasar su tipo a String por errores de captura en la base de datos.
    private String tamaño; // Lo mismo con tamaño, pero se validaran los datos que se obtengan.
    
    // Domicilio
    private String departamento;
    private String municipio;
    private String nCasa;
    private String direccion;
    
    // Estilo de vida (Clase EstiloVida y DVida eliminados por exceso de errores y falta tiempo)
    private String haceEjercicios;
    private String tomaDesayuno;
    private int horasSueño;
    private String religion;
    
    // Generales (Clase General y DGeneral eliminados por exceso de errores y falta de tiempo)
    private String hereditario;
    private String patologico;
    private String alergia;
    private String incapacidad;
    private String tabaquismo;
    private String alcoholismo;
    private String observacion;

    public Dato() {
    }

    public Dato(int id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String cedula, String sexo, String fNacimiento, String telefono, String tipoSangre, String peso, String tamaño, String departamento, String municipio, String nCasa, String direccion, String haceEjercicios, String tomaDesayuno, int horasSueño, String religion, String hereditario, String patologico, String alergia, String incapacidad, String tabaquismo, String alcoholismo, String observacion) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.cedula = cedula;
        this.sexo = sexo;
        this.fNacimiento = fNacimiento;
        this.telefono = telefono;
        this.tipoSangre = tipoSangre;
        this.peso = peso;
        this.tamaño = tamaño;
        this.departamento = departamento;
        this.municipio = municipio;
        this.nCasa = nCasa;
        this.direccion = direccion;
        this.haceEjercicios = haceEjercicios;
        this.tomaDesayuno = tomaDesayuno;
        this.horasSueño = horasSueño;
        this.religion = religion;
        this.hereditario = hereditario;
        this.patologico = patologico;
        this.alergia = alergia;
        this.incapacidad = incapacidad;
        this.tabaquismo = tabaquismo;
        this.alcoholismo = alcoholismo;
        this.observacion = observacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(String fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getnCasa() {
        return nCasa;
    }

    public void setnCasa(String nCasa) {
        this.nCasa = nCasa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHaceEjercicios() {
        return haceEjercicios;
    }

    public void setHaceEjercicios(String haceEjercicios) {
        this.haceEjercicios = haceEjercicios;
    }

    public String getTomaDesayuno() {
        return tomaDesayuno;
    }

    public void setTomaDesayuno(String tomaDesayuno) {
        this.tomaDesayuno = tomaDesayuno;
    }

    public int getHorasSueño() {
        return horasSueño;
    }

    public void setHorasSueño(int horasSueño) {
        this.horasSueño = horasSueño;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getHereditario() {
        return hereditario;
    }

    public void setHereditario(String hereditario) {
        this.hereditario = hereditario;
    }

    public String getPatologico() {
        return patologico;
    }

    public void setPatologico(String patologico) {
        this.patologico = patologico;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getIncapacidad() {
        return incapacidad;
    }

    public void setIncapacidad(String incapacidad) {
        this.incapacidad = incapacidad;
    }

    public String getTabaquismo() {
        return tabaquismo;
    }

    public void setTabaquismo(String tabaquismo) {
        this.tabaquismo = tabaquismo;
    }

    public String getAlcoholismo() {
        return alcoholismo;
    }

    public void setAlcoholismo(String alcoholismo) {
        this.alcoholismo = alcoholismo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    
}
