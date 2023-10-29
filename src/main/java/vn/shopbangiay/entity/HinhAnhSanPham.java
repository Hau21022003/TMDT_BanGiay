package vn.shopbangiay.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: HinhAnhSanPham
 *
 */
@IdClass(MaHinhAnhSanPham.class)
@Entity
public class HinhAnhSanPham implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "MaSanPham",referencedColumnName = "MaSanPham")
	private SanPham sanPham;
	
	@Id
	private String hinhAnh;
	
	public HinhAnhSanPham() {
		super();
	}

	public HinhAnhSanPham(SanPham sanPham, String hinhAnh) {
		super();
		this.sanPham = sanPham;
		this.hinhAnh = hinhAnh;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	
}
