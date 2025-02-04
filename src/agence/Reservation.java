package agence;


public class Reservation {
 private Client client;
 private Voyage voyage;
 private int Code;
 private String ModeDePaiement;
 private double prix;

public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
public Voyage getVoyage() {
	return voyage;
}
public void setVoyage(Voyage voyage) {
	this.voyage = voyage;
}
public int getCode() {
	return Code;
}
public void setCode(int code) {
	Code = code;
}


public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public String getModeDePaiement() {
	return ModeDePaiement;
}
public void setModeDePaiement(String modeDePaiement) {
	ModeDePaiement = modeDePaiement;
}
public Reservation(int Code, Client client, Voyage voyage, String mode) {
	this.Code=Code;
	this.client=client;
	this.voyage = voyage;
	this.ModeDePaiement = mode;
	if(client.getType().equalsIgnoreCase("Businessclass")) {
		this.prix=voyage.getPrix()*2;
	}else this.prix=voyage.getPrix();
}



@Override
public String toString() {
	return "Reservation [client=" + client + ", voyage=" + voyage + ", Code=" + Code + ", ModeDePaiement="
			+ ModeDePaiement + ", prix=" + prix + "]";
}

}