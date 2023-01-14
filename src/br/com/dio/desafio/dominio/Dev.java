package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    
    private String nome;
    private Set<Conteudo> conteudoIncritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set<Conteudo> getConteudoIncritos() {
        return conteudoIncritos;
    }
    public void setConteudoIncritos(Set<Conteudo> conteudoIncritos) {
        this.conteudoIncritos = conteudoIncritos;
    }
    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }
    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudoIncritos.addAll(bootcamp.getConteudo());
        bootcamp.getDevsInsritos().add(this);
    }
    public void progredir() {
       Optional<Conteudo> conteudo = this.conteudoIncritos.stream().findFirst();
       if(conteudo.isPresent()) {
        this.conteudoConcluidos.add(conteudo.get());
        this.conteudoIncritos.remove(conteudo.get());
       }else {
        System.err.println("Você não esta matriculado em nenhum conteudo.");
       }
    }
    public double calcularTotalXP() {
        return this.conteudoConcluidos
        .stream()
        .mapToDouble(Conteudo::calcularXP)
        .sum();
    }


    
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoIncritos, dev.conteudoIncritos) && Objects.equals(conteudoConcluidos, dev.conteudoConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoIncritos, conteudoConcluidos);
    }
}