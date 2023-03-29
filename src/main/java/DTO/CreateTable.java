package DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name="Instagram")
public class CreateTable {
@Id
private int acc_id;
@Column(nullable=false, unique=false)
private String acc_name;
@Column(nullable=false, unique=true)
private String acc_eid;
@Column(nullable=false, unique=true)
private long ph_no;

public int getAcc_id() {
	return acc_id;
}
public void setAcc_id(int acc_id) {
	this.acc_id = acc_id;
}
public String getAcc_name() {
	return acc_name;
}
public void setAcc_name(String acc_name) {
	this.acc_name = acc_name;
}
public String getAcc_eid() {
	return acc_eid;
}
public void setAcc_eid(String acc_eid) {
	this.acc_eid = acc_eid;
}
public long getPh_no() {
	return ph_no;
}
public void setPh_no(long ph_no) {
	this.ph_no = ph_no;
}

}
