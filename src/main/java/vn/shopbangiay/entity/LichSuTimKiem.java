package vn.shopbangiay.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * Entity implementation class for Entity: LichSuTimKiem
 *
 */
@Entity
@Table(name = "LichSuTimKiem")
public class LichSuTimKiem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaLichSuTimKiem")
	private String maLichSuTimKiem;

	@ManyToOne
	@JoinColumn(name = "SoDienThoai") 
	private KhachHang khachHang;
	
	@Column(name = "NoiDung", columnDefinition = "nvarchar(100)")
	private String noiDung;

	public LichSuTimKiem() {
		super();
	}


	public LichSuTimKiem(String maLichSuTimKiem, KhachHang khachHang, String noiDung) {
		super();
		this.maLichSuTimKiem = maLichSuTimKiem;
		this.khachHang = khachHang;
		this.noiDung = noiDung;
	}

	public String getMaLichSuTimKiem() {
		return maLichSuTimKiem;
	}

	public void setMaLichSuTimKiem(String maLichSuTimKiem) {
		this.maLichSuTimKiem = maLichSuTimKiem;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

}
