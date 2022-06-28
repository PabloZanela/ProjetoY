package Model;

import java.util.*;
import DAO.ClienteDAO;

public class Cliente extends Pessoa {

    // Atributos
    private String telefone;
    private String cpf;

    // M�todo Construtor de Objeto Vazio
    public Cliente() {
    }

    // M�todo Construtor de Objeto, inserindo dados
    public Cliente(String telefone, String cpf) {
        this.telefone = telefone;
        this.cpf = cpf;
    }

    // M�todo Construtor usando tamb�m o construtor da SUPERCLASSE
    public Cliente(String telefone, String cpf, int id, String nome, int idade) {
        super(id, nome, idade);
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    // Override necess�rio para poder retornar os dados de Pessoa no toString para aluno.
    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Idade: " + this.getIdade()
                + "\n Telefone: " + this.getTelefone()
                + "\n CPF:" + this.getCpf()
                + "\n -----------";
    }

    /*
    
        ABAIXO OS M�TODOS PARA USO JUNTO COM O DAO
        SIMULANDO A ESTRUTURA EM CAMADAS PARA USAR COM BANCOS DE DADOS.
    
     */
    // Retorna a Lista de Alunos(objetos)
    public ArrayList getMinhaLista() {
        return ClienteDAO.MinhaLista;
    }

    // Cadastra novo aluno
    public boolean InsertAlunoBD(String telefone, String cpf, String nome, int idade) {
        int id = this.maiorID() + 1;
        Cliente objeto = new Cliente(telefone, cpf, id, nome, idade);
        ClienteDAO.MinhaLista.add(objeto);
        return true;

    }

    // Deleta um aluno espec�fico pelo seu campo ID
    public boolean DeleteClienteBD(int id) {
        int indice = this.procuraIndice(id);
        ClienteDAO.MinhaLista.remove(indice);
        return true;
    }

    // Edita um aluno espec�fico pelo seu campo ID
    public boolean UpdateClienteBD(String telefone, String cpf, int id, String nome, int idade) {
        Cliente objeto = new Cliente(telefone,cpf, id, nome, idade);
        int indice = this.procuraIndice(id);
        ClienteDAO.MinhaLista.set(indice, objeto);
        return true;
    }

    // procura o INDICE de objeto da MinhaLista que contem o ID enviado.
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < ClienteDAO.MinhaLista.size(); i++) {
            if (ClienteDAO.MinhaLista.get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }

    // carrega dados de um aluno espec�fico pelo seu ID
    public Cliente carregaCliente(int id) {
        int indice = this.procuraIndice(id);
        return ClienteDAO.MinhaLista.get(indice);
    }
    
    // retorna o maior ID da nossa base de dados
    public int maiorID(){
        return ClienteDAO.maiorID();
    }   
}
