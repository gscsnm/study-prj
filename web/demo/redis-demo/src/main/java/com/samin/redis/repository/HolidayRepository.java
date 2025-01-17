package com.samin.redis.repository;

import com.samin.redis.entity.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户仓库类
 *
 * @author samin
 * @date 2022-11-23
 */
public interface HolidayRepository extends JpaRepository<Holiday, Integer> {

}
