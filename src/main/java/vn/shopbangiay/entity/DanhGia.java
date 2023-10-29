package vn.shopbangiay.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: DanhGia
 *
 */
@Entity
@IdClass(MaDanhGia.class)
public class DanhGia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "SoDienThoai")
	private KhachHang khachHang;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "MaSanPham")
	private SanPham sanPham;
	
	@Column(columnDefinition = "CHECK soSao >= 0 AND soSao <= 5")
	private int soSao;
	private String noiDung;
	private Date ngayDanhGia;
	
	public DanhGia() {
		super();
	}

	public DanhGia(KhachHang khachHang, SanPham sanPham, int soSao, String noiDung, Date ngayDanhGia) {
		super();
		this.khachHang = khachHang;
		this.sanPham = sanPham;
		this.soSao = soSao;
		this.noiDung = noiDung;
		this.ngayDanhGia = ngayDanhGia;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public int getSoSao() {
		return soSao;
	}

	public void setSoSao(int soSao) {
		this.soSao = soSao;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public Date getNgayDanhGia() {
		return ngayDanhGia;
	}

	public void setNgayDanhGia(Date ngayDanhGia) {
		this.ngayDanhGia = ngayDanhGia;
	}
   
}
