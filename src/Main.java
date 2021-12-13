import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso POO em Java");
		curso1.setDescricao("Descri��o POO em Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso POO em Js");
		curso2.setDescricao("Descri��o POO em Js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria em Java");
		mentoria.setDescricao("Descri��o da mentoria Java");
		mentoria.setData(LocalDate.now());
		
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
	}

}
