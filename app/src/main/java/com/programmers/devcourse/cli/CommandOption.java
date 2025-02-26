package com.programmers.devcourse.cli;

public enum CommandOption {
    INQUIRY(1),
    CALCULATE(2),
    EXIT(3),

    NOT_VALID(4),
    ERROR(5);

    private final int value;

    CommandOption(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
