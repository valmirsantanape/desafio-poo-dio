package br.com.dio.desafio.dominio;

public class Cursos extends Conteudo {
    
    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    public Cursos() {

    }

    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String toString() {
        return "Curso{" + 
                "titulo: '" + getTitulo() + '\'' +
                ", descricao: '" + getDescricao() + '\'' +
                ", cargaHoraria" + cargaHoraria +
                '}' ;
    }


    

}
