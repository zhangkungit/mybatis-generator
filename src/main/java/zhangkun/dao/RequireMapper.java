package zhangkun.dao;

import zhangkun.model.Require;

public interface RequireMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Require record);

    int insertSelective(Require record);

    Require selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Require record);

    int updateByPrimaryKey(Require record);
}