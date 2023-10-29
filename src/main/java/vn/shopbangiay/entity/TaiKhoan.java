package vn.shopbangiay.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TaiKhoan
 *
 */
@Entity
@Table(name = "TaiKhoan")
public class TaiKhoan implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TenDangNhap", columnDefinition = "varchar(100)")
	private String tenDangNhap;
	
	@Column(name = "MatKhau", columnDefinition = "varchar(100)")
	private String matKhau;

	@Column(name = "PhanQuyen", columnDefinition = "bit")
	private Boolean phanQuyen;
	
	@Column(name = "NgayDangKi", columnDefinition = "varchar(100)")
	private Date ngayDangKi;
	
	@OneToOne(mappedBy = "taiKhoan")
	private KhachHang khachHang;
	
	public TaiKhoan() {
		super();
	}

	public TaiKhoan(String tenDangNhap, String matKhau, Boolean phanQuyen, Date ngayDangKi, KhachHang khachHang) {
		super();
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.phanQuyen = phanQuyen;
		this.ngayDangKi = ngayDangKi;
		this.khachHang = khachHang;
	}

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public Boolean getPhanQuyen() {
		return phanQuyen;
	}

	public void setPhanQuyen(Boolean phanQuyen) {
		this.phanQuyen = phanQuyen;
	}

	public Date getNgayDangKi() {
		return ngayDangKi;
	}

	public void setNgayDangKi(Date ngayDangKi) {
		this.ngayDangKi = ngayDangKi;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	
}
