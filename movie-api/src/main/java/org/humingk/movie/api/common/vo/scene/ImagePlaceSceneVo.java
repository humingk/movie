package org.humingk.movie.api.common.vo.scene;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 场景地点图片
 *
 * @author humingk
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImagePlaceSceneVo implements Serializable {
  /** 场景地点图片ID */
  private Long id;

  /** 场景地点ID */
  private Long idPlaceScene;

  /** 图片链接 */
  private String urlImage;

  /** 图片描述 */
  private String description;

  private static final long serialVersionUID = 1L;
}
