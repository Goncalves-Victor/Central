/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.central;


/**
 *
 * @author Joao
 */
public class Professor extends Pessoa{
String senha;
Disciplina disciplina;
static int qtProfessor = 0;



    public Professor(String senha, Disciplina disciplina, String nome, String cpf, int idade, String naturalidade) {
        super(nome, cpf, idade, naturalidade);
        this.disciplina = disciplina;
        this.senha = senha;
        qtProfessor++;
    }
    
    public static int getQtProfessor() {
        return qtProfessor;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    
    
}
