package com.ingresso.cinema.model;

import java.time.Duration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
	public class Filme {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;
	    private String nome;
	    private Duration duracao;
	    private String genero;
	    
	    
	    
	    /**
	     * @deprecated hibernate only
	     */
	    public Filme() {

	    }
	    
	    public Filme(String nome, Duration duracao, String genero) {
			this.nome = nome;
			this.duracao = duracao;
			this.genero = genero;
		}

		public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public Duration getDuracao() {
	        return duracao;
	    }

	    public void setDuracao(long duracao) {
	        this.duracao = Duration.ofMinutes(duracao);
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	    }
	}

