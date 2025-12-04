package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TianqiinfoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TianqiinfoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TianqiinfoView;


/**
 * 天气信息
 *
 * @author 
 * @email 
 * @date 2025-03-10 13:20:33
 */
public interface TianqiinfoService extends IService<TianqiinfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TianqiinfoVO> selectListVO(Wrapper<TianqiinfoEntity> wrapper);
   	
   	TianqiinfoVO selectVO(@Param("ew") Wrapper<TianqiinfoEntity> wrapper);
   	
   	List<TianqiinfoView> selectListView(Wrapper<TianqiinfoEntity> wrapper);
   	
   	TianqiinfoView selectView(@Param("ew") Wrapper<TianqiinfoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TianqiinfoEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<TianqiinfoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<TianqiinfoEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<TianqiinfoEntity> wrapper);

    List<Map<String, Object>> gaowenSectionStat(Map<String, Object> params,Wrapper<TianqiinfoEntity> wrapper);
    List<Map<String, Object>> cityaqiSectionStat(Map<String, Object> params,Wrapper<TianqiinfoEntity> wrapper);
    List<Map<String, Object>> cityjsliangSectionStat(Map<String, Object> params,Wrapper<TianqiinfoEntity> wrapper);


}

