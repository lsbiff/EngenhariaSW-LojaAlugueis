package database;

import java.util.ArrayList;

import model.Aluguel;
import model.Cliente;
import model.Funcionario;
import model.Gerente;
import model.Peca;

public class Database {
	private static int pesquisa_todas = 0;
	private static int pesquisa_disponiveis = 1;
	private static int pesquisa_alugadas = 2;
	
	private Database database;
	private ArrayList<Gerente> gerentes;
	private ArrayList<Funcionario> funcionarios;
	private ArrayList<Cliente> clientes;
	private ArrayList<Aluguel> alugueis;
	private ArrayList<Peca> pecas;
	
	public Database(){
		this.setGerentes(new ArrayList<Gerente>());
		this.setFuncionarios(new ArrayList<Funcionario>());
		this.setClientes(new ArrayList<Cliente>());
		this.setAlugueis(new ArrayList<Aluguel>());
		this.setPecas(new ArrayList<Peca>());
	}

	public ArrayList<Gerente> getGerentes() {
		return gerentes;
	}

	public void setGerentes(ArrayList<Gerente> gerentes) {
		this.gerentes = gerentes;
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Aluguel> getAlugueis() {
		return alugueis;
	}

	public void setAlugueis(ArrayList<Aluguel> alugueis) {
		this.alugueis = alugueis;
	}

	public ArrayList<Peca> getPecas() {
		return this.pecas;
	}

	public void setPecas(ArrayList<Peca> estoque) {
		this.pecas = estoque;
	}
	
	public void adicionarCliente(Cliente c){
		this.clientes.add(c);
	}
	
	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

	public static int getPesquisa_todas() {
		return pesquisa_todas;
	}

	public static void setPesquisa_todas(int pesquisa_todas) {
		Database.pesquisa_todas = pesquisa_todas;
	}

	public static int getPesquisa_disponiveis() {
		return pesquisa_disponiveis;
	}

	public static void setPesquisa_disponiveis(int pesquisa_disponiveis) {
		Database.pesquisa_disponiveis = pesquisa_disponiveis;
	}

	public static int getPesquisa_alugadas() {
		return pesquisa_alugadas;
	}

	public static void setPesquisa_alugadas(int pesquisa_alugadas) {
		Database.pesquisa_alugadas = pesquisa_alugadas;
	}
	
	
}



