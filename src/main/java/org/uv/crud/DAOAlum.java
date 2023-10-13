/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.crud;

import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author zarcorp
 */
public class DAOAlum implements IDAOGeneral<Alumno, Long> {

//    @Override
//    public Empleado create(Empleado p) {
//        Session session = HibernateUtil.getSession();
//        Transaction t = session.beginTransaction();
//
//        t.commit();
//        session.save(p);
//        session.close();
//        return p;
//    }
//
//    @Override
//    public boolean delete(Long id) {
//        Session session = HibernateUtil.getSession();
//        Transaction t = session.beginTransaction();
//        Empleado emp = findById(id);
//        boolean b = false;
//
//        if (emp != null) {
//            session.delete(emp);
//            t.commit();
//            session.close();
//            JOptionPane.showMessageDialog(null, "Nombre: " + emp.getNombre() + " Clave: " + emp.getClave(), "Empleado Eliminado:", JOptionPane.INFORMATION_MESSAGE);
//            return true;
//        }
//
//        return b;
//    }
//
//    @Override
//    public Empleado update(Long id, Empleado p) {
//        Session session = HibernateUtil.getSession();
//        Transaction t = session.beginTransaction();
//        Empleado emp = findById(id);
//
//        if (emp != null) {
//            session.update(p);
//            t.commit();
//            session.close();
//            JOptionPane.showMessageDialog(null,emp.getNombre() + " ---> " + p.getNombre(), "Empleado Actualizado:", JOptionPane.INFORMATION_MESSAGE);
//        }
//
//        return p;
//
//    }

    @Override
    public List<Alumno> findAll() {
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();

        Query query = session.createNativeQuery("SELECT * FROM pejemplo", Alumno.class);
        List<Alumno> lemp = query.getResultList();
        t.commit();
        session.close();

        if (lemp == null) {
            JOptionPane.showMessageDialog(null, "La base de datos se encuentra vacia", "Error", JOptionPane.ERROR_MESSAGE);
            session.close();
            return null;
        }

        return lemp;
    }

//    @Override
//    public Empleado findById(Long id) {
//        Session session = HibernateUtil.getSession();
//        Empleado emp = session.get(Empleado.class, id);
//
//        if (emp == null) {
//            JOptionPane.showMessageDialog(null, "Empleado no se encuentra en la Base de Datos", "Error", JOptionPane.ERROR_MESSAGE);
//            session.close();
//            return null;
//        }
//
//        session.close();
//        return emp;
//    }

    @Override
    public Alumno create(Alumno p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Alumno update(Long id, Alumno p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Alumno findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
