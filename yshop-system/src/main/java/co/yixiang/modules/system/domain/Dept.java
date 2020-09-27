///**
//* Copyright (C) 2018-2020
//* All rights reserved, Designed By www.yixiang.co
//* 注意：
//* 本软件为www.yixiang.co开发研制
//*/
//package co.yixiang.modules.system.domain;
//
//import cn.hutool.core.bean.BeanUtil;
//import cn.hutool.core.bean.copier.CopyOptions;
//import com.baomidou.mybatisplus.annotation.FieldFill;
//import com.baomidou.mybatisplus.annotation.IdType;
//import com.baomidou.mybatisplus.annotation.TableField;
//import com.baomidou.mybatisplus.annotation.TableId;
//import com.baomidou.mybatisplus.annotation.TableName;
//import lombok.Data;
//
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//import java.io.Serializable;
//import java.sql.Timestamp;
//
///**
//* @author hupeng
//* @date 2020-05-14
//*/
//@Data
//@TableName("dept")
//public class Dept implements Serializable {
//
//    /** ID */
//    @TableId(value = "id",type= IdType.AUTO)
//    private Long id;
//
//
//    /** 名称 */
//    @NotBlank(message = "部门名称不能为空")
//    private String name;
//
//
//    /** 上级部门 */
//    @NotNull(message = "上级部门不能为空")
//    private Long pid;
//
//
//    /** 状态 */
//    private Boolean enabled;
//
//
//    /** 创建日期 */
//    @TableField(fill= FieldFill.INSERT)
//    private Timestamp createTime;
//
//
//    public void copy(Dept source){
//        BeanUtil.copyProperties(source,this, CopyOptions.create().setIgnoreNullValue(true));
//    }
//}
