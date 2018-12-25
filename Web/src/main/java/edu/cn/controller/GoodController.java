package edu.cn.controller;

import edu.cn.Bill;
import edu.cn.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class GoodController {

    @Autowired
    private GoodsService goodsServiceImpl;
    //用get请求实现查询
    @RequestMapping(value="/Bill/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Bill getBillByproductName(@PathVariable("id") int id){
        return goodsServiceImpl.checkBill(id);
    }

    //delete请求删除账单
    @RequestMapping(value="/Bill/{billCode}",method = RequestMethod.DELETE)
    @ResponseBody
    public String   deleteBillBybillCode(@PathVariable("billCode") String billCode){
        int temp =goodsServiceImpl.deleteBillById(billCode);
        if (temp == 1){
            return "删除账单成功";
        }else{
            return "删除账单失败";
        }
    }

    //添加账单
    @RequestMapping(value="/addBill",params = { "id","billCode" })
    @ResponseBody
    public String  addBill(Bill bill){
        boolean  temp = goodsServiceImpl.add(bill);
        System.out.println(temp);
        if (temp == true){
            return "增加账单成功";
        }else{
            return "增加账单失败";
        }
    }

    //修改账单
    @RequestMapping(value="/Book/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public String modifyBook(@PathVariable int id,
                           @RequestParam String billCode,
                           @RequestParam String productName,
                           @RequestParam String productDesc,
                           @RequestParam String productUnit,
                           @RequestParam int productCount,
                           @RequestParam double totalPrice,
                           @RequestParam int isPayment,
                           @RequestParam int createdBy,
                           @RequestParam String creationDate,
                           @RequestParam int modifyBy,
                           @RequestParam String modifyDate,
                           @RequestParam int  providerId){
                Bill bill = new Bill(id,billCode,productName,productDesc,productUnit,productCount,totalPrice,isPayment,createdBy,creationDate,modifyBy,modifyDate,providerId);

                System.out.println(bill);
                int temp = goodsServiceImpl.modify(bill);

                if(temp == 1){
                    return "修改成功";
                }else{
                    return "修改失败";
                }
    }

}
