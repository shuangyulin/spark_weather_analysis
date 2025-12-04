package com.dao;

import com.entity.TianqiinfoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TianqiinfoVO;
import com.entity.view.TianqiinfoView;


/**
 * 天气信息
 * 
 * @author 
 * @email 
 * @date 2025-03-10 13:20:33
 */
public interface TianqiinfoDao extends BaseMapper<TianqiinfoEntity> {
	
	List<TianqiinfoVO> selectListVO(@Param("ew") Wrapper<TianqiinfoEntity> wrapper);
	
	TianqiinfoVO selectVO(@Param("ew") Wrapper<TianqiinfoEntity> wrapper);
	
	List<TianqiinfoView> selectListView(@Param("ew") Wrapper<TianqiinfoEntity> wrapper);

	List<TianqiinfoView> selectListView(Pagination page,@Param("ew") Wrapper<TianqiinfoEntity> wrapper);

	
	TianqiinfoView selectView(@Param("ew") Wrapper<TianqiinfoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TianqiinfoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TianqiinfoEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TianqiinfoEntity> wrapper);

    List<Map<String, Object>> gaowenSectionStat(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TianqiinfoEntity> wrapper);
    List<Map<String, Object>> cityaqiSectionStat(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TianqiinfoEntity> wrapper);
    List<Map<String, Object>> cityjsliangSectionStat(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TianqiinfoEntity> wrapper);


}
