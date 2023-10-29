package vn.shopbangiay.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: VanChuyen
 *
 */
@Entity

public class VanChuyen implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	private String tenThanhPho;
	@Column(columnDefinition = "CHECK giaVanChuyen >= 0")
	private int giaVanChuyen;
	@Column(columnDefinition = "CHECK soNgayGiaoHang >= 0")
	private int soNgayGiaoHang;
	
	public VanChuyen(String tenThanhPho, int giaVanChuyen, int soNgayGiaoHang) {
		super();
		this.tenThanhPho = tenThanhPho;
		this.giaVanChuyen = giaVanChuyen;
		this.soNgayGiaoHang = soNgayGiaoHang;
	}

	public VanChuyen() {
		super();
	}

	public String getTenThanhPho() {
		return tenThanhPho;
	}

	public void setTenThanhPho(String tenThanhPho) {
		this.tenThanhPho = tenThanhPho;
	}

	public int getGiaVanChuyen() {
		return giaVanChuyen;
	}

	public void setGiaVanChuyen(int giaVanChuyen) {
		this.giaVanChuyen = giaVanChuyen;
	}

	public int getSoNgayGiaoHang() {
		return soNgayGiaoHang;
	}

	public void setSoNgayGiaoHang(int soNgayGiaoHang) {
		this.soNgayGiaoHang = soNgayGiaoHang;
	}
   
}
