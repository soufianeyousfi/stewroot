package org.sympanux.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicule implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String nomVehicule;
	private String marque;
	private String couleur;
	private String carburant;
	private Integer nombreDePlace;
	private Double kilometrage;
	private Integer nombreDePorte;
	
	
	

	public Vehicule() {
		super();
	}

	public Vehicule(String marque, String couleur, Integer nombreDePorte) {
		super();
		this.marque = marque;
		this.couleur = couleur;
		this.nombreDePorte = nombreDePorte;
	}

	/**
	 * @return the nomVehicule
	 */
	public String getNomVehicule() {
		return nomVehicule;
	}

	/**
	 * @param nomVehicule
	 *            the nomVehicule to set
	 */
	public void setNomVehicule(String nomVehicule) {
		this.nomVehicule = nomVehicule;
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @param marque
	 *            the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur
	 *            the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	/**
	 * @return the carburant
	 */
	public String getCarburant() {
		return carburant;
	}

	/**
	 * @param carburant
	 *            the carburant to set
	 */
	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}

	/**
	 * @return the nombreDePlace
	 */
	public Integer getNombreDePlace() {
		return nombreDePlace;
	}

	/**
	 * @param nombreDePlace
	 *            the nombreDePlace to set
	 */
	public void setNombreDePlace(Integer nombreDePlace) {
		this.nombreDePlace = nombreDePlace;
	}

	/**
	 * @return the kilometrage
	 */
	public Double getKilometrage() {
		return kilometrage;
	}

	/**
	 * @param kilometrage
	 *            the kilometrage to set
	 */
	public void setKilometrage(Double kilometrage) {
		this.kilometrage = kilometrage;
	}

	/**
	 * @return the nombreDePorte
	 */
	public Integer getNombreDePorte() {
		return nombreDePorte;
	}

	/**
	 * @param nombreDePorte
	 *            the nombreDePorte to set
	 */
	public void setNombreDePorte(Integer nombreDePorte) {
		this.nombreDePorte = nombreDePorte;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

}
