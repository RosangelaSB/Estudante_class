package Modelo;


public class EstudanteM {
    String nome, curso, disciplina;
    int ano;

    public void setNome(String n){
        this.nome=n;
    }
    public void setCurso(String c){
        this.curso=c;
    }
    public void setDisciplina(String d){
        this.disciplina=d;
    }
    public void setAno(int a){
        this.ano=a;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getCurso(){
        return this.curso;
    }
    public String getDisciplina(){
        return this.disciplina;
    }
    public int getAno(){
        return this.ano;
    }
}
