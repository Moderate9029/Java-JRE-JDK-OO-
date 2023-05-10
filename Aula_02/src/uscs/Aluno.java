package uscs;

public class Aluno {

	public String nome;
	public int codmat;
	public String cpf;
	public char sexo;
	public double notaP1, notaP2, notaP3;
	
	public Aluno(String nome, int codmat, String cpf, char sexo, double notaP1, double notaP2, double notaP3) {
		this.nome = nome;
		this.codmat = codmat;
		this.cpf = cpf;
		this.sexo = sexo;
		this.notaP1 = notaP1;
		this.notaP2 = notaP2;
		this.notaP3 = notaP3;
	}
	
	public void imprimeAluno() {
		System.out.println("/////////////////////////////");
		System.out.println("||Nome      || " + this.nome);
		System.out.println("||Matrícula || " + this.codmat);
		System.out.println("||CPF       || " + this.cpf);
		System.out.println("||Sexo      || " + this.sexo);
		System.out.println("||Nota 1    || " + this.notaP1);
		System.out.println("||Nota 2    || " + this.notaP2);
		System.out.println("||Nota 3    || " + this.notaP3);
		System.out.println("||Media     || " + mediaAluno());
		System.out.println("/////////////////////////////");
	}
	
	public double mediaAluno() {
		return ((this.notaP1 + this.notaP2 + this.notaP3)/3);
	}
	
	public void imprimeResultadoAluno() {
		if(mediaAluno() >= 6)
			System.out.println("||Aprovado");
		else
			System.out.println("||Reprovado");
	}
	
	
}
