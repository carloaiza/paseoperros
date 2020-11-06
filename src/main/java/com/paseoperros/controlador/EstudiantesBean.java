/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paseoperros.controlador;

import com.ejemploestudiantes.modelo.Estudiante;
import com.ejemploestudiantes.modelo.RevisionEstudiante;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

/**
 *
 * @author carloaiza
 */
@Named(value = "estudiantesBean")
@SessionScoped
public class EstudiantesBean implements Serializable {
    
    
    private List<Estudiante> listadoEstudiantes;
    
    private List<RevisionEstudiante> revisiones;
    
    private RevisionEstudiante estSelec;

    /**
     * Creates a new instance of EstudiantesBean
     */
    public EstudiantesBean() {
    }
    
    @PostConstruct
    private void iniciar()
    {
        listadoEstudiantes= new ArrayList<>();
        listadoEstudiantes.add(new Estudiante("82201920484","Steven Millán"));
        listadoEstudiantes.add(new Estudiante("82201929640","Jhonatan Grisales"));
        listadoEstudiantes.add(new Estudiante("82201921040","Dahiana Osorio"));
        estSelec = new RevisionEstudiante();
        revisiones = new ArrayList<>();
        
    }

    public RevisionEstudiante getEstSelec() {
        return estSelec;
    }

    public void setEstSelec(RevisionEstudiante estSelec) {
        this.estSelec = estSelec;
    }

    
    
    

    public List<Estudiante> getListadoEstudiantes() {
        return listadoEstudiantes;
    }

    public void setListadoEstudiantes(List<Estudiante> listadoEstudiantes) {
        this.listadoEstudiantes = listadoEstudiantes;
    }

    public List<RevisionEstudiante> getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(List<RevisionEstudiante> revisiones) {
        this.revisiones = revisiones;
    }
    
    
    public void seleccionarEstudiante(Estudiante estud)
    {
        estSelec= new RevisionEstudiante(estud, (float)2.0);
        
    }
    
    public void agregarRevision()
    {
        revisiones.add(estSelec);
        estSelec= new RevisionEstudiante();
    }
            
}
