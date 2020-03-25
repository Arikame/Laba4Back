package aleks.aleks.orm;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Table(name = "users")
@Entity
public class User {

    @Id
    @GeneratedValue(generator="GENERATOR_COMMON")
    @GenericGenerator(name="GENERATOR_COMMON",strategy="increment")
    @Column(name = "id")
    private int id;


    @Column(name = "login", unique = true)
    private String login;
    @Column(name = "password")
    private String password;


    @Column(name = "selectedX")
    private float selectedX = 0;

    @Column(name = "selectedY")
    private String selectedY = "";

    @Column(name = "selectedR")
    private float selectedR = 2;

    public User(String login) {
        this.login = login;
    }

    public User() {

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public float getSelectedX() {
        return selectedX;
    }

    public void setSelectedX(float selectedX) {
        System.out.println("smena x" + selectedX + getLogin());
        this.selectedX = selectedX;
    }

    public String getSelectedY() {
        return selectedY;
    }

    public void setSelectedY(String selectedY) {
        System.out.println("smena y" + selectedY + getLogin());
        this.selectedY = selectedY;
    }

    public float getSelectedR() {
        return selectedR;
    }

    public void setSelectedR(float selectedR) {
        this.selectedR = selectedR;
    }
}
