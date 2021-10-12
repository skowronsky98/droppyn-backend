package com.droppynapi.dto;

import com.droppynapi.model.Shoe;
import com.droppynapi.model.SizeChart;
import com.droppynapi.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfferDTO {
    private String _id;
    private Double price;
    private Boolean active;
    private Boolean deleted;

    private String bio;
    private ShoeDTO shoe;
    private SizeChartDTO size;
    private UserDTO user;
}
