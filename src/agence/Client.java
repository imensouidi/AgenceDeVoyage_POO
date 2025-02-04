package agence;
import java.util.Scanner;

public class Client {
	Scanner sc = new Scanner(System.in);
	 private String id, nom, prenom, cin, type;
	 private int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", type=" + type + ", age="
				+ age + "]";
	}
	    
	 public Client(String code) {
		 
		 this.id=code;
		 System.out.println("Donner le nom du client");
		 this.nom=sc.next();
		 System.out.println("Donner le prénom du client");
		 this.prenom=sc.next();
		 System.out.println("Donner le num cin du client");
		 this.cin=sc.next();
		 do{
			   System.out.println("Donner le type du client");
			   this.type=sc.next();
			}while(!(type.equalsIgnoreCase("BusinessClass")||type.equalsIgnoreCase("normal"))); 
		 System.out.println("Donner l'age du client");
		 this.age=sc.nextInt();
	 }
	 
}
