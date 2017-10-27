/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.user;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Doljnost implements Serializable {

    private int id_doljnost;

    private String name;

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the value of id_doljnost
     *
     * @return the value of id_doljnost
     */
    public int getId_doljnost() {
        return id_doljnost;
    }

    /**
     * Set the value of id_doljnost
     *
     * @param id_doljnost new value of id_doljnost
     */
    public void setId_doljnost(int id_doljnost) {
        this.id_doljnost = id_doljnost;
    }

}
