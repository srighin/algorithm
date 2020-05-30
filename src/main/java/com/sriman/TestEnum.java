package com.sriman;

public class TestEnum {

    public static void main(String[] args) {
        LineChatOutput output = new LineChatOutput();
        output.setGrafana(Stat.RECEIVE_POST_TIMER.name());

        Stat stat = Stat.valueOf(output.getGrafana());
        System.out.println(stat.name()+stat.getDeclaringClass());

    }
}

class LineChatOutput{

    private String grafana;

    public String getGrafana() {
        return grafana;
    }

    public void setGrafana(String grafana) {
        this.grafana = grafana;
    }
}
