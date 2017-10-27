/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.log;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author User
 */
public class LogErrorAuth implements Serializable {

    private int id_log;

    private String ipAdress;

    private String login;

    private String pass;

    private Timestamp dateLogIn;

    /**
     * Get the value of dateLogIn
     *
     * @return the value of dateLogIn
     */
    public Timestamp getDateLogIn() {
        return dateLogIn;
    }

    /**
     * Set the value of dateLogIn
     *
     * @param dateLogIn new value of dateLogIn
     */
    public void setDateLogIn(Timestamp dateLogIn) {
        this.dateLogIn = dateLogIn;
    }

    /**
     * Get the value of pass
     *
     * @return the value of pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * Set the value of pass
     *
     * @param pass new value of pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * Get the value of login
     *
     * @return the value of login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Set the value of login
     *
     * @param login new value of login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Get the value of ipAdress
     *
     * @return the value of ipAdress
     */
    public String getIpAdress() {
        return ipAdress;
    }

    /**
     * Set the value of ipAdress
     *
     * @param ipAdress new value of ipAdress
     */
    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    /**
     * Get the value of id_log
     *
     * @return the value of id_log
     */
    public int getId_log() {
        return id_log;
    }

    /**
     * Set the value of id_log
     *
     * @param id_log new value of id_log
     */
    public void setId_log(int id_log) {
        this.id_log = id_log;
    }

}
