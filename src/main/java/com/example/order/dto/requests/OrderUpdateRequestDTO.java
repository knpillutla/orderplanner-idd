package com.example.order.dto.requests;

import java.time.LocalDateTime;

import com.example.util.dto.BaseDTO;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class OrderUpdateRequestDTO extends BaseDTO{
	Long id;
	String busName;
	String locnNbr;
	String orderNbr;
	String company;
	String division;
	String busUnit;
	LocalDateTime orderDttm;
	LocalDateTime shipByDttm;
	LocalDateTime expectedDeliveryDttm;
	String deliveryType;
	boolean isGift;
	String giftMsg;
	String source;
	String transactionName;
	String refField1;
	String refField2;
	String userId;
}
