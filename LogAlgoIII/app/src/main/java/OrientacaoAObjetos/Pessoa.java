/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacaoAObjetos;

/**
 *
 * @author leandro
 */
class Pessoa {
    //Atributos de uma pessoa, necess�rios para a resolu��o do problema
    public float peso;
    public float altura;

    //Construtor
    Pessoa() {

    }
    
    //A��o que a pessoa pode executar
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    } 
}
