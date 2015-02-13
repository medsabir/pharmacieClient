package www.com.beans;

import java.util.ArrayList;
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
	private List<Pharmacie> listproche = new ArrayList<Pharmacie>();

	public void onGeocode(GeocodeEvent event) {
		List<GeocodeResult> results = event.getResults();
		if (results != null && !results.isEmpty()) {
			LatLng center = results.get(0).getLatLng();
			Double lat = center.getLat();
			Double log = center.getLng();
			ServicesPharmacieService pharmacieService = new ServicesPharmacieService();
			IServicesPharmacie IpharmacieService = pharmacieService
					.getServicesPharmaciePort();
			setListproche(IpharmacieService.listdesPharmaciesProche(lat, log));
			for (Pharmacie p : getListproche()) {
				LatLng coordi = new LatLng(p.getLat(), p.getLog());
				geoModel.addOverlay(new Marker(coordi, p.getNom()));
			}
		}
	}

	public void setListproche(List<Pharmacie> listproche) {
		this.listproche = listproche;
	}

	public List<Pharmacie> getListproche() {
		return listproche;
	}

	public MapModel getGeoModel() {
		return geoModel;
	}

}
