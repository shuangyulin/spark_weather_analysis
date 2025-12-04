package com.entity.vo;

import com.entity.TianqiinfoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 天气信息
 * @author 
 * @email 
 * @date 2025-03-10 13:20:33
 */
public class TianqiinfoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 日期
	 */
	
	private String riqi;
		
	/**
	 * 白天
	 */
	
	private String baitian;
		
	/**
	 * 晚上
	 */
	
	private String wanshang;
		
	/**
	 * 高温(℃)
	 */
	
	private Double gaowen;
		
	/**
	 * 低温(℃)
	 */
	
	private Double diwen;
		
	/**
	 * 空气质量指数
	 */
	
	private Double aqi;
		
	/**
	 * 风向
	 */
	
	private String fengxiang;
		
	/**
	 * 降水量
	 */
	
	private Double jsliang;
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(String riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public String getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：白天
	 */
	 
	public void setBaitian(String baitian) {
		this.baitian = baitian;
	}
	
	/**
	 * 获取：白天
	 */
	public String getBaitian() {
		return baitian;
	}
				
	
	/**
	 * 设置：晚上
	 */
	 
	public void setWanshang(String wanshang) {
		this.wanshang = wanshang;
	}
	
	/**
	 * 获取：晚上
	 */
	public String getWanshang() {
		return wanshang;
	}
				
	
	/**
	 * 设置：高温(℃)
	 */
	 
	public void setGaowen(Double gaowen) {
		this.gaowen = gaowen;
	}
	
	/**
	 * 获取：高温(℃)
	 */
	public Double getGaowen() {
		return gaowen;
	}
				
	
	/**
	 * 设置：低温(℃)
	 */
	 
	public void setDiwen(Double diwen) {
		this.diwen = diwen;
	}
	
	/**
	 * 获取：低温(℃)
	 */
	public Double getDiwen() {
		return diwen;
	}
				
	
	/**
	 * 设置：空气质量指数
	 */
	 
	public void setAqi(Double aqi) {
		this.aqi = aqi;
	}
	
	/**
	 * 获取：空气质量指数
	 */
	public Double getAqi() {
		return aqi;
	}
				
	
	/**
	 * 设置：风向
	 */
	 
	public void setFengxiang(String fengxiang) {
		this.fengxiang = fengxiang;
	}
	
	/**
	 * 获取：风向
	 */
	public String getFengxiang() {
		return fengxiang;
	}
				
	
	/**
	 * 设置：降水量
	 */
	 
	public void setJsliang(Double jsliang) {
		this.jsliang = jsliang;
	}
	
	/**
	 * 获取：降水量
	 */
	public Double getJsliang() {
		return jsliang;
	}
			
}
