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
public class Slujbi implements Serializable {

    private int id_slujbi;

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
     * Get the value of id_slujbi
     *
     * @return the value of id_slujbi
     */
    public int getId_slujbi() {
        return id_slujbi;
    }

    /**
     * Set the value of id_slujbi
     *
     * @param id_slujbi new value of id_slujbi
     */
    public void setId_slujbi(int id_slujbi) {
        this.id_slujbi = id_slujbi;
    }

}
