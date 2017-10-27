package model.user;

import java.io.Serializable;

public class Users implements Serializable {

    private int id_users;

    private String fam;

    private String name;

    private String login;

    private String pass;

    private String email;

    private Slujbi slujba;

    private Doljnost doljnost;

    /**
     * Get the value of doljnost
     *
     * @return the value of doljnost
     */
    public Doljnost getDoljnost() {
        return doljnost;
    }

    /**
     * Set the value of doljnost
     *
     * @param doljnost new value of doljnost
     */
    public void setDoljnost(Doljnost doljnost) {
        this.doljnost = doljnost;
    }

    /**
     * Get the value of slujba
     *
     * @return the value of slujba
     */
    public Slujbi getSlujba() {
        return slujba;
    }

    /**
     * Set the value of slujba
     *
     * @param slujba new value of slujba
     */
    public void setSlujba(Slujbi slujba) {
        this.slujba = slujba;
    }

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
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
     * Get the value of fam
     *
     * @return the value of fam
     */
    public String getFam() {
        return fam;
    }

    /**
     * Set the value of fam
     *
     * @param fam new value of fam
     */
    public void setFam(String fam) {
        this.fam = fam;
    }

    /**
     * Get the value of id_users
     *
     * @return the value of id_users
     */
    public int getId_users() {
        return id_users;
    }

    /**
     * Set the value of id_users
     *
     * @param id_users new value of id_users
     */
    public void setId_users(int id_users) {
        this.id_users = id_users;
    }

}
