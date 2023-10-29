package vn.shopbangiay.entity;

import java.io.Serializable;


public class MaHinhAnhSanPham implements Serializable{
	private static final long serialVersionUID = 1L;
	private int sanPham;
	private String hinhAnh;
	public MaHinhAnhSanPham() {
		super();
	}
	
	public MaHinhAnhSanPham(int sanPham, String hinhAnh) {
		super();
		this.sanPham = sanPham;
		this.hinhAnh = hinhAnh;
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
