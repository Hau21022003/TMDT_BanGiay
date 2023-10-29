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
	@JoinColumn(name = "SoDienThoai") // giống như khai báo khóa ngoại
	private KhachHang khachHang;
	
	public HoiDap() {
		super();
	}
   
}
