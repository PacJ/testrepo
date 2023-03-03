package admin.dao;

import admin.dto.AdminDTO;
import user.dto.AuthInfo;

public interface AdminDAO {
	
	// 관리자 추가
	public int addAdmin(AdminDTO dto);
	
	//관리자 수정(비밀번호 변경)
	public void updateAdmin(AdminDTO dto);
	
	// 관리자 삭제
	public void deleteAdmin(AdminDTO dto);
}
