package vn.shopbangiay.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ChatLieu implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "MaChatLieu")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maChatLieu;
	
	@Column(name = "TenChatLieu")
	private String tenChatLieu;
	
	@OneToMany(mappedBy = "chatLieu",fetch = FetchType.EAGER)
	private List<SanPham> listSanPham;

	public ChatLieu() {
		super();
	}

	public ChatLieu(int maChatLieu, String tenChatLieu, List<SanPham> listSanPham) {
		super();
		this.maChatLieu = maChatLieu;
		this.tenChatLieu = tenChatLieu;
		this.listSanPham = listSanPham;
	}

	public int getMaChatLieu() {
		return maChatLieu;
	}

	public void setMaChatLieu(int maChatLieu) {
		this.maChatLieu = maChatLieu;
	}

	public String getTenChatLieu() {
		return tenChatLieu;
	}

	public void setTenChatLieu(String tenChatLieu) {
		this.tenChatLieu = tenChatLieu;
	}

	public List<SanPham> getListSanPham() {
		return listSanPham;
	}

	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}
}
