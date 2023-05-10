package uscs;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno a = new Aluno("Paulo",
							55123,
							"8000912345-12",
							'M',
							7.0,
							6.0,
							8.0);
		
		a.imprimeAluno();
		a.imprimeResultadoAluno();
	}
}
