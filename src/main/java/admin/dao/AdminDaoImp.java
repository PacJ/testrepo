package admin.dao;

import org.apache.ibatis.session.SqlSession;

import admin.dto.AdminDTO;

public class AdminDaoImp implements AdminDAO{

	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int addAdmin(AdminDTO dto) {
		return sqlSession.insert("admin.addAdmin", dto);
	}

	@Override
	public void updateAdmin(AdminDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdmin(AdminDTO dto) {
		// TODO Auto-generated method stub
		
	}


	

}
