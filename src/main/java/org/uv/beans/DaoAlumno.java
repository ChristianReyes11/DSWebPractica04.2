/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package org.uv.beans;

import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import org.uv.crud.Alumno;
import org.uv.crud.DAOAlum;

/**
 *
 * @author zarcorp
 */
@Named(value = "daoAlumno")
@ViewScoped
public class DaoAlumno implements Serializable {

    private Alumno alumno = new Alumno();
    DAOAlum dao = new DAOAlum();
    private List<Alumno> alumnosL = dao.findAll();
    private Alumno selectedAlumno;

    public Alumno getSelectedAlumno() {
        return selectedAlumno;
    }

    public void setSelectedAlumno(Alumno selectedAlumno) {
        this.selectedAlumno = selectedAlumno;
    }

    public List<Alumno> getAlumnosL() {
        return alumnosL;
    }

    public void setAlumnosL(List<Alumno> alumnos) {
        this.alumnosL = alumnos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
    public void delete(){
        
    }

}
