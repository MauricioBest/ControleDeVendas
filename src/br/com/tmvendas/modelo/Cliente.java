package br.com.tmvendas.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")


public class Cliente extends Pessoa {

	private Long cartao;

    public Long getCartao() {
        return cartao;
    }

    public void setCartao(Long cartao) {
        this.cartao = cartao;
    }

}
