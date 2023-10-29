package vn.shopbangiay.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: KhachHang
 *
 */
@Entity
@Table(name = "KhachHang")
public class KhachHang implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SoDienThoai")
	private String soDienThoai;

	@Column(name = "TenKhachHang", columnDefinition = "nvarchar(100)")
	private String tenKhachHang;

	@Column(name = "DiaChi", columnDefinition = "nvarchar(100)")
	private String diaChi;

	@Column(name = "DiaChiChiTiet", columnDefinition = "nvarchar(100)")
	private String diaChiChiTiet;

	@Column(name = "Email", columnDefinition = "varchar(100)")
	private String email;

	@OneToOne
	@JoinColumn(name = "tenDangNhap")
	private TaiKhoan taiKhoan;

	@OneToMany(mappedBy = "khachHang", fetch = FetchType.LAZY)
	private List<LichSuTimKiem> listLichSuTimKiem; 
	
	@OneToMany(mappedBy = "khachHang", fetch = FetchType.LAZY)
	private List<HoiDap> listHoiDap; 
	
	@OneToMany(mappedBy = "khachHang",fetch = FetchType.LAZY)
	private List<HoaDon> listHoaDon;
	
	@OneToMany(mappedBy = "khachHang", fetch = FetchType.LAZY)
	private List<GioHang> listGioHang;
	
	@OneToMany(mappedBy = "khachHang",fetch = FetchType.LAZY)
	private List<DanhGia> listDanhGia;

	public KhachHang() {
		super();
	}

	public KhachHang(String soDienThoai, String tenKhachHang, String diaChi, String diaChiChiTiet, String email,
			TaiKhoan taiKhoan, List<LichSuTimKiem> listLichSuTimKiem, List<HoiDap> listHoiDap, List<HoaDon> listHoaDon,
			List<GioHang> listGioHang, List<DanhGia> listDanhGia) {
		super();
		this.soDienThoai = soDienThoai;
		this.tenKhachHang = tenKhachHang;
		this.diaChi = diaChi;
		this.diaChiChiTiet = diaChiChiTiet;
		this.email = email;
		this.taiKhoan = taiKhoan;
		this.listLichSuTimKiem = listLichSuTimKiem;
		this.listHoiDap = listHoiDap;
		this.listHoaDon = listHoaDon;
		this.listGioHang = listGioHang;
		this.listDanhGia = listDanhGia;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getDiaChiChiTiet() {
		return diaChiChiTiet;
	}

	public void setDiaChiChiTiet(String diaChiChiTiet) {
		this.diaChiChiTiet = diaChiChiTiet;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public List<LichSuTimKiem> getListLichSuTimKiem() {
		return listLichSuTimKiem;
	}

	public void setListLichSuTimKiem(List<LichSuTimKiem> listLichSuTimKiem) {
		this.listLichSuTimKiem = listLichSuTimKiem;
	}

	public List<HoiDap> getListHoiDap() {
		return listHoiDap;
	}

	public void setListHoiDap(List<HoiDap> listHoiDap) {
		this.listHoiDap = listHoiDap;
	}

	public List<HoaDon> getListHoaDon() {
		return listHoaDon;
	}

	public void setListHoaDon(List<HoaDon> listHoaDon) {
		this.listHoaDon = listHoaDon;
	}

	public List<GioHang> getListGioHang() {
		return listGioHang;
	}

	public void setListGioHang(List<GioHang> listGioHang) {
		this.listGioHang = listGioHang;
	}

	public List<DanhGia> getListDanhGia() {
		return listDanhGia;
	}

	public void setListDanhGia(List<DanhGia> listDanhGia) {
		this.listDanhGia = listDanhGia;
	}
	
}
