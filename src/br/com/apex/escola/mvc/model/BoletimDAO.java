package br.com.apex.escola.mvc.model;

import br.com.apex.escola.mvc.model.persistence.ArrayListPersistenceBoletim;

public class BoletimDAO {

	ArrayListPersistenceBoletim db;
	
	
	//construtor
	//inicializar classe
    public BoletimDAO(ArrayListPersistenceBoletim db) {
    	this.db = db;
    	
    }
   
    public void removeALL() {
    	db.removerALL();
    	
    }
    public void remove(Integer index) {
    	db.remove(index);
    }
    public Boletim add(Boletim boletim) {
    	return db.add(boletim);
    }
    
    public Boletim get(int index) {
    	return db.get(index);
    }
}
