import vn.shopbangiay.Dao.ChiTietSanPhamDao;
import vn.shopbangiay.Dao.HinhAnhSanPhamDao;
import vn.shopbangiay.Dao.HoaDonDao;
import vn.shopbangiay.Dao.KichCoDao;
import vn.shopbangiay.Dao.ThanhToanDao;
import vn.shopbangiay.Dao.VoucherDao;
import vn.shopbangiay.entity.ChiTietSanPham;
import vn.shopbangiay.entity.HinhAnhSanPham;
import vn.shopbangiay.entity.HoaDon;
import vn.shopbangiay.entity.KichCo;
import vn.shopbangiay.entity.ThanhToan;
import vn.shopbangiay.entity.Voucher;

public class Test {
	public static void main(String[] args) {
		try {
			HoaDonDao dao = new HoaDonDao();
			for(HoaDon p: dao.findAll()) {
				System.out.println(p.getSoDienThoai());
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return;
	}
}
