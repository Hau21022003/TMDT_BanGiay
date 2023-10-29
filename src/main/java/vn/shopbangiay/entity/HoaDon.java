package vn.shopbangiay.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: HoaDon
 *
 */
@Entity

public class HoaDon implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maHoaDon;
	private Date ngayDatHang;
	private Date ngayGiaoDuKien;
	private Date ngayGiaoThucTe;
	private int trangThaiDonHang;
	private Boolean trangThaiThanhToan;
	private String moTa;
	
	@ManyToOne
	@JoinColumn(name = "SoDienThoai")
	private KhachHang khachHang;
	@ManyToOne
	@JoinColumn(name = "HinhThucThanhToan")
	private ThanhToan thanhToan;
	@ManyToOne
	@JoinColumn(name = "MaVoucher")
	private Voucher voucher;
	
	@OneToMany(mappedBy = "hoaDon", fetch = FetchType.EAGER)
	private List<ChiTietHoaDon> listChiTietHoaDon;
	
	
	public HoaDon() {
		super();
	}


	public HoaDon(int maHoaDon, Date ngayDatHang, Date ngayGiaoDuKien, Date ngayGiaoThucTe, int trangThaiDonHang,
			Boolean trangThaiThanhToan, String moTa, KhachHang khachHang, ThanhToan thanhToan, Voucher voucher,
			List<ChiTietHoaDon> listChiTietHoaDon) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngayDatHang = ngayDatHang;
		this.ngayGiaoDuKien = ngayGiaoDuKien;
		this.ngayGiaoThucTe = ngayGiaoThucTe;
		this.trangThaiDonHang = trangThaiDonHang;
		this.trangThaiThanhToan = trangThaiThanhToan;
		this.moTa = moTa;
		this.khachHang = khachHang;
		this.thanhToan = thanhToan;
		this.voucher = voucher;
		this.listChiTietHoaDon = listChiTietHoaDon;
	}


	public int getMaHoaDon() {
		return maHoaDon;
	}


	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}


	public Date getNgayDatHang() {
		return ngayDatHang;
	}


	public void setNgayDatHang(Date ngayDatHang) {
		this.ngayDatHang = ngayDatHang;
	}


	public Date getNgayGiaoDuKien() {
		return ngayGiaoDuKien;
	}


	public void setNgayGiaoDuKien(Date ngayGiaoDuKien) {
		this.ngayGiaoDuKien = ngayGiaoDuKien;
	}


	public Date getNgayGiaoThucTe() {
		return ngayGiaoThucTe;
	}


	public void setNgayGiaoThucTe(Date ngayGiaoThucTe) {
		this.ngayGiaoThucTe = ngayGiaoThucTe;
	}


	public int getTrangThaiDonHang() {
		return trangThaiDonHang;
	}


	public void setTrangThaiDonHang(int trangThaiDonHang) {
		this.trangThaiDonHang = trangThaiDonHang;
	}


	public Boolean getTrangThaiThanhToan() {
		return trangThaiThanhToan;
	}


	public void setTrangThaiThanhToan(Boolean trangThaiThanhToan) {
		this.trangThaiThanhToan = trangThaiThanhToan;
	}


	public String getMoTa() {
		return moTa;
	}


	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}


	public KhachHang getKhachHang() {
		return khachHang;
	}


	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}


	public ThanhToan getThanhToan() {
		return thanhToan;
	}


	public void setThanhToan(ThanhToan thanhToan) {
		this.thanhToan = thanhToan;
	}


	public Voucher getVoucher() {
		return voucher;
	}


	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}


	public List<ChiTietHoaDon> getListChiTietHoaDon() {
		return listChiTietHoaDon;
	}


	public void setListChiTietHoaDon(List<ChiTietHoaDon> listChiTietHoaDon) {
		this.listChiTietHoaDon = listChiTietHoaDon;
	}
	
}
