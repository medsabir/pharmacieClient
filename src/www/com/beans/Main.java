package www.com.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import services.IServicesPharmacie;
import services.Pharmacie;
import services.ServicesPharmacieService;

@ManagedBean(name = "pharmacie")
@SessionScoped
public class Main implements Serializable {

	private static final long serialVersionUID = 1L;
	private final Double x= 30.4277547;
	private final Double y=-9.598107199999959;
	MarkerSelectionView MR = new MarkerSelectionView();
	
	public List<Pharmacie> getListe() {
		ServicesPharmacieService pharmacieService = new ServicesPharmacieService();
		IServicesPharmacie IpharmacieService = pharmacieService.getServicesPharmaciePort();
		return IpharmacieService.listdesPharmacies();
	}

	public String ListePharmacies() {
		MR.setListe(getListe());
		MR.init();
		return "listePharmacies";
	}

	public List<Pharmacie> getListeGarde() {
		ServicesPharmacieService pharmacieService = new ServicesPharmacieService();
		IServicesPharmacie IpharmacieService = pharmacieService.getServicesPharmaciePort();
		return IpharmacieService.listdesPharmaciesenGarde();	
	}

	public String ListeGarde() {
		MR.setListe(getListeGarde());
		MR.init();
		return "listeGarde";

	}
	
	public String pharmacieProche() {
		return "pharmacieProche";
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	public MarkerSelectionView getMR() {
		return MR;
	}
}
