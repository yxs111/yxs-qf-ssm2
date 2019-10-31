package com.qf.controller;

import com.qf.domain.Shoper;
import com.qf.service.ShopPicService;
import com.qf.service.ShopperService;
import com.qf.utils.PageUtil;
import com.qf.utils.UploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/5/29.
 */
@Controller
@RequestMapping("/shoper")
public class ShoperController {
    @Autowired
    private ShopPicService shopPicService;
    @Autowired
    private ShopperService shopperService;
    @Autowired
    private UploadUtils uploadUtils;

    //    @Autowired
//    private PageUtil pageUtil;
    @RequestMapping("/selectAll")
    public String selectAll(Model model, Shoper shoperInfo, PageUtil pageP) {


        PageUtil page = new PageUtil();
        //pageSize默认为10  currentPage默认为1
        page.setPageSize(pageP.getPageSize());
        page.setCurrentPage(pageP.getCurrentPage());
        //mysql中用 --这里用limit a,b 去分页，数据量比较大时不推荐limit
        //a表示起始行，b表示数量，如 limit 0,5 表示查5条数据，从数据库中的第一条查起
        shoperInfo.setStartRow(page.getStartRow());
        shoperInfo.setEndRow(page.getEndRow() - page.getStartRow());
        List<Shoper> shoperList = shopperService.selectAll(shoperInfo);
        System.out.println(shoperList);
        int count = shopperService.selectAllCount(shoperInfo);
        page.setTotalRecord(count);
//        if((shoperInfo.getUserName()!=null&&!"".equals(shoperInfo.getUserName()))
//                ||(shoperInfo.getLoginName()!=null&&!"".equals(shoperInfo.getLoginName()))){
//            page.setTotalRecord(shoperList.size());
//        }else{
//            //page.setTotalRecord(count);
//        }

        model.addAttribute("shoperList", shoperList);
        model.addAttribute("page1", page);
        model.addAttribute("shoperInfo1", shoperInfo);
        return "shoper/shoperManager";
    }

    @RequestMapping("/addShoper")
    public String addUser(Shoper shoperInfo, Model model, String myid, @RequestParam("file") MultipartFile file) {

        Integer picId = null;
        String str = file.getOriginalFilename();
        if (file != null && str != null && !str.equals("")) {
            picId = uploadUtils.savePic(file);
            shoperInfo.setPosPic(picId);
        }
        if (myid == null) {
            Shoper shopPos1 = shopperService.selectShoperByName(shoperInfo);
            if (shopPos1 != null) {
                model.addAttribute("msg", "新增失败，该登录名已存在");

        } else {

//            shoperInfo.setId(Integer.parseInt(myid));
//            shopperService.updateShopperById(shoperInfo);
//            model.addAttribute("msg", "编辑成功！");
                shoperInfo.setPosTime(new Date());
                shopperService.insertShopper(shoperInfo);
                model.addAttribute("msg", "新增成功");
            }

        }else {
                shoperInfo.setId(Integer.parseInt(myid));
                shopperService.updateShopperById(shoperInfo);
                model.addAttribute("msg", "编辑成功！");


//            shoperInfo.setPosTime(new Date());
//            shopperService.insertShopper(shoperInfo);
//            model.addAttribute("msg", "新增成功");
        }


        return "redirect:/shoper/selectAll";
    }

    @RequestMapping("/del")
    @ResponseBody
    public String del(int id) {
        try {
            shopperService.deleteShopperById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("selectShoperById")
    @ResponseBody
    public Shoper selectShoperById(int id, Model model){
            //一个商户对象
            Shoper shoperInfo = shopperService.selectShopperById(id);
            return shoperInfo;
//        Integer picId=null;
//        if (!file.isEmpty()){
//            //图片id
//            picId= uploadUtils.savePic(file);
//
//            ShopPic shopPic = shopPicService.selectById(picId);
//
//            String path = shopPic.getPath();


//        System.out.println("&&&&&&&"+id);
//
//        System.out.println(shoperInfo+"*******");
//        return shoperInfo;


//    @RequestMapping("selectShoperByName")
//    @ResponseBody
//    public Shoper selectShoperByName(Shoper shoper, Model model){
//        Shoper shoperInfo = shopperService .selectShoperByName(shoper);
//        System.out.println(shoperInfo+"*******");
//        return shoperInfo;
//
//    }

        }
    }
