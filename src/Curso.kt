class Curso(var nomeCurso: String, var codCurso: Int,
            var qtdAlunos: Int)  {


    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto
    lateinit var aluno: MutableList<Aluno>

    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Curso) return false

        if (codCurso != other.codCurso) return false
        return true


    }

    override fun toString(): String {
        return "$nomeCurso $codCurso $qtdAlunos"
    }
    fun adicionarUmAluno(umAluno: Aluno):Boolean{
        if(qtdAlunos<=qtdAlunos){

            return true
            aluno.add(umAluno)
        }else
            return false


    }

    fun excluirAluno(umAluno: Aluno){
        aluno.remove(umAluno)
    }


}
