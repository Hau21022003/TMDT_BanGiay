package vn.shopbangiay.entity;

import java.io.Serializable;

public class MaChiTietSanPham implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int sanPham;
	private String kichCo;
	public MaChiTietSanPham() {
		super();
	}

	public MaChiTietSanPham(int sanPham, String kichCo) {
		super();
		this.sanPham = sanPham;
		this.kichCo = kichCo;
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
