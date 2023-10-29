package vn.shopbangiay.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LoaiSanPham implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maLoai;
	private String tenLoai;
	@OneToMany(mappedBy = "loaiSanPham",fetch = FetchType.EAGER)
	private List<SanPham> listSanPham;
	
	public LoaiSanPham() {
		super();
	}
	
	public LoaiSanPham(int maLoai, String tenLoai, List<SanPham> listSanPham) {
		super();
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
		this.listSanPham = listSanPham;
	}
	
	public int getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(int maLoai) {
		this.maLoai = maLoai;
	}
	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public List<SanPham> getListSanPham() {
		return listSanPham;
	}
	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}
	
}
