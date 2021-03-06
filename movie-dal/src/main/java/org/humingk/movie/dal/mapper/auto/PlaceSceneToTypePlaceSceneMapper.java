package org.humingk.movie.dal.mapper.auto;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.humingk.movie.dal.entity.PlaceSceneToTypePlaceScene;
import org.humingk.movie.dal.entity.PlaceSceneToTypePlaceSceneExample;

@Mapper
public interface PlaceSceneToTypePlaceSceneMapper {
    long countByExample(PlaceSceneToTypePlaceSceneExample example);

    int deleteByExample(PlaceSceneToTypePlaceSceneExample example);

    int deleteByPrimaryKey(@Param("idPlaceScene") Long idPlaceScene, @Param("idTypePlaceScene") Byte idTypePlaceScene);

    int insert(PlaceSceneToTypePlaceScene record);

    int insertSelective(PlaceSceneToTypePlaceScene record);

    List<PlaceSceneToTypePlaceScene> selectByExample(PlaceSceneToTypePlaceSceneExample example);

    int updateByExampleSelective(@Param("record") PlaceSceneToTypePlaceScene record, @Param("example") PlaceSceneToTypePlaceSceneExample example);

    int updateByExample(@Param("record") PlaceSceneToTypePlaceScene record, @Param("example") PlaceSceneToTypePlaceSceneExample example);
}