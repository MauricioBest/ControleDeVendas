package br.com.tmvendas.modelo;

import java.util.List;

public class Caixa {

	private Usuario usuario;
	private double valorInicialCaixa;
	private double valorTotal; // Valor no caixa menos o valor inicial contido
	private List<Cliente> clientes;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public double getValorInicialCaixa() {
		return valorInicialCaixa;
	}

	public void setValorInicialCaixa(double valorInicialCaixa) {
		this.valorInicialCaixa = valorInicialCaixa;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
