package br.projeto.aula.classes;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Tecnico {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;	
	
	private String nome;
	
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	private LocalDate datanasci;
	
	private Double salario;
	
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
	public LocalDate getDatanasci() {
		return datanasci;
	}
	public void setDatanasci(LocalDate datanasci) {
		this.datanasci = datanasci;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
