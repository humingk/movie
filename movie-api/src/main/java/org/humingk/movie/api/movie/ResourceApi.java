package org.humingk.movie.api.movie;

import org.humingk.movie.common.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

// 用于生成API文档
// import org.springframework.web.bind.annotation.RestController;
// @RestController

/**
 * 电影资源API
 *
 * @author humingk
 */
@Validated
@FeignClient("movie-server-movie")
public interface ResourceApi {
  /**
   * 电影资源详情
   *
   * @param id 豆瓣电影ID
   * @param offset 偏移量（默认0）
   * @param limit 限制数（默认10）
   * @return
   * @apiNote 包括正版资源、盗版资源、在线资源、离线资源
   */
  @RequestMapping(value = "/movie/resource/details", method = RequestMethod.GET)
  Result details(
      @RequestParam("id") @NotNull Long id,
      @RequestParam(value = "offset", required = false, defaultValue = "0") @PositiveOrZero
          Integer offset,
      @RequestParam(value = "limit", required = false, defaultValue = "10") @PositiveOrZero
          Integer limit);
}
