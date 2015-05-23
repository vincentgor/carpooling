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
	

	public GuestDao getGuestDao() {
		return guestDao;
	}

	public void setGuestDao(GuestDao guestDao) {
		this.guestDao = guestDao;
	}
}
