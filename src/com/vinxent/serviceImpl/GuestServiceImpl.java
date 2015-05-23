package com.vinxent.serviceImpl;

import java.util.List;

import com.vinxent.dao.GuestDao;
import com.vinxent.model.Guest;
import com.vinxent.service.GuestService;

/**
 * ƴ��ҵ�����ʵ����
 * @author vinxent
 *
 */
public class GuestServiceImpl implements GuestService {
	
	private GuestDao guestDao;   //ƴ��dao�ӿ�

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
			System.out.println("�û��������ڣ��޷���¼");
			return false;
		}
		if (!guestTemp.getPassword().equals(guest.getPassword())) {
			System.out.println("���벻��ȷ���޷���¼");
			return false;
		}
		System.out.println("�ɹ���");
		return true;
	}
	
	@Override
	public boolean regist(Guest guest) {
		Guest guestTemp = guestDao.findByCellphone(guest.getCellphone());
		if(guestTemp!=null) {
			System.out.println("���ֻ������Ѿ�ע��");
			return false;
		}
		System.out.println(guestDao.save(guest));
		System.out.println("ע��ɹ�");
		return true;
	}
	
	
	public GuestDao getGuestDao() {
		return guestDao;
	}

	public void setGuestDao(GuestDao guestDao) {
		this.guestDao = guestDao;
	}

}
