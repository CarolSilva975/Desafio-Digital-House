
fun main() {

    var aluno = Aluno("Carol", "Silva", 34)
    var aluno1 = Aluno("Carol", "Silva", 35)
    println(aluno.equals(aluno1))

    //var curso = Curso("besteira",123,3)

    //var matricula = Matricula(aluno,curso )

    var digitalHouseManager = DigitalHouseManager()

   // println(matricula.dataFormatada)
    digitalHouseManager.registrarCurso("Android",20002,12)

    digitalHouseManager.registrarCurso("Fulstack",20001,13)
    digitalHouseManager.listaCurso.forEach{ println(it)}

    digitalHouseManager.excluirCurso(20001)
    digitalHouseManager.listaCurso.forEach{ println(it)}
  //  digitalHouseManager.registrarProfessorAdjunto("Vitoria","Gonçalves",12,34)
    //digitalHouseManager.listaProfessor.forEach{ println(it)}


}