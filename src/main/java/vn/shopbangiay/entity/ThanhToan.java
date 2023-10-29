package vn.shopbangiay.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ThanhToan
 *
 */
@Entity

public class ThanhToan implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String hinhThucThanhToan;
	@OneToMany(mappedBy = "thanhToan",fetch = FetchType.EAGER)
	private List<HoaDon> listHoaDon;
	
	public String getHinhThucThanhToan() {
		return hinhThucThanhToan;
	}

	public void setHinhThucThanhToan(String hinhThucThanhToan) {
		this.hinhThucThanhToan = hinhThucThanhToan;
	}

	public List<HoaDon> getListHoaDon() {
		return listHoaDon;
	}

	public void setListHoaDon(List<HoaDon> listHoaDon) {
		this.listHoaDon = listHoaDon;
	}

	public ThanhToan(String hinhThucThanhToan, List<HoaDon> listHoaDon) {
		super();
		this.hinhThucThanhToan = hinhThucThanhToan;
		this.listHoaDon = listHoaDon;
	}

	public ThanhToan() {
		super();
	}
   
}
