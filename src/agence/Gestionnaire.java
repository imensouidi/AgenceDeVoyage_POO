package agence;
import java.util.Scanner;
import java.util.ArrayList;
public class Gestionnaire {
	int code=0;
	Scanner sc=new Scanner(System.in);
   private ArrayList<Voyage> listVoyage;
   private ArrayList<Client> listClt;
   private ArrayList<Reservation> listRes;
   private int codeRes=1;
public Gestionnaire(){
	 listVoyage = new ArrayList<Voyage>();
	 listClt = new ArrayList<Client>();
	 listRes= new ArrayList<Reservation>();
}


public Client Rech_Client(String code){
    for (int i=0;i<listClt.size();i++){
		 if (listClt.get(i).getId().equals(code)) { 
			return  listClt.get(i);
}
}
    return null;
}


public void AjoutClt(){
	System.out.printf("Donner l'id du client");
	String id=sc.next();
	if(Rech_Client(id)==null){
		listClt.add(new Client(id)) ;
	  }
		
	else System.out.println("Ce code est d�ja utilis�!");
	
	}
public void modifier(){
	System.out.println("Entrez l'id de client");
	String cd= sc.next();
	if(Rech_Client(cd)!=null){
		int choix;
		do{
		System.out.println("Qu'est-ce-que vous voulez modifier? .\n 1-Si id .\n 2-Si nom .\n 3-Si prénom .\n"
				+ "4-Si cin .\n  5-Si type .\n 6-Si age .\n");
		choix=sc.nextInt();
		}while(!((choix==1)||(choix==2)||(choix==3)||(choix==4)||(choix==5)||(choix==6)));
		
		if(choix==1){
			System.out.println("Entrez le nouveau code");
			String code= sc.next();
			if(Rech_Client(code)==null){
				Rech_Client(cd).setId(code);
			}
			else{
				System.out.println("Ce code est d�ja utilis�!");
			}
	}
		else if(choix==2){
			System.out.println("Entrez le nouveau nom");
			String nom= sc.next();
			Rech_Client(cd).setNom(nom);
	}
		else if(choix==3){
			System.out.println("Entrez le nouveau prénom");
			String prenom = sc.next();
			Rech_Client(cd).setPrenom(prenom);
	}
		else if(choix==4){
			System.out.println("Entrez le nouveau cin");
			String cin = sc.next();
			Rech_Client(cd).setCin(cin);
	}
		else if(choix==5){
			System.out.println("Entrez le nouveau type");
			String type = sc.next();
			Rech_Client(cd).setType(type);
	}
		else if(choix==6){
			System.out.println("Entrez le nouveau age");
			int age = sc.nextInt();
			Rech_Client(cd).setAge(age);
	}
	}
	else{
		System.out.println("Ce client n'existe pas!");
	}
}
public void AffichageClt(){
	for(int i=0; i<listClt.size(); i++){
		System.out.println(listClt.get(i).toString());
	}
	
}

public Voyage Rech_Voyage(int code){
    for (int i=0;i<listVoyage.size();i++){
		 if (listVoyage.get(i).getRef()==code) { 
			return  listVoyage.get(i);
}
}
    return null;
}


public void CreerVoyage(){
ArrayList <Jour> list= new ArrayList<Jour>();
int choix;
System.out.println("Donner la référence de ce voyage");
int ref= sc.nextInt();
if(Rech_Voyage(ref)==null) {
	do{
		System.out.printf("Voulez-vous ajouter? .\n 1- Si pack personnalisé .\n 2- Si pack organisé .\n " );
		choix=sc.nextInt();
	}while(!((choix==1)||(choix==2)));
	if(choix==1){
		System.out.println("Donner le nbre de jours");
        int nbre_jours = sc.nextInt();
		 for(int i=0; i<nbre_jours ; i++) {
	     		System.out.println("Donner la description de ce jour n "+ i);
	     		String des= sc.next();
	     		list.add(new Jour(i, des));	}
		PackPersonnalise pers = new PackPersonnalise(ref, list, nbre_jours);
		
		listVoyage.add(pers);

	}
	else if(choix==2){
		System.out.println("Donner le nbre de jours");
        int nbre_jours = sc.nextInt();
		 for(int i=0; i<nbre_jours ; i++) {
	     		System.out.println("Donner la description de ce jour n "+ i);
	     		String des= sc.next();
	     		list.add(new Jour(i, des));	}
	     	
         PackOrganise org = new PackOrganise(ref,list, nbre_jours);
        
		
		listVoyage.add(org);

	}} else System.out.println("Cette référence est déja utilisée!");
	
}
public void AffichageVoyage(){
	System.out.println("Donner la référence du voyage");
	int ref=sc.nextInt();
	if(Rech_Voyage(ref)!=null){
		System.out.println(Rech_Voyage(ref).toString());
	}
	else System.out.println("Echec!");
	
}

public Reservation Rech_Res(int code){
    for (int i=0;i<listRes.size();i++){
		 if (listRes.get(i).getCode()==code) { 
			return  listRes.get(i);
}
}
    return null;
}
public void CreerReservation(){

String code, mode;

int ref;
System.out.println("Donner le code du client");
code= sc.next();
if(Rech_Client(code)!=null){
	System.out.println("Donner la référence du voyage");
	ref= sc.nextInt();
	if(Rech_Voyage(ref)!=null){
		
		if(Rech_Voyage(ref).getNbre_places()>=1) { 
		
			do{
			   System.out.println("Mode de paiement cheque ou espece ou CB");
			   mode=sc.next();
			}while(!(mode.equalsIgnoreCase("cheque")||mode.equalsIgnoreCase("CB")||mode.equalsIgnoreCase("espece"))); 
			listRes.add(new Reservation(codeRes, Rech_Client(code), Rech_Voyage(ref),mode));
			codeRes+=1;
			if(Rech_Client(code).getType().equalsIgnoreCase("normal")) {
				Rech_Voyage(ref).setNbre_places(Rech_Voyage(ref).getNbre_places()-1);
			}else Rech_Voyage(ref).setNbre_places_bc(Rech_Voyage(ref).getNbre_places_bc()-1);
			
		}
		else System.out.println("Il ne reste pas de places");
		}  else System.out.println("Ce voyage n'existe pas!");
	
		}else System.out.println("Ce client n'existe pas!");
}
public void AffichageRes(){
	for(int i=0; i<listRes.size(); i++){
		System.out.println(listRes.get(i).toString());
	}
	
}



}
