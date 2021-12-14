package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		/*int a  = 2;
		int b = 3;
		System.out.println("Hello World! " +(a+b));
*/
		Gato gato = new Gato("mike","azul", 25);
		Pessoa pessoa = new Pessoa("Bruno",25);
		
		System.out.println(gato);
		System.out.println(pessoa);
		
	}

}
class Pessoa{
	private String nome;
	private Integer idade;
	
	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
}