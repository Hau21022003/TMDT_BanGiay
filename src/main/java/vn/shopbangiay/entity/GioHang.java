package vn.shopbangiay.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: GoHang
 *
 */
@Entity
@IdClass(MaGioHang.class)
public class GioHang implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "SoDienThoai")
	private KhachHang khachHang;
	@Id
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "MaSanPham", referencedColumnName = "MaSanPham"),
		@JoinColumn(name = "TenKichCo", referencedColumnName = "TenKichCo")
	})
	private ChiTietSanPham chiTietSanPham;
	@Column(columnDefinition = "CHECK soLuong > 0")
	private int soLuong;
	public GioHang() {
		super();
	}
	public GioHang(KhachHang khachHang, ChiTietSanPham chiTietSanPham, int soLuong) {
		super();
		this.khachHang = khachHang;
		this.chiTietSanPham = chiTietSanPham;
		this.soLuong = soLuong;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public ChiTietSanPham getChiTietSanPham() {
		return chiTietSanPham;
	}
	public void setChiTietSanPham(ChiTietSanPham chiTietSanPham) {
		this.chiTietSanPham = chiTietSanPham;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
}
