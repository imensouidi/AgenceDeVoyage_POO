package agence;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;


public class Voyage {
    private int ref;
    private String dest, descriptif;
    private LocalDate date_dep, date_ret;
    private double prix;
    private ArrayList<Jour> itineraire;
    private int nbre_jours;
    private int nbre_places_bc;
	private int nbre_places;
	Scanner sc = new Scanner(System.in);


    public Voyage(int ref, ArrayList<Jour>list, int nbre) {
    	
        this.ref = ref;
		System.out.println("Donner la destination du voyage");
        this.dest = sc.next();
        System.out.println("Donner la description du voyage");
        this.descriptif = sc.next();
        do {
        System.out.println("Donner la date de départ");
        String dateDep = sc.next();
        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.date_dep = LocalDate.parse(dateDep, Formatter);
        System.out.println("Donner la date de retour");
        String dateRetour= sc.next();
		this.date_ret = LocalDate.parse(dateRetour, Formatter);
        }while((date_dep.isAfter(date_ret))||(date_dep.isEqual(date_ret)));
        System.out.println("Donner le prix du voyage");
        this.prix = sc.nextInt();
        System.out.println("Donner le nbre de places bc");
        this.nbre_places_bc=sc.nextInt();
        System.out.println("Donner le nbre de places");
        this.nbre_places=sc.nextInt();
        this.nbre_jours = nbre;
        this.itineraire= list;
        
    }

    




	public int getNbre_places_bc() {
		return nbre_places_bc;
	}






	public void setNbre_places_bc(int nbre_places_bc) {
		this.nbre_places_bc = nbre_places_bc;
	}






	public int getNbre_places() {
		return nbre_places;
	}



	public void setNbre_places(int nbre_places) {
		this.nbre_places = nbre_places;
	}



	public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public LocalDate getDate_dep() {
        return date_dep;
    }

    public void setDate_dep(LocalDate date_dep) {
        this.date_dep = date_dep;
    }

    public LocalDate getDate_ret() {
        return date_ret;
    }

    public void setDate_ret(LocalDate date_ret) {
        this.date_ret = date_ret;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public ArrayList<Jour> getItineraire() {
        return itineraire;
    }

    public void setItineraire(ArrayList<Jour> itineraire) {
        this.itineraire = itineraire;
    }

    public int getNbre_jours() {
		return nbre_jours;
	}



	public void setNbre_jours(int nbre_jours) {
		this.nbre_jours = nbre_jours;
	}




    @Override
	public String toString() {
		return "Voyage [ref=" + ref + ", dest=" + dest + ", descriptif=" + descriptif + ", date_dep=" + date_dep
				+ ", date_ret=" + date_ret + ", prix=" + prix + ", itineraire=" + itineraire + ", nbre_jours="
				+ nbre_jours + ", nbre_places_bc=" + nbre_places_bc + ", nbre_places=" + nbre_places + "]";
	}
    
    
    
    
}
