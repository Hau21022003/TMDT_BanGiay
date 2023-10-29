package vn.shopbangiay.entity;

import java.io.Serializable;

public class MaChiTietHoaDon implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int hoaDon;
	private MaChiTietSanPham chiTietSanPham;
	public MaChiTietHoaDon(int hoaDon, MaChiTietSanPham chiTietSanPham) {
		super();
		this.hoaDon = hoaDon;
		this.chiTietSanPham = chiTietSanPham;
	}
	public MaChiTietHoaDon() {
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
}
