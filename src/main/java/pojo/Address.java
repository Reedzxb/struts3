package pojo;

import org.hibernate.annotations.Parent;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class Address
{
	@Column(name="address_detail")
	private String detail;
	@Column(name="address_zip")
	private String zip;
	@Column(name="address_country")
	private String country;
    @Parent
	private Person owner;
    public Address()
	{

	}
	public Address(String detail,String zip,String country)
	{
		this.country=country;
		this.detail=detail;
		this.zip=zip;
	}
	// 无参数的构造器

	// detail的setter和getter方法
	public void setDetail(String detail)
	{
		this.detail = detail;
	}
	public String getDetail()
	{
		return this.detail;
	}

	// zip的setter和getter方法
	public void setZip(String zip)
	{
		this.zip = zip;
	}
	public String getZip()
	{
		return this.zip;
	}

	// country的setter和getter方法
	public void setCountry(String country)
	{
		this.country = country;
	}
	public String getCountry()
	{
		return this.country;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}
}