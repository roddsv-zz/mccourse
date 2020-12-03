package com.rodrigo.mccourse.domain;

import java.io.Serializable;

//As classes de domínio devem todas ficar no pacote 'domain';

/*Para se criar uma classe de domínio devemos seguir os passos:
 1. Criar os atributos básicos;
 2. Fazer as associações (iniciando as coleções);
 3. Utilizar os construtores (sem incluir coleções no construtor com parâmetros);
 4. Getters e Setters;
 5. hashCode e equals (implementação padrão: somente id - O hashCode e equals em Java servem para que dois objetos possam
 ser comparados pelo seu conteúdo e não pelo ponteiro de memória. Ou seja, somente o que difere um objeto do outro será o id.
 6. Serializable (padrão: 1L) - interface que permite à classe ter os seus objetos convetidos em uma sequência de bytes.
 */

public class Category implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;

	public Category() {}

	public Category(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
}
