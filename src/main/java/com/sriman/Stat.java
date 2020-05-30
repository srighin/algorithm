package com.sriman;

public enum Stat {

    RECEIVE_POST_TIMER("controller.receive.post.timer", StatType.TIMER);

    private String name;
    private StatType statType;

    Stat(String name, StatType statType) {
        this.name = name;
        this.statType = statType;
    }

    public enum StatType {
        METER, COUNTER, TIMER, GUAGE
    }
}
