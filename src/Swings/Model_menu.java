/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swings;

import javax.swing.Icon;

/**
 *
 * @author user
 */
public class Model_menu {

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the imgage
     */
    public Icon getImgage() {
        return imgage;
    }

    /**
     * @param imgage the imgage to set
     */
    public void setImgage(Icon imgage) {
        this.imgage = imgage;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    private int number;
    private String name;
    private String description;
    private Icon imgage;
    private double amount;

    public Model_menu() {
    }

    public Model_menu(int number, String name, String description, Icon imgage, double amount) {
        this.number = number;
        this.name = name;
        this.description = description;
        this.imgage = imgage;
        this.amount = amount;
    }
    
    
}
