/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.central;
import java.util.List;
/**
 *
 * @author ice
 */
public class Disciplina {
String nome;
int cHoraria;
private List<Professor> docentes;
int nDocentes;
    public Disciplina(String nome, int cHoraria, Professor p) {
        this.nome = nome;
        this.cHoraria = cHoraria;
        this.docentes.add(p);
        this.nDocentes = docentes.size();
    }
  

}
