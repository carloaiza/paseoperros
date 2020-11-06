/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemploestudiantes.modelo;

import java.io.Serializable;

/**
 *
 * @author carloaiza
 */
public class RevisionEstudiante implements Serializable{
    private Estudiante estudiante;
    private float nota;

    public RevisionEstudiante() {
    }

    
    
    public RevisionEstudiante(Estudiante estudiante, float nota) {
        this.estudiante = estudiante;
        this.nota = nota;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
    
    
    
}
