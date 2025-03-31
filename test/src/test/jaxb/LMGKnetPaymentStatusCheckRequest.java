package test.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlTransient
public class LMGKnetPaymentStatusCheckRequest 
{
	@XmlElement
	private String id;

	@XmlElement
	private String password;

	@XmlElement
	private String action;

	@XmlElement
	private Double amt;

	@XmlElement
	private String transid;

	@XmlElement
	private String trackid;

	@XmlElement
	private String udf5;

	public void setId(final String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setAction(final String action) {
		this.action = action;
	}

	public String getAction() {
		return action;
	}

	public void setAmt(final Double amt) {
		this.amt = amt;
	}

	public Double getAmt() {
		return amt;
	}

	public void setTransid(final String transid) {
		this.transid = transid;
	}

	public String getTransid() {
		return transid;
	}

	public void setTrackid(final String trackid) {
		this.trackid = trackid;
	}

	public String getTrackid() {
		return trackid;
	}

	public void setUdf5(final String udf5) {
		this.udf5 = udf5;
	}

	public String getUdf5() {
		return udf5;
	}

}
