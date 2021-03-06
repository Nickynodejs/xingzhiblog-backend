package com.xingzhi.xingzhiblog.controller.timeline;

import com.xingzhi.xingzhiblog.common.result.ResponseObject;
import com.xingzhi.xingzhiblog.common.result.ResponseUtil;
import com.xingzhi.xingzhiblog.domain.vo.TimeLineVO;
import com.xingzhi.xingzhiblog.service.TimeLineService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: xingzhiblog
 * @description: 归档相关
 * @author: 行之
 * @create: 2021-01-09 17:41
 **/
@RestController
@RequestMapping("api/timeline")
@Api(tags="归档相关操作")
public class TimeLineController {

    @Autowired
    private TimeLineService timeLineService;

    @GetMapping("/all")
    @ApiOperation("获取归档列表数据")
    public ResponseObject getTimeLineData() {
        ResponseUtil responseUtil = new ResponseUtil();
        List<TimeLineVO> timeLineVOList = timeLineService.getAllArticleDate();
        return responseUtil.success(timeLineVOList);
    }

}
