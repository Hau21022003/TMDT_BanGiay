package vn.shopbangiay.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: KichCo
 *
 */
@Entity

public class KichCo implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String tenKichCo;
	@OneToMany(mappedBy = "kichCo",fetch = FetchType.EAGER)
	private List<ChiTietSanPham> listChiTietSanPham;
	
	public KichCo() {
		super();
	}
	public KichCo(String tenKichCo, List<ChiTietSanPham> listChiTietSanPham) {
		super();
		this.tenKichCo = tenKichCo;
		this.listChiTietSanPham = listChiTietSanPham;
	}
	public String getTenKichCo() {
		return tenKichCo;
	}
	public void setTenKichCo(String tenKichCo) {
		this.tenKichCo = tenKichCo;
	}
	public List<ChiTietSanPham> getListChiTietSanPham() {
		return listChiTietSanPham;
	}
	public void setListChiTietSanPham(List<ChiTietSanPham> listChiTietSanPham) {
		this.listChiTietSanPham = listChiTietSanPham;
	}
}
