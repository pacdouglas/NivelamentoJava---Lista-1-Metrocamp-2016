package ExerciciosNivelamento;

public class Pessoa {
	private String nome;
	private double peso;
	
	public Pessoa(){
		
	}
	public Pessoa(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public static String maisPesada(Pessoa p1,Pessoa p2){
		if(p1.peso>p2.peso){
			return p1.getNome();
		}else{
			return p2.getNome();
		}
	}
}
