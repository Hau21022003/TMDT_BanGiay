package vn.shopbangiay.entity;

import java.io.Serializable;
import java.sql.Date;

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
	
	private String soDienThoai;
	
	@ManyToOne
	@JoinColumn(name = "HinhThucThanhToan")
	private ThanhToan thanhToan;
	@ManyToOne
	@JoinColumn(name = "MaVoucher")
	private Voucher voucher;
	
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

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
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

	public HoaDon() {
		super();
	}
   
}
