package com.example.david.sqlite;

/**
 * Created by David on 21/01/2018.
 */


public class Estudiante  {
    private String tipo;
    private String nombre;
    private String edad;
    private String ciclo;
    private String curso;
    private String notaMedia;

    public Estudiante(String tipo, String nombre, String edad, String ciclo, String curso, String notaMedia) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
        this.ciclo = ciclo;
        this.curso = curso;
        this.notaMedia = notaMedia;

    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(String notaMedia) {
        this.notaMedia = notaMedia;
    }

}