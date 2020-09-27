class DigitalHouseManager() {


    val listaCurso = mutableListOf<Curso>()


    var listaProfessor = mutableListOf<Professor>()
    var listaProfessorTitular = mutableListOf<Professor>()


    lateinit var matricuça: MutableList<Matricula>


    fun registrarCurso(nome: String, codCurso: Int, quantidadeMaximaDeAlunos: Int) {
        listaCurso.add(Curso(nome, codCurso, quantidadeMaximaDeAlunos))

    }

    fun excluirCurso(codigoCurso: Int) {


        for (Curso in listaCurso) {
            if (Curso.codCurso==codigoCurso) {
                listaCurso.remove(Curso)

            }


        }

    }
}
// fun registrarProfessorAdjunto(nome: String , sobrenome: String ,
// codigoProfessor: Int, quantidadeDeHoras:Int){
// listaProfessor.add(ProfessorAdjunto(nome,sobrenome,codigoProfessor,quantidadeDeHoras))
//
// }
// fun registrarProfessorTitular(nome: String , sobrenome: String,codigoProfessor: Int, especialidade: String){
// listaProfessorTitular.add(ProfessorTitular(codigoProfessor,especialidade,sobrenome,nome))
// }
// fun excluirProfessor(codigoProfessor: Int){
//
// }