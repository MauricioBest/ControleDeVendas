package br.com.tmvendas.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
public class Funcionario extends Pessoa {

	private String usuario;
	private double salario;
	private int cargaHoraria;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
