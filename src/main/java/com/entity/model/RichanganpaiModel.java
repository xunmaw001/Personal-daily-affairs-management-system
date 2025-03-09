package com.entity.model;

import com.entity.RichanganpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 日常安排
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class RichanganpaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 安排名称
     */
    private String richanganpaiName;


    /**
     * 安排类型
     */
    private Integer richanganpaiTypes;


    /**
     * 安排时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date anpaiTime;


    /**
     * 安排详情
     */
    private String richanganpaiContent;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：安排名称
	 */
    public String getRichanganpaiName() {
        return richanganpaiName;
    }


    /**
	 * 设置：安排名称
	 */
    public void setRichanganpaiName(String richanganpaiName) {
        this.richanganpaiName = richanganpaiName;
    }
    /**
	 * 获取：安排类型
	 */
    public Integer getRichanganpaiTypes() {
        return richanganpaiTypes;
    }


    /**
	 * 设置：安排类型
	 */
    public void setRichanganpaiTypes(Integer richanganpaiTypes) {
        this.richanganpaiTypes = richanganpaiTypes;
    }
    /**
	 * 获取：安排时间
	 */
    public Date getAnpaiTime() {
        return anpaiTime;
    }


    /**
	 * 设置：安排时间
	 */
    public void setAnpaiTime(Date anpaiTime) {
        this.anpaiTime = anpaiTime;
    }
    /**
	 * 获取：安排详情
	 */
    public String getRichanganpaiContent() {
        return richanganpaiContent;
    }


    /**
	 * 设置：安排详情
	 */
    public void setRichanganpaiContent(String richanganpaiContent) {
        this.richanganpaiContent = richanganpaiContent;
    }
    /**
	 * 获取：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：记录时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
