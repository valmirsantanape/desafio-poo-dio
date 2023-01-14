package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    
    private  LocalDate date;
    
     @Override
    public double calcularXP() {
        
        return XP_PADRAO + 20;
    }

    public Mentoria() {

    }

    
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String toString() {
        return "Mentoria{" + 
                "titulo: '" + getTitulo() + '\'' +
                ", descricao: '" + getDescricao() + '\'' +
                ", data: " + date +
                '}' ;
                

    }


   
}
