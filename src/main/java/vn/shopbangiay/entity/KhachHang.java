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
	private int soDienThoai;

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

	@OneToMany(mappedBy = "khachHang", fetch = FetchType.EAGER)
	private List<LichSuTimKiem> lichSuTimKiem; 
	
	@OneToMany(mappedBy = "khachHang", fetch = FetchType.EAGER)
	private List<HoiDap> hoiDap; 

	public KhachHang() {
		super();
	}

	
}
