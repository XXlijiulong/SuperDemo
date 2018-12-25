package edu.cn.dao.role;

import edu.cn.Bill;

/**
 * 对应要注入的实现类没有 加注解，如dao层 @Repository 如service层 @Service
 * 在相应的实现类加上注解即可
 */
public interface GoodsDao {
   //查看所有的货品信息
   public Bill checkBill(int id);
   //修改账单信息
   public int modify(Bill bill);
   //删除账单信息
   public int deleteBillById(String billCode);
   //添加账单信息
   public int add(Bill bill);
}
