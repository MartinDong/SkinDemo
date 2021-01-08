package com.dong.skin;

/**
 * 支持换肤的需要继承此接口
 */
public interface SkinCompatSupportable {
    /**
     * 换肤接口
     *
     * @param isNightModel 换肤状态
     */
    void applySkin(boolean isNightModel);
}

