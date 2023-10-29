package vn.shopbangiay.entity;

import java.io.Serializable;

public class MaGioHang implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String khachHang;
	private MaChiTietSanPham chiTietSanPham;
	public MaGioHang(String khachHang, MaChiTietSanPham chiTietSanPham) {
		super();
		this.khachHang = khachHang;
		this.chiTietSanPham = chiTietSanPham;
	}
	public MaGioHang() {
		super();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	public String getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(String khachHang) {
		this.khachHang = khachHang;
	}
	public MaChiTietSanPham getChiTietSanPham() {
		return chiTietSanPham;
	}
	public void setChiTietSanPham(MaChiTietSanPham chiTietSanPham) {
		this.chiTietSanPham = chiTietSanPham;
	}
	
}
