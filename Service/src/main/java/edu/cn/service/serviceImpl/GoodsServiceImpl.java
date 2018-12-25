package edu.cn.service.serviceImpl;

import edu.cn.Bill;
import edu.cn.dao.role.GoodsDao;
import edu.cn.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Bill checkBill(int id) {
        return goodsDao.checkBill(id);
    }

    @Override
    public int modify(Bill bill) {
        return goodsDao.modify(bill);
    }

    @Override
    public int deleteBillById(String billCode) {

        return goodsDao.deleteBillById(billCode);
    }

    @Override
    public boolean add(Bill bill) {
        int result = goodsDao.add(bill);
        boolean flag = false;
        if (result == 1){
            flag = true;
        }
        return flag;
    }
}
