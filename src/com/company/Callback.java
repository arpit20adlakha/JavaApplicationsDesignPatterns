package com.company;

public interface Callback {
    /**
     * @param result processes it
     */
    void calculated(int result);

/**
 *
 */
    void failed(String errorMSg);
}