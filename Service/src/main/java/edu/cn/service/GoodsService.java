package edu.cn.service;

import edu.cn.Bill;

public interface GoodsService {
   //查看所有的货品信息
   public Bill checkBill(int id);
   //修改账单信息
   public int modify(Bill bill);
   //删除账单信息
   public int deleteBillById(String billCode);
   //添加账单信息
   public boolean add(Bill bill);
}
