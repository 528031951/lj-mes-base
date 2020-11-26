//package com.bpm.lj.mes.base.server.controller;
//
//import com.bpm.common.service.util.AppPushUtil;
//import com.bpm.common.service.util.ExchangeMailUtil;
//import com.bpm.lj.mes.base.common.util.ResultUtil;
//import com.bpm.lj.mes.base.common.vo.ResultVO;
//import com.bpm.lj.mes.base.server.configration.ApushConfig;
//import com.bpm.lj.mes.base.server.configration.MailConfig;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * <p>Title: ApushControoler</p>
// * <p>Description: 推送案例</p>
// * <p>Company: http://www.wootion.com/</p>
// * <p>create date: 2020/06/02</p>
// *
// * @author :tanhuan
// * @version :1.0
// */
//@RestController
//@RequestMapping(value = "/apush")
//@Api(description = "测试推送")
//public class ApushController {
//
//    @Autowired
//    private ApushConfig apushConfig;
//
//    @Autowired
//    private MailConfig mailConfig;
//
//    @ApiOperation("测试推送")
//    @RequestMapping(
//            value = {"/testPush"},
//            method = {RequestMethod.POST}
//    )
//    public ResultVO testPush(){
//        String title = "测试打印消息";
//        String txt = "您有一未读的打印消息！";
//        //全部推送
//        String s = AppPushUtil.sedPushAll(apushConfig.getAppId(),apushConfig.getAppKey(), apushConfig.getMasterSecret(),title,txt);
//        //部分推送
////        List<String> userIdList = new ArrayList<String>();
////        userIdList.add("1");
////        String s1 = AppPushUtil.sedPushUserId(apushConfig.getAppId(),apushConfig.getAppKey(), apushConfig.getMasterSecret(),title,txt,userIdList);
////        System.out.println(s);
//        System.out.println(s);
//        return ResultUtil.success();
//    }
//
//
//    @ApiOperation("测试发送邮件")
//    @RequestMapping(
//            value = {"/testMail"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO testMail() throws Exception {
//        // Outlook Web Access路径通常为/EWS/exchange.asmx
//        ExchangeMailUtil mailUtil = new ExchangeMailUtil(mailConfig.getMailServer(), mailConfig.getUser(),mailConfig.getPassword());
//        //接收人
//        String[] to = new String[]{"zhanghaifeng@cqgdcy.com"};
//        //抄送人
////        String[] cc = mailUtil.removeArrayEmpty(new String[]{"xxxxxxx@shinho.net.cn"});
//       //邮件标题
//        String subject = "";
//        //邮件内容
//        String bodyText = "";
//        // 发送邮件
//        mailUtil.send(subject, to, bodyText);
//        return ResultUtil.success();
//    }
//}
