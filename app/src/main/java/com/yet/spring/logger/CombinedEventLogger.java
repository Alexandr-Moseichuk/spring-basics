package com.yet.spring.logger;

import com.yet.spring.bean.Event;

import java.util.List;

public class CombinedEventLogger implements EventLogger {
    private List<EventLogger> loggerList;

    public CombinedEventLogger(List<EventLogger> loggerList) {
        this.loggerList = loggerList;
    }

    @Override
    public void logEvent(Event event) {
        for (EventLogger logger : loggerList) {
            logger.logEvent(event);
        }
    }
}
