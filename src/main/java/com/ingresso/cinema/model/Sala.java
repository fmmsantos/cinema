package com.ingresso.cinema.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
	public class Sala {

	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Integer id;

	    private String nome;

	    @OneToMany(fetch = FetchType.EAGER)
	    private Set<Lugar> lugares = new HashSet<>();

	    /**
	     * @deprecated hibernate only
	     */
	    public Sala() {

	    }

	    public Sala(String nome) {
	        this.nome = nome;
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


	    public void add(Lugar lugar) {
	        this.lugares.add(lugar);
	    }

	    public Set<Lugar> getLugares() {
	        return lugares;
	    }

	    public void setLugares(Set<Lugar> lugares) {
	        this.lugares = lugares;
	    }

	    public Map<String, List<Lugar>> getMapaDeLugares() {
	        if(!this.lugares.isEmpty()){
	            return this.lugares.stream().collect(Collectors.groupingBy(Lugar::getFileira,Collectors.toList()));
	        }
	        return Collections.emptyMap();
	    }

	    public Integer lugar(String fileira, Integer posicao){
	        Optional<Lugar> optional = this.lugares.stream().filter((x) -> fileira.equals(x.getFileira()) && posicao.equals(x.getPosicao())).findFirst();
	        return optional.get().getId();
	    }
	}


