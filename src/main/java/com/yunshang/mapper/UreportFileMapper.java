package com.yunshang.mapper;

import com.yunshang.emtity.UreportFileEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author qianzc
 * @crateDate 2020/6/10 8:23
 */
@Mapper
public interface UreportFileMapper {

    /**
     * 根据报表名称检查报表是否存在
     *
     * @param fileName 报表名称
     * @return
     */
    int checkExistByName(String fileName);

    /**
     * 根据报表名称查询报表
     *
     * @param fileName 报表名称
     * @return
     */
    UreportFileEntity queryUreportFileEntityByName(String fileName);

    /**
     * 查询全部报表
     *
     * @return
     */
    List<UreportFileEntity> queryReportFileList();

    /**
     * 根据报表名称删除报表
     *
     * @param fileName
     * @return
     */
    int deleteReportFileByName(String fileName);


    /**
     * 保存报表
     */
    int insertReportFile(UreportFileEntity entity);

    /**
     * 更新报表
     *
     * @param entity
     * @return
     */
    int updateReportFile(UreportFileEntity entity);
}
