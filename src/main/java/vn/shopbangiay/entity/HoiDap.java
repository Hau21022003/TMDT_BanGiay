package vn.shopbangiay.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: HoiDap
 *
 */
@Entity
@Table(name = "HoiDap")
public class HoiDap implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "MaHoiDap")
	private int maHoiDap;
	
	@Column(name = "NoiDungHoi", columnDefinition = "nvarchar(100)")
	private String noiDungHoi;
	
	@Column(name = "ThoiGianDoi", columnDefinition = "datetime")
	private Date thoiGianDoi;
	
	@Column(name = "NoiDungTraLoi", columnDefinition = "nvarchar(100)")
	private Date noiDungTraLoi;
	
	@Column(name = "ThoiGianTraLoi", columnDefinition = "nvarchar(100)")
	private Date thoiGianTraLoi;
	
	@ManyToOne

	@JoinColumn(name = "SoDienThoai") 

	@JoinColumn(name = "SoDienThoai") // giống như khai báo khóa ngoại

	private KhachHang khachHang;
	
	public HoiDap() {
		super();
	}

	public HoiDap(int maHoiDap, String noiDungHoi, Date thoiGianDoi, Date noiDungTraLoi, Date thoiGianTraLoi,
			KhachHang khachHang) {
		super();
		this.maHoiDap = maHoiDap;
		this.noiDungHoi = noiDungHoi;
		this.thoiGianDoi = thoiGianDoi;
		this.noiDungTraLoi = noiDungTraLoi;
		this.thoiGianTraLoi = thoiGianTraLoi;
		this.khachHang = khachHang;
	}

	public int getMaHoiDap() {
		return maHoiDap;
	}

	public void setMaHoiDap(int maHoiDap) {
		this.maHoiDap = maHoiDap;
	}

	public String getNoiDungHoi() {
		return noiDungHoi;
	}

	public void setNoiDungHoi(String noiDungHoi) {
		this.noiDungHoi = noiDungHoi;
	}

	public Date getThoiGianDoi() {
		return thoiGianDoi;
	}

	public void setThoiGianDoi(Date thoiGianDoi) {
		this.thoiGianDoi = thoiGianDoi;
	}

	public Date getNoiDungTraLoi() {
		return noiDungTraLoi;
	}

	public void setNoiDungTraLoi(Date noiDungTraLoi) {
		this.noiDungTraLoi = noiDungTraLoi;
	}

	public Date getThoiGianTraLoi() {
		return thoiGianTraLoi;
	}

	public void setThoiGianTraLoi(Date thoiGianTraLoi) {
		this.thoiGianTraLoi = thoiGianTraLoi;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

}
