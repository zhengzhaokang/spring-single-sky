package com.wc.single.sky.common.log.event;

import com.wc.single.sky.system.domain.SysOperLog;
import org.springframework.context.ApplicationEvent;

/**
 * 系统日志事件
 */
public class SysOperLogEvent extends ApplicationEvent
{
    //
    private static final long serialVersionUID = 8905017895058642111L;

    public SysOperLogEvent(SysOperLog source)
    {
        super(source);
    }
}