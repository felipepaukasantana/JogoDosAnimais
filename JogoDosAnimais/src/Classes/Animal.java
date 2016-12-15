package Classes;

import java.util.LinkedList;
import javax.swing.JOptionPane;



public class Animal {
	
	private String Caracteristica;
	private String Nome;
	public Animal aquatico;
	public Animal animal;
	public LinkedList<Animal> filho;
	
	public Animal(String caracteristica, String nome){
		setCaracteristica(caracteristica);
		setNome(nome);
		this.filho = new LinkedList<>();
	}
	
	public Animal(){
		
	}
	
	public String getCaracteristica() {
		return Caracteristica;
	}
	public void setCaracteristica(String caracteristica) {
		Caracteristica = caracteristica;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public void Perguntar(){
		for (Animal animal : this.filho) {
			if (JOptionPane.showConfirmDialog(null,"O animal que você pensou " + animal.getCaracteristica() +" ?","Animal",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
				if (JOptionPane.showConfirmDialog(null,"O animal que você pensou é o " + animal.getNome() +" ?","Animal",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
					JOptionPane.showMessageDialog(null, "Acertei");
					return;
				}
			}	
		}
			
		if (JOptionPane.showConfirmDialog(null,"O animal que você pensou é o " + this.getNome() +" ?","Animal",JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){	
			
			String animal = JOptionPane.showInputDialog("Qual animal voce pensou?");
			String tem = JOptionPane.showInputDialog("Um(a) " + animal + " " + "_______" + "mas um(a) " + this.getNome() + " não.");
			this.filho.add(new Animal(tem, animal));			
		}else{
			JOptionPane.showMessageDialog(null, "Acertei");
		}
	}
}
