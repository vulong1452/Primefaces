/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UISelectMany;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author admin
 */
@FacesValidator("LanguageValidator")
public class LanguageValidator implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object t) throws ValidatorException {
        //Lay ra truong ngon ngu
        UISelectMany lng = (UISelectMany) uic.findComponent("chkNgonNgu");
        
        if (t.toString().isEmpty() && lng.getSelectedValues().length == 0) {
            FacesMessage m = new FacesMessage("Vui long chon 1 ngon ngu yeu thich");
            m.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw  new ValidatorException(m);
        }
        
        
       
    }
    
}
