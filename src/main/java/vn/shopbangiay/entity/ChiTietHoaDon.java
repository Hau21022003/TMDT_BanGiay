package vn.shopbangiay.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ChiTietHoaDon
 *
 */
@Entity
@IdClass(MaChiTietHoaDon.class)
public class ChiTietHoaDon implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "MaHoaDon")
	private HoaDon hoaDon;
	@Column(columnDefinition = "CHECK soLuong > 0")
	private int soLuong;
	
	
	private int gia;
	
	@Id
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "TenKichCo", referencedColumnName = "TenKichCo"),
		@JoinColumn(name = "MaSanPham", referencedColumnName = "MaSanPham")
	})
	private ChiTietSanPham chiTietSanPham;
	
	public ChiTietHoaDon() {
		super();
	}

	public ChiTietHoaDon(HoaDon hoaDon, int soLuong, int gia, ChiTietSanPham chiTietSanPham) {
		super();
		this.hoaDon = hoaDon;
		this.soLuong = soLuong;
		this.gia = gia;
		this.chiTietSanPham = chiTietSanPham;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public ChiTietSanPham getChiTietSanPham() {
		return chiTietSanPham;
	}

	public void setChiTietSanPham(ChiTietSanPham chiTietSanPham) {
		this.chiTietSanPham = chiTietSanPham;
	}
	
	
}
