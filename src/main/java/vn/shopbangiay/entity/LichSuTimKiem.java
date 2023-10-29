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

}
