/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.toulouse.miage;

import javax.ejb.Local;

/**
 *
 * @author ludoviclajournade
 */
@Local
public interface GestionSallesLocal {
    String getSalles() throws Exception;
    void creeSalle(String nom, Integer capacite) throws Exception;
}
