/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilhadinamica11;

/**
 *
 * @author deborah
 */
public class CelulaPilha {
    char caracter;
    CelulaPilha anterior;
    
    CelulaPilha(){
    }
    
    CelulaPilha(char caracter, CelulaPilha anterior){
        this.caracter = caracter;
        this.anterior = anterior;
    }
    
    char getDado(){
        return this.caracter;
    }
    
    void setDado(char caracter){
        this.caracter = caracter;
    }

    CelulaPilha getAnterior() {
        return this.anterior;
    }

    void setAnterior(CelulaPilha anterior) {
        this.anterior = anterior;
    }
}
