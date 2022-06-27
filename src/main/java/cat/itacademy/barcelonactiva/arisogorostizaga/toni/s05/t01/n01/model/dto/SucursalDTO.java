package cat.itacademy.barcelonactiva.arisogorostizaga.toni.s05.t01.n01.model.dto;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class SucursalDTO implements Serializable {

	private static final long serialVersionUID = 2L;
	private Integer pk_SucursalID;
	private String nomSucursal;
	private String paisSucursal;
	private String tipusSucursal;
	
	private List<String> paisos = Arrays.asList("Alemania", "Belgica", "Croacia", "Dinamarca", "España", "Francia", "Irlanda", "Letonia", "Luxemburgo", "Paises Bajos", "Suecia", "Bulgaria", "Eslovaquia", "Estonia", "Grecia", "Malta", "Polonia", "Republica Checa", "Austria", "Chipre", "Eslovenia", "Finlandia", "Hungria", "Italia", "Lituania", "Portugal", "Rumania");


	public SucursalDTO() {
		
	}


	public SucursalDTO(Integer pk_SucursalID, String nomSucursal, String paisSucursal, String tipusSucursal,
			List<String> paisos) {
		super();
		this.pk_SucursalID = pk_SucursalID;
		this.nomSucursal = nomSucursal;
		this.paisSucursal = paisSucursal;
		this.tipusSucursal = tipusSucursal;
		this.paisos = paisos;
	}

	public SucursalDTO(String nomSucursal, String paisSucursal, String tipusSucursal) {
		super();
		this.nomSucursal = nomSucursal;
		this.paisSucursal = paisSucursal;
		this.tipusSucursal = tipusSucursal;
	}

	public Integer getPk_SucursalID() {
		return pk_SucursalID;
	}


	public void setPk_SucursalID(Integer pk_SucursalID) {
		this.pk_SucursalID = pk_SucursalID;
	}


	public String getNomSucursal() {
		return nomSucursal;
	}


	public void setNomSucursal(String nomSucursal) {
		this.nomSucursal = nomSucursal;
	}


	public String getPaisSucursal() {
		return paisSucursal;
	}


	public void setPaisSucursal(String paisSucursal) {
		this.paisSucursal = paisSucursal;
	}


	public String getTipusSucursal() {
		return tipusSucursal;
	}


	public void setTipusSucursal(String tipusSucursal) {
		this.tipusSucursal = tipusSucursal;
	}


	public List<String> getPaisos() {
		return paisos;
	}


	public void setPaisos(List<String> paisos) {
		this.paisos = paisos;
	}


	@Override
	public String toString() {
		return "SucursalDTO [pk_SucursalID=" + pk_SucursalID + ", nomSucursal=" + nomSucursal + ", paisSucursal="
				+ paisSucursal + ", tipusSucursal=" + tipusSucursal + ", paisos=" + paisos + "]";
	}
	
	

}
