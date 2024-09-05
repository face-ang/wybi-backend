//package com.yupi.springbootinit.manager;
//
//import com.yupi.springbootinit.common.ErrorCode;
//import com.yupi.springbootinit.exception.BusinessException;
//import org.redisson.api.RRateLimiter;
//import org.redisson.api.RateIntervalUnit;
//import org.redisson.api.RateType;
//import org.redisson.api.RedissonClient;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//
///**
// * 专门提供 RedisLimiter 限流基础服务的（提供了通用的能力）
// */
//@Service
//public class RedisLimiterManager {
//    @Resource
//    private RedissonClient redissonClient;
//
//    public void doRateLimit(String key) {
//        // 创建一个名称为 key 的限流器，每秒最多访问 2 次
//        RRateLimiter rateLimiter = redissonClient.getRateLimiter(key);
//        rateLimiter.trySetRate(RateType.OVERALL, 2, 1, RateIntervalUnit.SECONDS);
//        // 每当一个操作来了后，请求一个令牌
//        boolean canOp = rateLimiter.tryAcquire(1);
//        if (!canOp) {
//            throw new BusinessException(ErrorCode.TO_MANY_REQUEST);
//        }
//
//    }
//}
