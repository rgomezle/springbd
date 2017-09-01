package com.roloapps.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.roloapps.beans.Marca;
import com.roloapps.service.ServiceMarca;

public class App 
{
    public static void main( String[] args )
    {
     
    	Marca mar = new Marca();
    	mar.setId(3);
    	mar.setNombre("Umbro");
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/roloapps/xml/beans.xml");  
    	
    	ServiceMarca sm = (ServiceMarca)appContext.getBean("serviceMarcaImpl");
    	
    	Marca marca3 = (Marca) appContext.getBean("marca3");
    	try {
			sm.registrar(marca3);
		} catch (Exception e) {
			
		}
    }
}
