package vn.shopbangiay.entity;

import java.io.Serializable;

public class MaDanhGia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String khachHang;
	private int sanPham;
	public MaDanhGia() {
		super();
	}
	
	public MaDanhGia(String khachHang, int sanPham) {
		super();
		this.khachHang = khachHang;
		this.sanPham = sanPham;
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
