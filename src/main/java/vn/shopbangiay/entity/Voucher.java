package vn.shopbangiay.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Check;

/**
 * Entity implementation class for Entity: Voucher
 *
 */
@Entity
@Check(constraints = "ngayBatDau < ngayKetThuc")
public class Voucher implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maVoucher;
	private String moTa;
	@Column(columnDefinition = "CHECK GiamGia >= 0 AND GiamGia <= 100")
	private int giamGia;
	private Date ngayBatDau;
	private Date ngayKetThuc;
	@Column(columnDefinition = "CHECK giaTienApDung >= 0")
	private int giaTienApDung;
	
	@OneToMany(mappedBy = "voucher", fetch = FetchType.EAGER)
	private List<HoaDon> listHoaDon;
	
	public Voucher() {
		super();
	}

	public Voucher(int maVoucher, String moTa, int giamGia, Date ngayBatDau, Date ngayKetThuc, int giaTienApDung,
			List<HoaDon> listHoaDon) {
		super();
		this.maVoucher = maVoucher;
		this.moTa = moTa;
		this.giamGia = giamGia;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.giaTienApDung = giaTienApDung;
		this.listHoaDon = listHoaDon;
	}

	public int getMaVoucher() {
		return maVoucher;
	}

	public void setMaVoucher(int maVoucher) {
		this.maVoucher = maVoucher;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public int getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(int giamGia) {
		this.giamGia = giamGia;
	}

	public Date getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}

	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	public int getGiaTienApDung() {
		return giaTienApDung;
	}

	public void setGiaTienApDung(int giaTienApDung) {
		this.giaTienApDung = giaTienApDung;
	}

	public List<HoaDon> getListHoaDon() {
		return listHoaDon;
	}

	public void setListHoaDon(List<HoaDon> listHoaDon) {
		this.listHoaDon = listHoaDon;
	}
}
