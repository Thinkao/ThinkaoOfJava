package com.excel.controller;
import com.excel.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author: 王鑫垚
 * @Description:
 * @Date: Create in 22:46 2020/2/12
 */
@Controller
public class ExcelController {

    @Autowired
    private ExcelService excelService;

    @GetMapping("/upload")
    public String goUpload(){
        return "upload";
    }
    @PostMapping("/excel")
    public String upload(MultipartFile file, Model model) throws Exception {
        boolean flag = excelService.getExcel(file);
        if(flag){
            model.addAttribute("Message", "上传成功");
        }else{
            model.addAttribute("Message", "上传失败");
        }
        return "upload";
    }
    @GetMapping("/export")
    public void exportExcel(HttpServletResponse response) {
        try {
            excelService.exportExcel(response);
            System.out.println("导出成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
