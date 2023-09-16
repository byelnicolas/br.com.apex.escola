package br.com.apex.escola.mvc.model.persistence;

import java.util.ArrayList;

import br.com.apex.escola.mvc.model.Prova;

public class ArrayListPersistenceProva extends ArrayListPersistence<Prova> {

	public ArrayList<Prova> dados = new ArrayList<Prova>();

	@Override
	public boolean removerALL() {
		try {
			dados.clear();
		} catch (Exception e) {
			System.out.print(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public boolean remove(Integer indexItem) {
		try {
			dados.remove((int) indexItem);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public Prova add(Prova item) {
		try {
			Integer id = dados.size();
			item.setId(id);
			dados.add(item);
			return item;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}

	@Override
	public Prova get(Integer index) {
		try {
			return dados.get(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}

	@Override
	public ArrayList<Prova> getALL() {
		try {
			return dados;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
