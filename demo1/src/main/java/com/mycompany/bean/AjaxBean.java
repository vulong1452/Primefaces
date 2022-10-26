/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.bean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author admin
 */
@ManagedBean
@Named(value = "ajaxBean")
@RequestScoped
public class AjaxBean {
    private String name;
    /**
     * Creates a new instance of AjaxBean
     */
    public AjaxBean() {
    }
    
    public String getMessage(){
        return "Welcome " + this.name;
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
    
}
