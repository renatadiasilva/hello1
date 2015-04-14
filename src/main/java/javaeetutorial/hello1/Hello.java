/**
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package javaeetutorial.hello1;

// cuidado não importar o javax.faces.bean
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
//@Model can also be used (Session)
public class Hello {
	
	//Não fazer new's
//	@Inject
//	private Hello hello2; //Hello.hello2

    private String name;

    public Hello() {
    }

    public String getName() {
//        String initP = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("meuparametro");        
//      int intPI=Integer.getInteger(initP);
//        return name+" "+initP;
    	return name;
    }

    

    public void setName(String user_name) {
        
        String initP = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("meuparametro");        
//        int intPI=Integer.getInteger(initP);

        name=user_name+" "+initP;
        // flash sobrevive a uma iteração (perguntar Emília)
//        FacesContext.getCurrentInstance().getExternalContext().getFlash().put("hello",name);
               
    }
}

