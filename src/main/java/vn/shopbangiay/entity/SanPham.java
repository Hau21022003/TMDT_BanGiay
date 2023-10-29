package vn.shopbangiay.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Null;

@Entity
public class SanPham implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maSanPham;
	private String tenSanPham;
	@Column(columnDefinition = "CHECK (gia >= 0)")
	private int gia;
	private String moTa;
	private boolean trangThai;
	@Column(columnDefinition = "CHECK giamGia >= 0 AND giamGia <= 100")
	private int giamGia;
	private Boolean gioiTinh;
	private int soSanPhamDaBan;
	
	//lien ket n-1
	@ManyToOne
	@JoinColumn(name = "MaChatLieu")
	private ChatLieu chatLieu;
	@ManyToOne
	@JoinColumn(name = "MaLoai")
	private LoaiSanPham loaiSanPham;
	@ManyToOne
	@JoinColumn(name = "MaNhaSanXuat")
	private NhaSanXuat nhaSanXuat;
	
	//lien ket 1-n
	@OneToMany(mappedBy = "sanPham",fetch = FetchType.EAGER)
	private List<HinhAnhSanPham> listHinhAnhSanPham;
	
	public SanPham() {
		super();
	}
	
	
	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public boolean isTrangThai() {
		return trangThai;
	}
	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}
	public int getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(int giamGia) {
		this.giamGia = giamGia;
	}
	public Boolean getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(Boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getSoSanPhamDaBan() {
		return soSanPhamDaBan;
	}
	public void setSoSanPhamDaBan(int soSanPhamDaBan) {
		this.soSanPhamDaBan = soSanPhamDaBan;
	}
	public ChatLieu getChatLieu() {
		return chatLieu;
	}
	public void setChatLieu(ChatLieu chatLieu) {
		this.chatLieu = chatLieu;
	}
	public LoaiSanPham getLoaiSanPham() {
		return loaiSanPham;
	}
	public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}
	public NhaSanXuat getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(NhaSanXuat nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	
}
