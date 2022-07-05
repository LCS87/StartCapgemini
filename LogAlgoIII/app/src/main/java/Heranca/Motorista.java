/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

import java.util.Date;

/**
 *
 * @author leandro
 */
       /*
    Está extendendo de funcionário pois o motorista é um tipo de funcionário,
    assim fica caracterizado a necessidade do uso da herança
*/
public class Motorista extends Funcionario {
    
    //Construtor do Motorista
    public Motorista(String nome, Date dataNascimento, String cpf, Double salario) {
        /*
            Note que é chamado o construtor da classe Pai (Funcionário),
            para isso é feito o uso do recurso "super" que chama o construtor
            da classe pai
        */
        super(nome, dataNascimento, cpf, salario);
    }
}
