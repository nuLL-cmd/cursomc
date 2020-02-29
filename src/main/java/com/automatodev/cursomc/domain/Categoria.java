package com.automatodev.cursomc.domain;

import java.io.Serializable;


public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nm_categoriaString;
	private Integer id;
	
	public Categoria() {
		
	}

	public Categoria(Integer id, String nm_categoriaString) {
		super();
		this.nm_categoriaString = nm_categoriaString;
		this.id = id;
	}

	public String getNm_categoriaString() {
		return nm_categoriaString;
	}

	public void setNm_categoriaString(String nm_categoriaString) {
		this.nm_categoriaString = nm_categoriaString;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	


	
	
}