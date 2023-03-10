package admin.service;

import admin.dto.AdminDTO;
import admin.dto.adminAuthInfo;

public interface AdminService {
	//	회원가입(관리자 추가)
	public adminAuthInfo addAdminProcess(AdminDTO dto);
	
	//	로그인 처리
	public adminAuthInfo loginProcess(AdminDTO dto);
	
	//	DB에서 관리자 정보 수정
	public AdminDTO updateAdminProcess(String adminId);
	
	//	업데이트된 관리자 정보를 현재 세션에 적용
	public adminAuthInfo updateAdminProcess(AdminDTO dto);
	
	// 관리자 탈퇴
	public adminAuthInfo deleteAdminProcess(String adminId);
}
