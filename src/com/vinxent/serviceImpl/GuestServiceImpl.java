package com.vinxent.serviceImpl;

import java.util.List;

import com.vinxent.dao.GuestDao;
import com.vinxent.model.Guest;
import com.vinxent.service.GuestService;

/**
 * 拼客业务组件实现类
 * @author vinxent
 *
 */
public class GuestServiceImpl implements GuestService {
	
	private GuestDao guestDao;   //拼客dao接口

	@Override
	public Integer addGuest(Guest guest) {
		return guestDao.save(guest);
	}
	
	@Override
	public Guest findGuest(Integer id) {
		return guestDao.get(id);
	}

	@Override
	public void updateGuest(Guest guest) {
		guestDao.update(guest);
		
	}

	@Override
	public void deleteGuest(Guest guest) {
		guestDao.delete(guest);
		
	}

	@Override
	public void deleteGuest(Integer id) {
		guestDao.delete(id);
		
	}

	@Override
	public List<Guest> findAllGuests() {
		return guestDao.findAll();
	}

	@Override
	public boolean login(Guest guest) {
		Guest guestTemp = guestDao.findByCellphone(guest.getCellphone());
		if(guestTemp==null) {
			System.out.println("用户名不存在，无法登录");
			return false;
		}
		if (!guestTemp.getPassword().equals(guest.getPassword())) {
			System.out.println("密码不正确，无法登录");
			return false;
		}
		System.out.println("成功啦");
		return true;
	}
	
	@Override
	public boolean regist(Guest guest) {
		Guest guestTemp = guestDao.findByCellphone(guest.getCellphone());
		if(guestTemp!=null) {
			System.out.println("此手机号码已经注册");
			return false;
		}
		System.out.println(guestDao.save(guest));
		System.out.println("注册成功");
		return true;
	}
	
	
	public GuestDao getGuestDao() {
		return guestDao;
	}

	public void setGuestDao(GuestDao guestDao) {
		this.guestDao = guestDao;
	}

}
