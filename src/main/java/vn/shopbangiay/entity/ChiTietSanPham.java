package vn.shopbangiay.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ChiTietSanPham
 *
 */
@Entity
@IdClass(MaChiTietSanPham.class)
public class ChiTietSanPham implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne
	@JoinColumn(name = "MaSanPham",referencedColumnName = "MaSanPham")
	private SanPham sanPham;
	@Id
	@ManyToOne
	@JoinColumn(name = "TenKichCo", referencedColumnName = "TenKichCo")
	private KichCo kichCo;
	@Column(columnDefinition = "CHECK (soLuongTonKho >= 0)")
	private int soLuongTonKho;
	
	public ChiTietSanPham() {
		super();
	}

	public ChiTietSanPham(SanPham sanPham, KichCo kichCo, int soLuongTonKho) {
		super();
		this.sanPham = sanPham;
		this.kichCo = kichCo;
		this.soLuongTonKho = soLuongTonKho;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public KichCo getKichCo() {
		return kichCo;
	}

	public void setKichCo(KichCo kichCo) {
		this.kichCo = kichCo;
	}

	public int getSoLuongTonKho() {
		return soLuongTonKho;
	}

	public void setSoLuongTonKho(int soLuongTonKho) {
		this.soLuongTonKho = soLuongTonKho;
	}
}
