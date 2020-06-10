package com.yunshang.emtity;

import lombok.Data;

import java.util.Date;

/**
 * Ureport文件 实体类
 *
 * @author qianzc
 * @crateDate 2020/6/9 13:15
 */

@Data
public class UreportFileEntity {

    /**
     * 主键
     */
    private String id;
    /**
     * 文件名
     */
    private String fileName;
    /**
     * 内容
     */
    private byte[] content;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
}