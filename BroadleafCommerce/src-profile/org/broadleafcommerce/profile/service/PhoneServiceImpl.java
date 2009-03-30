package org.broadleafcommerce.profile.service;

import java.util.List;

import javax.annotation.Resource;

import org.broadleafcommerce.profile.dao.PhoneDao;
import org.broadleafcommerce.profile.domain.Phone;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("phoneService")
public class PhoneServiceImpl implements PhoneService {

    @Resource
    private PhoneDao phoneDao;

    @Transactional(propagation = Propagation.REQUIRED)
    public List<Phone> readPhoneByUserId(Long userId) {
        return phoneDao.readPhoneByUserId(userId);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Phone savePhone(Phone phone) {
        return phoneDao.maintainPhone(phone);
    }

    public Phone readPhoneById(Long phoneId) {
        return phoneDao.readPhoneById(phoneId);
    }
}
