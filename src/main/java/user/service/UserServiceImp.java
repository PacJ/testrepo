package user.service;


import user.dao.UserDAO;
import user.dto.AuthInfo;
import user.dto.UserDTO;

public class UserServiceImp implements UserService{
	private UserDAO userDao;
	
	public UserServiceImp() {
		// TODO Auto-generated constructor stub
	}
	
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public AuthInfo addUserProcess(UserDTO dto) {
		userDao.insertUser(dto);
		return new AuthInfo(dto.getUserId(), dto.getUserPw());
	}

	@Override
	public AuthInfo loginProcess(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO updateUserProcess(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthInfo updateUserProcess(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthInfo deleteUserProcess(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
