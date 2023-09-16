package br.com.apex.escola.mvc.controller;

import br.com.apex.escola.mvc.model.Prova;
import br.com.apex.escola.mvc.model.ProvaDAO;
import br.com.apex.escola.mvc.model.persistence.ArrayListPersistenceProva;

public class ProvaController {

	private ProvaDAO provaDAO;
	private Prova prova;
	private ArrayListPersistenceProva dbProvas = new ArrayListPersistenceProva();

	public ProvaController(Prova prova) {
		this.provaDAO = new ProvaDAO(dbProvas);
		this.prova = prova;
	}

	public ProvaController(int index) {
		this.provaDAO = new ProvaDAO(dbProvas);
		this.prova = provaDAO.get(index);

	}

	public Prova addProva() {
		if (this.prova.getId() == 0) {
			return this.provaDAO.add(prova);
		}
		return this.prova;
	}

	public void removeProva() {
		try {
			provaDAO.remove(prova.getId());
		} catch (Exception e) {
			System.out.println("prova nao removida. erro; " + e.getMessage());
		}
	}

	public Prova get(Integer id) {
		return this.provaDAO.get(id);
	}
}
