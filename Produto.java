package semana06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Produto implements Serializable {
	
	private int codigo;
	private String descricao;
	private double valor;
	
	
	
	public String toString() {
		return "["+codigo+","+descricao+","+valor+"]";
	}
	
	public Produto ler(int codigo) {
		
		try {
			FileInputStream out = new FileInputStream(new File("C:\\Users\\mathe\\Downloads/temp/"+codigo+".txt"));
			ObjectInputStream ois = new ObjectInputStream(out);
			Produto p = (Produto) ois.readObject();
			ois.close();
			return p;
		}
		catch(Exception erro) {
			return  null;
		}
		
	}
	
	/**
	 * Grava em arquivo .txt o estado atual do objeto
	 * @return - uma mensagem informando o resultado da gravaÃ§Ã£o
	 */
	public String gravar() {
		String r = "";
		try {
			FileOutputStream out = new FileOutputStream(new File("C:\\Users\\mathe\\Downloads/temp/"+codigo+".txt"));
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(this);
			out.close();
			r = "Produto armazenado com sucesso!";
		}
		catch(IOException erro) {
			r = "Falha na gravação "+erro;
		}
		return r;
	}
	
	public void mostrar() {
		System.out.println("O código é "+getCodigo());
		System.out.println("A descrição é " + getDescricao());
		System.out.println("O valor é " +getValor());
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	
	
}
