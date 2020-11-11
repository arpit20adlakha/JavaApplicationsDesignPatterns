package Logistics;

public enum OrderPriority {
    LOW("low", 1), MEDIUM("medium", 2), HIGH("high", 3);

    private String value;
    private Integer number;

    OrderPriority(String value, Integer number) {
        this.value = value;
        this.number = number;
    }


}
