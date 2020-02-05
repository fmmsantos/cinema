package com.ingresso.cinema.model.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.ingresso.cinema.model.Lugar;

public class LugarForm {
    @NotBlank
    private String fileira;
    @NotNull
    private Integer posicao;
    private Integer salaId;

    public String getFileira() {
        return fileira;
    }

    public void setFileira(String fileira) {
        this.fileira = fileira;
    }

    public Integer getSalaId() {
        return salaId;
    }

    public void setSalaId(Integer salaId) {
        this.salaId = salaId;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    public Lugar toLugar() {
        return new Lugar(fileira, posicao);
    }


}
