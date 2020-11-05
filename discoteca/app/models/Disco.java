package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import controllers.util.Condicao;
import controllers.util.DiscoDto;
import io.ebean.Model;
import io.ebean.annotation.NotNull;

@Entity
@Table(name="discos")
public class Disco extends Model{
	
	public Disco(DiscoDto dto) {
		titulo = dto.titulo;
	}

	@Id
	public Long id;
	
	@NotNull
	public String titulo;
	
	public String artista;
	
	@NotNull
	public Boolean gravado;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	public Condicao condicao;
	
	
	

}
