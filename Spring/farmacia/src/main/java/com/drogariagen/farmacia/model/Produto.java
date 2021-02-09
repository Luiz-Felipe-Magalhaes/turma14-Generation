package com.drogariagen.farmacia.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@Entity
@Table (name = "tb_produto")
public class Produto 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@NotNull
	@Column(name = "nome_produto")
	private String nome;
	
	@NotNull
	@Digits (integer = 4, fraction = 2)
	@Min (0)
	@Column (name = "preco")
	private BigDecimal preco;
	
	
	@NotNull
	@Column (name = "qtd_estoque")
	private int qtdEstoque;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}


}
