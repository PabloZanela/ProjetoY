package Model;

import java.util.*;
import DAO.FuncionarioDAO;

public class Funcionario extends Pessoa {

// Atributos
    private String cargo;
    private String CEP;

// M�todo Construtor de Objeto Vazio
    public Funcionario() {
    }
    // M�todo Construtor de Objeto, inserindo dados

    public Funcionario(String cargo, String CEP) {
        this.cargo = cargo;
        this.CEP = CEP;
    }
    // M�todo Construtor usando tamb�m o construtor da SUPERCLASSE

    public Funcionario(String cargo, String CEP, int id, String nome, int idade) {
        super(id, nome, idade);
        this.cargo = cargo;
        this.CEP = CEP;
    }
    // M�todos GET e SET

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    // Override necess�rio para poder retornar os dados de Pessoa no toString para aluno.

    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Idade: " + this.getIdade()
                + "\n Curso: " + this.getCargo()
                + "\n Fase:" + this.getCEP()
                + "\n -----------";
    }
    /*
        ABAIXO OS M�TODOS PARA USO JUNTO COM O DAO
        SIMULANDO A ESTRUTURA EM CAMADAS PARA USAR COM BANCOS DE DADOS.
    
     */
    // Retorna a Lista de Funcionarios(objetos)
    public ArrayList getMinhaLista() {
        return FuncionarioDAO.MinhaLista;
    }

    // Cadastra novo Funcionario
    public boolean InsertFuncionarioBD(String cargo, String CEP, String nome, int idade) {
        int id = this.maiorID() + 1;
        Funcionario objeto = new Funcionario(cargo, CEP, id, nome, idade);
        FuncionarioDAO.MinhaLista.add(objeto);
        return true;
    }
    // Deleta um Funcionario espec�fico pelo seu campo ID
    public boolean DeleteAlunoBD(int id) {
        int indice = this.procuraIndice(id);
        FuncionarioDAO.MinhaLista.remove(indice);
        return true;
    }
    
    // Edita um Funcionario espec�fico pelo seu campo ID
    public boolean UpdateFuncionarioBD(String cargo, String CEP,int id, String nome, int idade) {
        Funcionario objeto = new Funcionario(cargo, CEP, id, nome, idade);
        int indice = this.procuraIndice(id);
        FuncionarioDAO.MinhaLista.set(indice, objeto);
        return true;
    }
    // procura o INDICE de objeto da MinhaLista que contem o ID enviado.
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < FuncionarioDAO.MinhaLista.size(); i++) {
            if (FuncionarioDAO.MinhaLista.get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }

    // carrega dados de um aluno espec�fico pelo seu ID
    public Funcionario carregaFuncionario(int id) {
        int indice = this.procuraIndice(id);
        return FuncionarioDAO.MinhaLista.get(indice);
    }
    
    // retorna o maior ID da nossa base de dados
    public int maiorID(){
        return FuncionarioDAO.maiorID();
    }   
}
