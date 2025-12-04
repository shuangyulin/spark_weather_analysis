package com.entity.view;

import com.entity.TianqiinfoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 天气信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-03-10 13:20:33
 */
@TableName("tianqiinfo")
public class TianqiinfoView  extends TianqiinfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TianqiinfoView(){
	}
 
 	public TianqiinfoView(TianqiinfoEntity tianqiinfoEntity){
 	try {
			BeanUtils.copyProperties(this, tianqiinfoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
