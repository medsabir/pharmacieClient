package www.com.beans;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
  

import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

import services.Pharmacie;
 
@ManagedBean
@ViewScoped
public class MarkerSelectionView implements Serializable {
    private List<Pharmacie> liste= new ArrayList<Pharmacie>();
    private MapModel simpleModel = new DefaultMapModel();
	private static final long serialVersionUID = 1L;

	public void setListe(List<Pharmacie> liste) {
		this.liste = liste;
	}
    @PostConstruct
    public void init() {
        //Shared coordinates
    	for(Pharmacie p:liste){
        	LatLng coordi = new LatLng(p.getLat(),p.getLog());
        	simpleModel.addOverlay(new Marker(coordi,p.getNom()));
        }
    }
    public MapModel getSimpleModel() {
		return simpleModel;
	}
	public void onMarkerSelect(OverlaySelectEvent event) {
    	Marker marker = (Marker) event.getOverlay();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Nom de la Pharmacie", marker.getTitle()));
    }
      
}