package vn.shopbangiay.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: NhaSanXuat
 *
 */
@Entity

public class NhaSanXuat implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maNhaSanXuat;
	private String tenNhaSanXuat;
	private String logo;
	
	@OneToMany(mappedBy = "nhaSanXuat",fetch = FetchType.EAGER)
	private List<SanPham> listSanPham;
	
	public int getMaNhaSanXuat() {
		return maNhaSanXuat;
	}

	public void setMaNhaSanXuat(int maNhaSanXuat) {
		this.maNhaSanXuat = maNhaSanXuat;
	}

	public String getTenNhaSanXuat() {
		return tenNhaSanXuat;
	}

	public void setTenNhaSanXuat(String tenNhaSanXuat) {
		this.tenNhaSanXuat = tenNhaSanXuat;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public List<SanPham> getListSanPham() {
		return listSanPham;
	}

	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}

	public NhaSanXuat(int maNhaSanXuat, String tenNhaSanXuat, String logo, List<SanPham> listSanPham) {
		super();
		this.maNhaSanXuat = maNhaSanXuat;
		this.tenNhaSanXuat = tenNhaSanXuat;
		this.logo = logo;
		this.listSanPham = listSanPham;
	}
	
	public NhaSanXuat() {
		super();
	}
   
}
