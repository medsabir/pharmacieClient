package www.com.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.primefaces.event.map.GeocodeEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.GeocodeResult;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

import services.IServicesPharmacie;
import services.Pharmacie;
import services.ServicesPharmacieService;

@ManagedBean
public class GeocodeView {

	private MapModel geoModel=new DefaultMapModel();;
	private Pharmacie proche = new Pharmacie();

	public void onGeocode(GeocodeEvent event) {
		List<GeocodeResult> results = event.getResults();
		if (results != null && !results.isEmpty()) {
			
			LatLng center = results.get(0).getLatLng();
			Double lat = center.getLat();
			Double log = center.getLng();
			
			ServicesPharmacieService pharmacieService = new ServicesPharmacieService();
			IServicesPharmacie IpharmacieService = pharmacieService.getServicesPharmaciePort();
			setProche(IpharmacieService.pharmacieProche(lat, log));
			
				LatLng coordi = new LatLng(getProche().getLat(), getProche().getLog());
				geoModel.addOverlay(new Marker(coordi, getProche().getNom()));
		}
	}


	public Pharmacie getProche() {
		return proche;
	}

	public void setProche(Pharmacie proche) {
		this.proche = proche;
	}

	public MapModel getGeoModel() {
		return geoModel;
	}

}
