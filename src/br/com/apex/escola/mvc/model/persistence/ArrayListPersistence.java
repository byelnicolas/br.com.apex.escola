package br.com.apex.escola.mvc.model.persistence;

import java.util.ArrayList;

abstract public class ArrayListPersistence<T> {

	ArrayList<T> dados;

	abstract boolean removerALL();

	abstract boolean remove(Integer indexItem);

	abstract T add(T item);

	abstract T get(Integer index);

	abstract ArrayList<T> getALL();
}
