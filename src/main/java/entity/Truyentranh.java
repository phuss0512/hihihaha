package entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the truyentranh database table.
 * 
 */
@Entity
@NamedQuery(name="Truyentranh.findAll", query="SELECT t FROM Truyentranh t")
public class Truyentranh implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="category")
	private String category;

	@Column(name="createdUser")
	private String createdDate;

	@Column(name="createdUser")
	private String createdUser;

	@Column(name="desciption")
	private String desciption;

	@Column(name="isDeleted")
	private String isDeleted;

	@Column(name="lastModifiedDate")
	private String lastModifiedDate;

	@Column(name="lastModifiedUser")
	private String lastModifiedUser;

	@Column(name="name")
	private String name;

	@Column(name="numberOfPage")
	private String numberOfPage;

	@Column(name="price")
	private String price;

	@Column(name="quantity")
	private String quantity;

	
	public Truyentranh() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedUser() {
		return this.createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public String getDesciption() {
		return this.desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public String getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastModifiedUser() {
		return this.lastModifiedUser;
	}

	public void setLastModifiedUser(String lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumberOfPage() {
		return this.numberOfPage;
	}

	public void setNumberOfPage(String numberOfPage) {
		this.numberOfPage = numberOfPage;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return this.quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}