/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.central;
import java.util.*;
/**
 *
 * @author Joao
 */
public class Turma {
char identificador;
float notaMedia;
String professor;
String horaLocal;
int qtAlunos;
private List<Aluno> alunos;
private List<Professor> professores;

    public Turma(char identificador, float notaMedia, String professor, String horaLocal, int qtAlunos, String senha, Disciplina disciplina, String nome, String cpf, int idade, String naturalidade) {
       
        this.identificador = identificador;
        this.notaMedia = notaMedia;
        this.professor = professor;
        this.horaLocal = horaLocal;
        this.qtAlunos = qtAlunos;
    }

    public char getIdentificador() {
        return identificador;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public String getProfessor() {
        return professor;
    }

    public String getHoraLocal() {
        return horaLocal;
    }

    public int getQtAlunos() {
        return qtAlunos;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setHoraLocal(String horaLocal) {
        this.horaLocal = horaLocal;
    }

    public void setQtAlunos(int qtAlunos) {
        this.qtAlunos = qtAlunos;
    }
    
    public void addAlunos(Aluno a)
    {
    alunos.add(a);
    setQtAlunos(alunos.size());
    float soma = 0;
        for(int i=0; i<qtAlunos; i++)
        {
        soma = alunos.get(i).getNota() + soma;
        }
    setNotaMedia(soma/qtAlunos);
    }
    
    public void removeAlunos(String matricula)
    {
        for(int i=0; i< alunos.size(); i++)
        {
            if(matricula == alunos.get(i).getMatricula())
            {
            alunos.remove(i);
            }
        }
    setQtAlunos(alunos.size());
    float soma = 0;
        for(int i=0; i<qtAlunos; i++)
        {
        soma = alunos.get(i).getNota() + soma;
        }
    setNotaMedia(soma/qtAlunos);
    }
    



    
    
    
    
}
