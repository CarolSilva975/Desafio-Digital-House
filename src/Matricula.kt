import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
class Matricula(var aluno:Aluno,var curso:Curso) {

    val current = LocalDateTime.now()

    val data = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
    val dataFormatada = current.format(data)



}