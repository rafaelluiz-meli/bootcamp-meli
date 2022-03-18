package com.mercadolivre.entities;

import java.util.List;

public class Curriculo {

   private Pessoa pessoa;
   private List<String> habilidades;

   public Curriculo(Pessoa pessoa, List<String> habilidades) {
      this.pessoa = pessoa;
      this.habilidades = habilidades;
   }

   public Pessoa getPessoa() {
      return pessoa;
   }

   public void setPessoa(Pessoa pessoa) {
      this.pessoa = pessoa;
   }

   public List<String> getHabilidades() {
      return habilidades;
   }

   public void addHabilidade(String habilidade) {
      habilidades.add(habilidade);
   }

   public void removeHabilidade(String habilidade) {
      habilidades.remove(habilidade);
   }

   @Override
   public String toString() {
      return "Curriculo{" +
              pessoa +
              ", habilidades=" + habilidades +
              '}';
   }
}
