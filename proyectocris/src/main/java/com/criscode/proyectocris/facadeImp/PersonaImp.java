package com.criscode.proyectocris.facadeImp;
import com.criscode.proyectocris.facade.IPersona;
import com.criscode.proyectocris.modelo.Persona;
import com.criscode.proyectocris.utilities.JPAUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PersonaImp implements IPersona {
	EntityManager entity = JPAUtil.get.EntityManagerFactory().createEntityManage;
    List<Persona> listPersonas = new ArrayList<Persona>();
    
    @Override
    public List<Persona> findAll(){
    	try {
    		this.entity.getTransaction().begin();
    		Query q = this.entity.createQuery("SELECT p FROM Persona p");
    		this.listPersonas= q getResultList();
    	} catch (Exception.e) {
    		JPAUtil.shutdown();
    	}finally {
    		if (this.entity !=null {
    	}
    }
    	return this.listPersonas;
    }
    @Override
    public void add(Persona persona);
    try {
    	
    }
}
