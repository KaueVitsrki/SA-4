package com.RentRight.RentRight.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class ReservationOutputDTO {

    private Long id;
    private String checkin;
    private String checkout;
    private String reserveStatus;
    private Double rentalPrice;

}
