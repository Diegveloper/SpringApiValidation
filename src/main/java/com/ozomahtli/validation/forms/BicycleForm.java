package com.ozomahtli.validation.forms;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class BicycleForm {
    @NotNull
    @Size(min=2, max=40)
    private String serialNumber;

    @NotNull
    private String size;

    public @NotNull String getSize() {
        return size;
    }

    public void setSize(@NotNull String size) {
        this.size = size;
    }




}
