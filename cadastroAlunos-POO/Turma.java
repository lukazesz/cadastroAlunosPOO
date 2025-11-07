public class Turma {
    private Aluno[] alunos;
    private int quantidade;

    public Turma(){
       alunos = new Aluno[5];
       quantidade = 0;
    }

    
    public void adicionarAluno (Aluno aluno){
        if(quantidade < alunos.length){
            alunos[quantidade] = aluno;
            quantidade++;
        }
    }

    public void listarAlunos(){
        for(int i = 0; i < quantidade; i ++){
            alunos[i].exibirInfo();
        }
    }

    public Aluno buscarPorMatricula(String mString){
        for(int i = 0; i < quantidade; i ++){
            if(alunos[i] != null && alunos[i].getMatricula().equals(matricula)){
                return alunos[i];
            }
        }
        return null;
    }
}

